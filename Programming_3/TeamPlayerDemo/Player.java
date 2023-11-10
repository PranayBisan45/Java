
public class Player {
	private int pno;
	private String pname;
	private String skill;
	//def constr
	public Player(){
		this(0,null,null);
	}
	//para const
	public Player(int pno,String pname,String skill) {
		this.pno=pno;
		this.pname=pname;
		this.skill=skill;
	}
	public void setPno(int pno){
		this.pno=pno;
	}
	public int getPno() {
		return this.pno;
	}
	public void setPname(String P) {
		this.pname=P;
	}
	public String getPname() {
		return this.pname;
	}
	public void setSkill(String sk) {
		this.skill=sk;
	}
	public String getSkill() {
		return this.skill;
	}
	public String toString() {
		return "[Player No: "+pno+" Player Name: "+pname+" Player Skill: "+skill+"]";
	}
}
