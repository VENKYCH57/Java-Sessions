package Opps_Encapsulation;

public class TestCompany {

	public static void main(String[] args) {
		Company c=new Company();
		c.setName("camcom retial technologies");
		c.sethq("bengaluru");
		c.setempCount(60);
		System.out.println(c.getName());
		System.out.println(c.gethq());
		System.out.println(c.getempCount());
		
	}

}
