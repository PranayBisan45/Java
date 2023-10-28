
public class Nservices {
	public static int Factorial(int n) {
		int f=1;
		for(int i=2;i<=n;i++) {
			f=f*i;
		}
		return f;
	}
	public static int Addition(int n1,int n2) {
		return n1+n2;
	}
	public static int AddDigits(int n1) {
		int s=0;
		while(n1!=0) {
			int d=n1%10;
			s=s+d;
			n1=n1/10;
		}
		return s;
	}
	
}
