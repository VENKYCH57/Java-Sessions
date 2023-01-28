package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {
		  
		int i=0;
		while(i<=10) {
			System.out.println(i);
			i=i+2;
		}
		
		for(char c='A'; c<='Z'; c++) {
			System.out.println(c);
		}
		for(int c='A'; c<='Z'; c++) {
			System.out.println((c));
		}
		System.out.println("......................");
		for(char c='0'; c<='9'; c++) {
			System.out.println(c);
		}
		for(int c='0'; c<='9'; c++) {
			System.out.println((c));
		}
	}

}
