package javasessions;

public class ArrayConcept {

	public static void main(String[] args) {
		int  i1=10;
		      i1=20;
		       i1=30;
		
		System.out.println(i1);
		//we can fit all the values in in one variable with array concept
		
		
		int p[]=new int[5];
		    p[0]=10;
		    p[1]=20;
		    p[2]=30;
		    p[3]=40;
		    p[4]=50;
		    System.out.println(p);
		    
		    for(int i=0; i<p.length; i++) {
		    	System.out.println(p[i]);
		    }
		    
		    
		    String names[]= new String[5];
		     names[0]="venky";
		     names[1]="ammu";
		     names[2]="jaggu";
		     names[3]="durga";
		     names[4]="kusuma";
		     
		     for(int k=0; k<names.length; k++) {
		    	 System.out.println(names[k]);
		     }
		     
		     System.out.println(",,,,,,,,,,,,,,,,,,,,,");
		     for(String e:names) {
		    	System.out.println(e);
		     }
		    
	}  

}
