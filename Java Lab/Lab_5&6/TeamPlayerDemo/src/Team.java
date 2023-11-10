import java.util.Arrays;
public class Team {
	private int tno;
	private String tname;
	private Player captain;
	private Player[] plist=new Player[3];
	//def const
	public Team() {
		this(0,null,null,null);
	}
	//para const
	public Team(int t,String tn,Player cn,Player[] playerlist  ) {
		this.tno=t;
		this.tname=tn;
		this.captain=cn;
		this.plist=playerlist;
//		for(int i=0;i<10;i++) {
//			this.plist[i]=playerlist[i];
//		}
	}
	public void setTno(int Tno) {
		this.tno=Tno;
	}
	public int getTno() {
		return this.tno;
	}
	public void setTname(String tname) {
		this.tname=tname;
	}
	public String getTname() {
		return this.tname;
	}
	public void setCaptain(Player Captain) {
		this.captain=Captain;
	}
	public Player getCatain() {
		return this.captain;
	}
	public void setPlist(Player [] plst) {
		this.plist=plst;
	}
	public Player[] getPlist() {
		return this.plist;
	}

	public String toString() {
		return "Team [tno=" + tno + ", tname=" + tname + " captain=" + captain + ", plist=" + Arrays.toString(plist)
				+ "]";
	}
	
}
