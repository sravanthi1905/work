package employeeBean;




public class Employe {
	private int eid;
	private String ename;
	private String role;
	
	public Employe() {
		
	}
	public Employe(int eid, String ename, String role) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.role = role;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
	
}
