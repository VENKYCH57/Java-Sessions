package ConstructorConcept;

import java.util.ArrayList;
import java.util.List;

public class TestUniversity {

	public static void main(String[] args) {
		
		ArrayList<String> courses= new ArrayList<String>();
		courses.add("mba");
		courses.add("mca");
		courses.add("mtech");
		
		university u = new university("venki", "bengaluru", courses);
		
		
		
		
		

	}

}
