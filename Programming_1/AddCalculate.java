import java.util.Scanner;
public class AddCalculate {
	public static void main(Scanner[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1=sc.nextInt();
		System.out.println("Enter number 1");
		int num2=sc.nextInt();
		int ans=Nservices.Addition(num1,num2);
		System.out.println("Addition of two digits: "+ans);
		int ans1=Nservices.AddDigits(num1);
		System.out.println("Addition of digits: "+ans1);
		sc.close();
		
	}

}
