import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class BankServices {
	
	static BasicBank[] barr = new BasicBank[100];
	static int count;
	static {
		count = 0;
	}
	
	public static void createAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Account Holder Name :");
		String acname = sc.nextLine();
		System.out.print("Enter Date of Birth : ");
		String dob = sc.nextLine();
		barr[count] = new BasicBank(acname,dob);
		count++;
	}

	public static void displayAccount() {
		for(int i=0;i<count;i++) {
			System.out.println(barr[i]);
			System.out.println("-------------------------");
		}
	}

	public static void deleteAccount() {
		System.out.print("Enter Account Number to be deleted : ");
		Scanner sc = new Scanner(System.in);
		long acc = sc.nextLong();
		for(int i=0;i<count;i++) {
			if(acc == barr[i].getAccno() ) {
				{
					while(i<count) {
					barr[i]=barr[i+1];
					i++;
					}
					count--;
				}
			}
		}
	}

	public static boolean depositMoney() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Account Number : ");
		long acn = sc.nextLong();
		for(int i=0;i<count;i++) {
			if(acn == barr[i].getAccno()) {
				System.out.print("Enter Amount to be Deposited : ");
				int depositAmount = sc.nextInt();
				barr[i].setBalance(barr[i].getBalance() +depositAmount);
				LocalDateTime localDate = LocalDateTime.now();
				Transaction t1 = new Transaction(localDate,depositAmount,0);
				barr[i].setT(t1);
				return true;
			}
			
		}
		return false;
	}

	public static boolean withdrawMoney() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Account Number : ");
		long acn = sc.nextLong();
		for(int i=0;i<count;i++) {
			if(acn == barr[i].getAccno()) {
				System.out.print("Enter Amount to be withdrawn");
				int withdrawAmount = sc.nextInt();
				barr[i].setBalance(barr[i].getBalance() - withdrawAmount);
				LocalDateTime localDate = LocalDateTime.now();
				Transaction t1 = new Transaction(localDate,0,withdrawAmount);
				barr[i].setT(t1);
				 return true;
			}
		}
		return false;
	}

	public static void addInterest() {
		int interest = 0;
		BasicBank temp = new BasicBank();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Account Number : ");
		long acn = sc.nextLong();
		for(int i=0;i<count;i++) {
			if(acn == barr[i].getAccno()) {
				System.out.print("Display number of months : ");
				int month = sc.nextInt();
				interest = (int)BasicBank.roi * month;
				System.out.println("Interest is :"+interest);
			}
		}
	}

	public static ArrayList displayTransaction() {
		Scanner sc = new Scanner(System.in);
		ArrayList trans= new ArrayList();
		System.out.print("Enter Account Number : ");
		long acn = sc.nextLong();
		for (int i = 0; i < count; i++) {
			if (barr[i]!=null) {
				if (barr[i].getAccno()==acn) {
					trans.add(barr[i].getT());
					trans.add(barr[i].getBalance());
					return trans;
				}
			}
			else {
				return null;
			}
		}
		return null;
	}

	public static boolean loanEligibility() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Account Number : ");
		long acn = sc.nextLong();
		for (int i = 0; i < count; i++) {
			if (barr[i]!=null) {
				if(barr[i].getAccno()==acn) {
					LocalDate localDate = LocalDate.now();
					LocalDate DOB = LocalDate.parse(barr[i].getDob(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
					if((localDate.getYear() - DOB.getYear()) > 25) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
