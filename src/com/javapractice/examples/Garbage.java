package com.javapractice.examples;

public class Garbage {

	public static void main(String[] args) throws InterruptedException
	{
		Garbage g1 = new Garbage();
		Garbage g2 = new Garbage();
		g1 = null;
		System.gc();
		g2 = null;
		Runtime.getRuntime().gc();
		System.out.println("end of main");
	
	}
	
	@Override
	// finalize method is called on object once 
	// before garbage collecting it
	protected void finalize() throws Throwable
	{
		System.out.println("Garbage collector called");
		System.out.println("Object garbage collected : " + this);
		
	}
}
