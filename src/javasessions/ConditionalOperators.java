package javasessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		if(a==b) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("not equal");
		}
		
		int total=100;
		if(total<=100) {
			System.out.println("total less than or equal to 100");
			if(total>=80) {
				System.out.println("total greater than or equal to 80");
			}
		}
	}
	
}
