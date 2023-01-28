package Opps_Encapsulation;

public class Company {
	private String name;
	private int empCount;
	private String hq;

	public static void main(String[] args) {
		
//		Company c= new Company();
//		c.empCount=20;
//		c.hq="bengaluru";
//	    c.name="camcom";
//	    
//	    System.out.println(c.name);
		
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setempCount(int empCount) {
		this.empCount=empCount;
	}
	public int getempCount() {
		return empCount;
	}
	public void sethq(String hq) {
		this.hq=hq;
	}
	public String gethq() {
		return hq;
	}

}
