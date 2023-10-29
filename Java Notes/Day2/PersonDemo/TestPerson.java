
public class TestPerson {
	public static void main(String [] args) {
		Person p=new Person(14,"Dnyanendra","2222");
		System.out.println(p);
		p.setMobile("8530");
		String a= p.getMobile();
		System.out.println(a);
		
		Person p1=new Person(15,"Dnyanendra","1323");
		System.out.println(p1);
	}
}
