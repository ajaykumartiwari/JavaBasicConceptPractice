package com.javapractice.examples;


//Anonymous Inner Class Example by using class.
abstract class Person{  
	abstract void disp1();  
} 

//Inner class Example
public class InnerClassExample18 {


	private static int data=100;
	
	class Inner{  
		void msg()
		{
			System.out.println(InnerClassExample18.data);
			System.out.println("data is "+data);
		}  
	}

	//java static Inner Class Example
	static class InnerS{  
		void msg1()
		{
			System.out.println("Static Inner class...");
			System.out.println("data is "+(data+100));
		}  
		
		//static Inner class with static methods...
		static void msg2() {
			System.out.println("Static Inner Class with Static methods...");
			System.out.println("data is: "+(data+200));
		}
	}

	public static void main(String args[]){  
		InnerClassExample18 obj=new InnerClassExample18();  //simple inner class example
		InnerClassExample18.Inner in=obj.new Inner();  
		in.msg();  

		InnerClassExample18.InnerS iobj = new InnerS(); // static inner class example
		iobj.msg1();
		
		InnerClassExample18.InnerS.msg2(); //no need to create the instance of static nested class methods
		
		Person p = new Person() {

			@Override
			void disp1() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous class executed...");
			}
		};
		p.disp1();

	}

}
