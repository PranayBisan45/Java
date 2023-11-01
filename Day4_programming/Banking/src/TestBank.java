import java.util.ArrayList;
import java.util.Scanner;

public class TestBank {
	public static void main(String[] args) {
		
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1: Create Account \n2: Display Account \n3: Delete Account "
					+"\n4: Deposit Money \n5: Withdraw Money \n6: Display Interest "
					+ "\n7: Display Eligibility For Loan \n8: Display Transactions \n9: Exit");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				BankServices.createAccount();
				break;
				
			case 2:
				BankServices.displayAccount();
				break;
				
			case 3:
				BankServices.deleteAccount();
				break;
				
			case 4 :
				boolean p4 = BankServices.depositMoney();
				if(!p4) {
					System.out.println("Acc not found");
				}
				break;
				
			case 5 :
				boolean p5 = BankServices.withdrawMoney();
				if(!p5) {
					System.out.println("Acc not found");
				}
				break;
				
			case 6 :
				BankServices.addInterest();
				break;
				
			case 7 :
				Boolean flag = BankServices.loanEligibility();
				if(!flag) {
					System.out.println("Not Eligible for loan");
				}
				else {
					System.out.println("Eligible for loan");
				}
				break;
				
			case 8:
				ArrayList trans =  BankServices.displayTransaction();
				System.out.print(trans.get(0));
				System.out.println(", Balance="+trans.get(1)+" ]");
				break;
			case 9:
				System.out.println("Thankyou for using our services");
				System.exit(0);
				break;
			default:
				System.out.println("Enter proper process to be executed");
			}
		}while(choice != 9);
	}

}
