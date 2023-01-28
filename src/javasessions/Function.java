package javasessions;

public class Function {

	public static void main(String[] args) {
		Function f=new Function();
		f.test();
		
		System.out.println(f.add());
		
		int c=f.sum(50, 20);
		System.out.println(c);
		
	}
	//types of functions or methods
	
	//a] no input no return
	
	public void test() {
		
		System.out.println("test method");
	}
	//no input but some return
	public int add() {
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	//some input and some return
	public int sum(int a,int b) {
		int sum=a+b;
		return sum;
	}

}
 