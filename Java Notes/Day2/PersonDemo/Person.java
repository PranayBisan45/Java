
public class Person {
	private int pid;
	private String pname;
	private String mobile;
	
	public Person() {
		this(0,null,null);
	}
	public Person(int id,String n,String m) {
		this.pid=id;
		this.pname=n;
		this.mobile=m;
	}
	public void setPid(int p) {
		this.pid=p;
	}
	public void setPname(String n) {
		this.pname=n;
	}
	public void setMobile(String M) {
		this.mobile=M;
	}
	public int getPid() {
		return this.pid;
	}
	public String getPname() {
		return this.pname;
	}
	public String getMobile() {
		return this.mobile;
	}
	public String toString() {
		return "Pid: "+this.pid+" Pname: "+this.pname+" Mobile "+this.mobile;
	}
}
