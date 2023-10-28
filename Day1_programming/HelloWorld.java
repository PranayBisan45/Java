import java.util.Scanner;
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int sum=sc.nextInt();
		System.out.println("Sum is"+sum);
		sc.close();
	}
}
