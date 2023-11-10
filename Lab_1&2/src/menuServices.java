import java.util.Scanner;
public class menuServices {
	public static void PrintTable() {
		Scanner c=new Scanner(System.in);
		System.out.println("Enter a number for printing table: ");
		int a=c.nextInt();
		int b;
		for(int i=1;i<=10;i++) {
			b=a*i;
			System.out.println(a+"*"+i+"="+b);
		}
		
	}
	public static void PrimeNumber() {
		Scanner c=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int b=c.nextInt();
		int cnt=0;
		for(int i=1;i<=b;i++) {
			if (b%i==0) {
				cnt++;
			}
		}
		if(cnt==2) {
			System.out.println(b+" is a Prime Number.");
		}
		else
			System.out.println(b+" is not a Prime Number.");
		
	}
	public static void DisplayPattern() {
		Scanner c=new Scanner(System.in);
		System.out.println("Enter a row number: ");
		int n=c.nextInt();
		int spacecnt=(int)(n/2);
		for(int i=1;i<=n;i=i+2) {
			String s="";
			for(int j=1;j<=spacecnt;j++) {
				s=s+" ";
			}
			spacecnt=spacecnt-1;
			String star="";
			for(int k=1;k<=i;k++) {
				star=star+"*";
			}
			System.out.println(s+star);
		}
		spacecnt=1;
		for(int i=n-2;i>=1;i=i-2) {
			String s="";
			for(int j=1;j<=spacecnt;j++) {
				s=s+" ";
			}
			String star="";
			for(int k=i;k>=1;k--) {
				star=star+"*";
			}
			System.out.println(s+star);
			spacecnt=spacecnt+1;
		}
		

	}
}

