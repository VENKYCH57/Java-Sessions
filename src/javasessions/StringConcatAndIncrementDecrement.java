package javasessions;

public class StringConcatAndIncrementDecrement {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=30;
		
		System.out.println(a+b);
		
		String x="hello";
		String y="world";

		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+a+b+c);
		System.out.println(x+y+(a+b+c));
		System.out.println(a+b+c+x+y);
		
	

	}

}
