package javasessions;

public class ClassAndObject {
	
	String name;
	int age;
	double salary;
	boolean isActive;

	public static void main(String[] args) {
		
		ClassAndObject co=new ClassAndObject();
		co.age=28;
		System.out.println(co.name);
		System.out.println(co.age);
		System.out.println(co.salary);
		System.out.println(co.isActive);

	}

}
