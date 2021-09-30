package com.neosoft.basics;

public class AccessSpecifiersTest {
//default member
	int default_member = 10;
	
	void defaultShow() {
		System.out.println("Default Show");
	}
	//public member
	public int public_member = 20;
	
	public void publicShow() {
		System.out.println("public Show");
	}
	protected int protected_member = 30;
	
	protected void protectedShow() {
		System.out.println("Protected Show");
	}
	private int private_member = 40;
	
	private void privateShow() {
		System.out.println("Private Show");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
