package com.javapractice.examples;

public class BreackContineu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println ("starting loop:");
		for (int n = 0; n < 7; ++n)
		{
		    System.out.println ("in loop: " + n);
		    if (n == 2) {
		        continue;
		    }
		    System.out.println ("First Element");
		    if (n == 4) {
		        break;
		    }
		    System.out.println ("Second Element");
		    // continue at head of loop
		}
		// break out of loop
		System.out.println ("end of loop or exit via break");
	}

}
