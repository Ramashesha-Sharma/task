package com.neosoft.basics;

public class TraineeSoftwareEngineer {//User defined class
	//set of attributes
	String name;//default null
	String qualification;
	int age;//default 0
	String city;
	String email;
	
	//Setting default values frmo non-param constructo
	public TraineeSoftwareEngineer() {
		name = "Unknown";
		qualification = "unknown";
		
	}
	
	
	//para constructor. create by right click->source->generate const with para->select para->submit
	public TraineeSoftwareEngineer(String name, String qualification, int age) {
		this.name = name;
		this.qualification = qualification;
		this.age = age;
	}



	public final static String COMPANY_NAME="Neosoft";//static variables can modified
	//final is used to fix the variable value. No more changes to the variable.
	//As per standards constant variable name are written incapital letters.
	public void showDetails() {
		System.out.println("Name: "+name+", Qualification: "+qualification+", Age: "+age);
	}
}
