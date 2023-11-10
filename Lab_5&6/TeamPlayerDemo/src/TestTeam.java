import java.util.Scanner;
public class TestTeam {
	public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int choice;
	do {
			System.out.println("Menu\n 1.Add New Team\n 2.Display All Team\n 3.Search Team By Captain\n 4.Search Team By Player Name\n 5.exit");
			System.out.println("Enter Your Choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				TeamService.AddNewTeam();
				break;
			case 2:
				TeamService.DisplayAllTeam();
				break;
			case 3:
				System.out.println("Enter Captain name: ");
				sc.nextLine();
				String cnm=sc.nextLine();
				Team P=TeamService.SearchTByCName(cnm);
				if(P!=null) {
					System.out.println(P);
				}
				else {
					System.out.println("Enter Valid Captain Name!!");
				}
				break;
			case 4:
				System.out.println("Enter Player name: ");
				sc.nextLine();
				String pnm=sc.nextLine();
				Team T=TeamService.SearchTByPlayer(pnm);
				if(T!=null) {
					System.out.println(T);
				}
				else {
					System.out.println("Enter Valid Player Name!!");
				}
				break;
			case 5:
				System.out.println("Thank You For Coming");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
			}
		
		}while(choice!=5);
	
	}
}
