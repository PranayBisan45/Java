import java.util.Scanner;

public class TeamService {
	static Team[] tarr;
	static int cnt;
	static {
		tarr=new Team[5];
		Player [] plist=new Player[3];
		plist[0]= new Player(1,"virat","bat");
		plist[1]= new Player(2,"sky","bat");
		plist[2]= new Player(3,"ishan","bat");
		
		Player [] plist1=new Player[3];
		plist1[0]= new Player(1,"conwey","bat");
		plist1[1]= new Player(2,"rutu","bat");
		plist1[2]= new Player(3,"raina","bat");
		
		tarr[0]=new Team(1,"mi",new Player(45,"Rohit","Batsman"),plist);
		tarr[1]=new Team(2,"csk",new Player(111,"Dhoni","Wicketkeeper"),plist1); 
		cnt=2;
	}
	public static void AddNewTeam() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Team no: ");
		int tno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Team Name: ");
		String Tnm=sc.nextLine();
		System.out.println("Enter Captain Number: ");
		int cno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Captain Name: ");
		String cnm=sc.nextLine();
		System.out.println("Enter Captain Skill: ");
		String csk=sc.nextLine();
		
		Player captain=new Player(cno,cnm,csk);
		Player[] plist=new Player[3];
		for(int i=0;i<plist.length;i++) {
			System.out.println("Player "+(i+1));
			System.out.println("Enter Player Number: ");
			int pno=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Player Name: ");
			String pnm=sc.nextLine();
			System.out.println("Enter Player Skill: ");
			String psk=sc.nextLine();
			plist[i]=new Player(pno,pnm,psk);
			
		}
		tarr[cnt]=new Team(tno,Tnm,captain,plist);
		cnt++;
	}
	public static void DisplayAllTeam() {
		for(int i=0;i<cnt;i++) {
			System.out.println(tarr[i]);
		}
	}
	public static Team SearchTByCName(String nm) {
		
		for(int i=0;i<cnt;i++) {
			Player c=tarr[i].getCatain();
			if(c.getPname().equals(nm)) {
				return tarr[i];
			}
		}
		return null;
	}
	
	public static Team SearchTByPlayer(String pnm) {
		for(int i=0;i<cnt;i++) {
			Player[] p=tarr[i].getPlist();
			for(int j=0;j<p.length;j++) {
			if(p[i].getPname().equals(pnm)) {
				return tarr[i];
			}
			}
		}
		return null;
	}
}
