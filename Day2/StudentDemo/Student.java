
public class Student {
	private String sid;
	private String sname;
	private int m1,m2,m3;
	
	static int count;
	static {
		count=0;
	}
	public String generatecode() {
		count++;
		if(sname!=null) {
			return this.sname.substring(0, 3)+count;
		}
		return "xyz"+count;
	}
	public Student(){
		this(null,0,0,0);
	}
	public Student(String sname,int m1,int m2,int m3) {
		this.sid=generatecode();
		this.sname=sname;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;	
	}
	public void setSname(String s) {
		this.sname=s;
	}
	public void setm1(int mk1) {
		this.m1=mk1;
	}
	public void setm2(int mk2) {
		this.m2=mk2;
	}
	public void setm3(int mk3) {
		this.m3=mk3;
	}
	public String getName() {
		return this.sname;
	}
	public String getsid() {
		return this.sid;
	}
	public int getm1() {
		return this.m1;
	}
	public int getm2() {
		return this.m2;
	}
	public int getm3() {
		return this.m3;
	}
	public String toString(){
		return "Sid: "+this.sid+" Sname: "+this.sname+" mark1: "+this.m1+" mark2: "+this.m2+" mark3: "+this.m3;
	}
}
