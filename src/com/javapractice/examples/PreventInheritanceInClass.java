package com.javapractice.examples;

public class PreventInheritanceInClass extends Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test  = new Test();
		test.disp1();
		test.disp2();
		//test.disp3();
	}

}
/*final class Test{
	public void disp1() {
		System.out.println("method 1");
	}
	void disp2() {
		System.out.println("method 2");
	}
}*/
class Test{
	public void disp1() {
		System.out.println("method 1");
	}
	final void disp2() {
		System.out.println("method 2");
	}
	
	private void disp3() {
		System.out.println("method 3");
	}
}