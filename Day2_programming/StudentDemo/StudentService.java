import java.util.Scanner;
public class StudentService {
	static Student[] sarr;
	static int cnt;
	static {
		cnt=0;
		sarr=new Student[10];	
	}
	public static void AddNewStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name=sc.nextLine();
		System.out.println("Enter 3 Marks");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		sarr[cnt]=new Student(name,m1,m2,m3);
		cnt++;
	}
	public static void DisplayAll() {
		for(int i=0;i<cnt;i++) {
			System.out.println(sarr[i]);
		}
	}
	public static Student SearchById(String id) {
		for(int i=0;i<cnt;i++) {
			if(sarr[i].getsid().equals(id)) {
				return sarr[i];
			}
		}
		return null;
	}
	public static int UpdateMarksById(String sid,int m1,int m2,int m3) {
		for(int i=0;i<cnt;i++) {
			if(sarr[i].getsid()==sid) {
				sarr[i].setm1(m1);
				sarr[i].setm2(m2);
				sarr[i].setm3(m3);
				return 1;
			}
		}
		return -1;
		
	}
	public static Student[] DisplayByName(String nm) {
		Student[] t=new Student[5];
		int count=0;
		for(int i=0;i<cnt;i++) {
			if(sarr[i].getName().equals(nm)) {
				t[count]=sarr[i];
				count++;
			}
		}
		if(count>0) {
		return t;
		}
		else
			return null;
	}
}
