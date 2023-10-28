
public class TestBook {
	public static void main(String[] args) {
		Book b= new Book();
		Book.Lesson l=b.new Lesson();
		l.l1();
		
		OuterClass.InnerClass ob1 = new OuterClass.InnerClass();
		//if lesson is static
		//book.lesson l=new book.lesson()
		ob1.test();
	}
}
