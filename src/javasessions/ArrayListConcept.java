package javasessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		 
		ArrayList<Integer> ar= new ArrayList<Integer>();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		ar.add(500);
		
		System.out.println(ar.size());
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		for(int e:ar) {
			System.out.println(e);
		}
		
		
		System.out.println(".............");
		ArrayList<Object> empData=new ArrayList<Object>();
		empData.add("venky");
		empData.add(28);
		empData.add('M');
		empData.add("sindhanur");
		
		for(int i=0; i<empData.size(); i++) {
			System.out.println(empData.get(i));
			   if(empData.equals('M')) {
				   System.out.println("select the candiate");
				   break;
			   }
		}
		
		
		System.out.println(".............");
		for(Object e:empData) {
			System.out.println(e);
		}
		

	}

}
