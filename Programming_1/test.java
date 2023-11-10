import java.util.Scanner;
public class test {
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		int choice;
		
		
		
		do {
			System.out.println("Menu: ");
			System.out.println("1.Print Table.");
			System.out.println("2.Prime Number.");
			System.out.println("3.Display Pattern.");
			System.out.println("4.Exit");
			System.out.println("Enter The Choice Number..");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				menuServices.PrintTable();
				break;
			case 2:
				menuServices.PrimeNumber();
				break;
			case 3:
				menuServices.DisplayPattern();
				break;
			case 4:
				System.out.println("Exit");
				System.exit(0);
				
				break;
			default :
				System.out.println("Enter a Valid Choice!!");
					
			}
			
		}while(choice!=4); 
		sc.close();
	}
	
}
