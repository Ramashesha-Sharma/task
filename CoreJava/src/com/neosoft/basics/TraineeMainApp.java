package com.neosoft.basics;

public class TraineeMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TraineeSoftwareEngineer candidate1 = new TraineeSoftwareEngineer();
		candidate1.name = "Ram";
		candidate1.qualification = "BE";
		candidate1.age = 22;
		candidate1.showDetails();
		System.out.println("Company: "+TraineeSoftwareEngineer.COMPANY_NAME);
		
		TraineeSoftwareEngineer candidate2 = new TraineeSoftwareEngineer();
		candidate2.name = "Shesha";
		candidate2.qualification = "B.Tech";
		candidate2.age = 20;
		candidate2.showDetails();
		System.out.println("Company: "+TraineeSoftwareEngineer.COMPANY_NAME);
		
		TraineeSoftwareEngineer candidate3 = new TraineeSoftwareEngineer();
		candidate3.showDetails();//non-para constructor
		System.out.println("Company: "+TraineeSoftwareEngineer.COMPANY_NAME);
		
		TraineeSoftwareEngineer candidate4 = new TraineeSoftwareEngineer("ABC","BSc",20);
		//para constructor
		candidate4.showDetails();
		System.out.println("Company: "+TraineeSoftwareEngineer.COMPANY_NAME);
	}

}
