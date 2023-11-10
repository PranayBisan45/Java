
public class Book {
	private int bkid;
	private String bname,author;
	class Lesson{
		private int lessonid;
		private String Lname;
		public void l1() {
			System.out.println("Inside lesson"+bkid);
		}
	}
	public Book() {
		super();

	}
	public Book(int bkid, String bname, String author) {
		super();
		this.bkid = bkid;
		this.bname = bname;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bkid=" + bkid + ", bname=" + bname + ", author=" + author + "]";
	}
	
	
	
}
