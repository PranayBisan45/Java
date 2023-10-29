public class CmdArgs {
	public static void main(String[] args) {
		if (args.length>=2) {
			System.out.println("hello "+args[0]);
			System.out.println("Hii "+args[1]);
		} else {
			System.out.println("Please Enter minimum Two Arguments");
		}
	}
}