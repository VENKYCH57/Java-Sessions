package javasessions;

public class SwitchCase {

	public static void main(String[] args) {
		
		String browser="chrome";
		
		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
		
			break;
		case  "firefox":
			System.out.println("launch chrome");
		
			break;
		case "safari":
			System.out.println("launch chrome");
		
			break;

		default:
			break;
		}
		
		int x=100;
		int y=500;
		int z=500;
		
		if(x>y && x>z) {
			System.out.println("x is the hihest");
		}
		else if(y>x && y>z) {
			System.out.println("y is the hihest ");
		}
		else if(z>x && z>y){
			System.out.println("z is the highest");
		}
		else {
			System.out.println("all numbers are same");
		}
		

	}

}
