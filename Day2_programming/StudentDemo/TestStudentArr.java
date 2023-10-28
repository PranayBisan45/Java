import java.util.Scanner;

public class TestStudentArr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("Menu\n 1.Add New Person\n 2.Display All\n 3.Search by id\n 4.Update Mobile by id\n 5. display by name\n 6. exit\n choice:  ");
			System.out.println("Enter Choice ");
			choice=sc.nextInt();
			switch(choice){
			case 1:
				StudentService.AddNewStudent();
				break;
			
			case 2:
				StudentService.DisplayAll();
				break;
				
			case 3:
				sc.nextLine();
				System.out.println("Enter Id: ");
				String id=sc.nextLine();
				Student ob=StudentService.SearchById(id);
				if(ob!=null) {
					System.out.println(ob);
				}
				else{
					System.out.println("Invalid Id");
				};
				break;
				
			case 4:
				System.out.println("Enter Id: ");
				String sid=sc.nextLine();
				System.out.println("Enter 3 marks: ");
				int m1=sc.nextInt();
				int m2=sc.nextInt();
				int m3=sc.nextInt();
				int s=StudentService.UpdateMarksById(sid,m1,m2,m3);
				if(s==1) {
					System.out.println("Successfull");
				}
				else
					System.out.println("Id not found");
				
				break;
			case 5:
				sc.nextLine();
				System.out.println("Enter name: ");
				String nm=sc.nextLine();
				Student[] n= StudentService.DisplayByName(nm);
				for(Student S: n) {
				if(S!=null) {
					System.out.println(S);
				}
				else System.out.println("Name not found");
				}
				break;
			case 6:
				System.out.println("System Off");
				System.exit(0);
				break;
				default:
				{
					System.out.println("Invalid Choice");
				}
			}
			
		}while(choice!=6);
	}

}
