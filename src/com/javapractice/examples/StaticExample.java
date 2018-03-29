package com.javapractice.examples;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

class Student
{
	int roll_no;
	String name;
	static String College_Name="Cdac";
}

public class StaticExample extends Student{

	public static void main(String args[])
	{
		Student std;
		System.out.println("Enter No Of Student:\t");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		List<Student> arr = new ArrayList<Student>();
		for (int i = 0; i < num; i++) {
			std=new Student();
			System.out.println("Enter Roll Number of "+(i+1)+"st Student");
			std.roll_no=sc.nextInt();
			System.out.println("Enter Name:\t");
			std.name=sc.next();	
			arr.add(std);
		}
		for (int j = 0; j < arr.size(); j++) {
			Student s = (Student) arr.get(j);
			System.out.println("Value is "+s.name+""+s.roll_no+""+s.College_Name);    
		}
		
		
		/*System.out.println(std.roll_no);
		System.out.println(std.name);
		System.out.println(Student.College_Name);*/
		
		/*Student  s2=new  Student();
		s2.roll_no=200;
		s2.name="zyx";
		System.out.println(s2.roll_no);
		System.out.println(s2.name);
		System.out.println(Student.College_Name); */
	}	
}
