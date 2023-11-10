
public class AddCmdArgs {
	public static void main(String[] args) {
		if(args.length>=2) {
		int sum=0;
		for(int i=0;i<args.length;i++) {
			sum=sum+Integer.parseInt(args[i]);
			
		}
		System.out.println("Sum is "+sum);
	}
		else {
			System.out.println("Please provide minimum 2 arguments..");
		}
	}
}
