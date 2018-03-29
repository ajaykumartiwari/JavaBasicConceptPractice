package com.javapractice.examples;

public class StringBuilderExample14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb=new StringBuilder("Hello");  
		sb.append("Java");
		System.out.println(sb); 
		sb.insert(5, ", ");
		System.out.println(sb);
		sb.replace(5, 7, "Java");
		System.out.println(sb);
		
		
	}

}
