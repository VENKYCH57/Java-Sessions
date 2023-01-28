package javasessions;

public class functions {
	
	public void noInputNoReturnMethod() {
		System.out.println("-no input no return method");
	}
	public int noInputButSomeReturn() {
		System.out.println("no Input But Some Return");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	public int someInputSomeReturn(int a,int b) {
		System.out.println("some Input Some Return");
		int sum=a+b;
		return sum;
	}


	public static void main(String[] args) {
		
		functions f=new functions();
		f.noInputButSomeReturn();
		System.out.println(f.someInputSomeReturn(30, 40));
		System.out.println(f.noInputButSomeReturn());
		
		

	}

}
