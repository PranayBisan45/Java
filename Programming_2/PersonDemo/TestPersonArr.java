import java.util.Scanner;
public class TestPersonArr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("Menu\n 1.Add New Person\n 2.Display All\n 3.Search by id\n 4.Update Mobile by id\n 5. display by name\n 6. DeleteById\n 7.exit\n choice:  ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				PersonService.AddNewPerson();
				break;
			case 2:
				PersonService.DisplayAll();
				break;
			case 3:
				System.out.println("Enter Id: ");
				int id=sc.nextInt();
				Person ob=PersonService.SearchById(id);
				if(ob!=null) {
				System.out.println(ob);
				}
				else {
					System.out.println("Not Found: "+ob);
				}
				break;
			case 4:
				System.out.println("Enter ID: ");
				 id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Mobile: ");
				String mid=sc.nextLine();
				
				boolean a=PersonService.UpdateMobile(id,mid);
				if(a) {
						System.out.println("Mobile Number Updated.");
				}
				
				else
					System.out.println("Id not valid.");
				break;
				
			case 5:
				sc.nextLine();
				System.out.println("Enter a Name: ");
				String nm=sc.nextLine();
				Person[] N=PersonService.DisplayByName(nm);
				if(N!=null) {
					for(Person p:N) {
						if(p!=null) {
					System.out.println(p);
						}
					}
					
				}else{
						System.out.println("Not Found");
					}
				break;
			case 6:
				System.out.println("Enter ID: ");
			    id=sc.nextInt();
				boolean b=PersonService.DeleteById(id);
				if(b) {
					System.out.println("Person Deleted.");
				}
				else
				System.out.println("Id not found");
				break;
			case 7:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Enter Valid Choice");
			}	
		}while(choice!=7);
		sc.close();
	
	}
}
