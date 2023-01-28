package ConstructorConcept;

import java.util.List;

public class university {
	
	private String name;
	private String hq;
	private List<String> courses;
	
	
	
	
	
	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getHq() {
		return hq;
	}





	public void setHq(String hq) {
		this.hq = hq;
	}





	public List<String> getCourses() {
		return courses;
	}





	public void setCourses(List<String> courses) {
		this.courses = courses;
	}





	public university(String name, String hq, List<String> courses) {
		this.name = name;
		this.hq = hq;
		this.courses = courses;
	}





	
	

}
