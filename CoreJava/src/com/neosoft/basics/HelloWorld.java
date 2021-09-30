package com.neosoft.basics;

public class HelloWorld {
	
	int x=100;//data member of this class(attribute)
	
	public void show() {//instance method of this class
		System.out.println("From Object "+x);
	}
	
	public static void main(String[] args) {//class method. it is static so we cannot use x directly main method.
		// TODO Auto-generated method stub
		HelloWorld helloWorld = new HelloWorld();//creating object
		
		System.out.println("Hello World "+helloWorld.x);
		helloWorld.show();//can access from instance
	}

}
