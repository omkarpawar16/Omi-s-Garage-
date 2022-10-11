package garage.Module;

public class register {
	
	private String name;
	private double mbNo;
	private String addr;
	private String eMail;
	private String pass;
	private String rPass;
	public register(String name, double mbNo, String addr, String eMail, String pass, String rPass) {
		super();
		this.name = name;
		this.mbNo = mbNo;
		this.addr = addr;
		this.eMail = eMail;
		this.pass = pass;
		this.rPass = rPass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMbNo() {
		return mbNo;
	}
	public void setMbNo(double mbNo) {
		this.mbNo = mbNo;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getrPass() {
		return rPass;
	}
	public void setrPass(String rPass) {
		this.rPass = rPass;
	}
	
	
	}
