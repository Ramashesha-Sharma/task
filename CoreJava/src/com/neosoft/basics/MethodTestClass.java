package com.neosoft.basics;

public class MethodTestClass {
	
	String getMessage(String name) {
		return name;
	}
	
	int[] total(int a, int b) {
		int[] intArray = new int[2];
		intArray[0] = a+b;
		intArray[1] = a-b;
		return intArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodTestClass object = new MethodTestClass();
		System.out.println(object.getMessage("Ram"));
		
		int[] result = object.total(200, 100);
		System.out.println("Addition: "+result[0]);
		System.out.println("Subraction: "+result[1]);
	}

}
