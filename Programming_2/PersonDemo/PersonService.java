import java.util.Scanner;
public class PersonService {
	static Person[] parr;
	static int cnt;
	static {
		parr=new Person[10];
		parr[0]=new Person(1,"Dnyanendra","8530");
		parr[1]=new Person(2,"Abhay","7666");
		parr[2]=new Person(3,"Sujit","8776");
		cnt=3;
	}
	public static void AddNewPerson() {
		Scanner c=new Scanner(System.in);
		System.out.println("Enter id: ");
		int i=c.nextInt();
		c.nextLine();//check
		System.out.println("Enter Name: ");
		String n=c.nextLine();
		System.out.println("Enter Mobile: ");
		String m=c.next();
		parr[cnt]=new Person(i,n,m);
		cnt++;
		

		}
	public static void DisplayAll() {
		for(int i=0;i<cnt;i++) {
			System.out.println(parr[i]);
		}
	}
	public static Person SearchById(int val) {
		/*for(int i=0;i<cnt;i++) {
			if(parr[i].getPid()==val) 
				return parr[i];
		}
		return null;*/
		for(Person P:parr) {
			if(P!=null){
				if(P.getPid()==val) {
					return P;
				}}
				else {
					return null;
				}
			}
		
		return null;
	}
	
	public static boolean UpdateMobile(int id,String mo) {
		Scanner sc=new Scanner(System.in);
		 
		Person p=SearchById(id);
		if(p!=null) {
			sc.nextLine();
			System.out.println("Do You wnat to update your mobile?(y/n)");
			String ans=sc.nextLine();
			if(ans.equals(ans)) {
				p.setMobile(mo);
			}
			return true;
		}
		return false;
//		for(int i=0;i<cnt;i++) {
//			if(parr[i].getPid()==id) {
//				parr[i].setMobile(mo);
//				return 1;
//			}
//		}
//		return -1;

	}
	public static Person[] DisplayByName(String nm) {
		Person[] temp=new Person[10];
		int count=0;
		for(int i=0;i<cnt;i++) {
			if(parr[i].getPname().equals(nm)) {
				temp[count]=parr[i];
				count++;
			}
		}
			if(count>0) {
				return temp	;
			}
			return null;	
		
	}
	public static boolean DeleteById( int id) {
		boolean flag=false;
		int i;
		for( i=0;i<cnt;i++) {
			if(parr[i].getPid()==id) {
				flag=true;
				break;
			}
		}
		if(flag) {
		for(int j=i;j<cnt;j++) {
			parr[j]=parr[j+1];
		}
		cnt--;
		return true;
		}
		return false;
	}
	
	
}
