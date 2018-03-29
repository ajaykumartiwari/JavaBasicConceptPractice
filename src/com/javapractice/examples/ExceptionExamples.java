package com.javapractice.examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExamples {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//uncheckedException();
		checkedException();
	}

	public static void uncheckedException() {
		//Arithmetic Exception
			int x = 0;
			int y = 10;
			int z = y/x;
	      //ArrayIndeOutOfBoundException
	      try {
	  		int[] list = new int[5];
	  		 list[5] = 33;
	  		}
	  		catch (Exception e) {
	  			// TODO: handle exception
	  			e.printStackTrace();
	  		}
	}
	//checked Exception Example( Throw exception at compile time )
	public static void checkedException() throws IOException {
		FileReader file = null;
		try {
			file = new FileReader("a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader fileInput = new BufferedReader(file);
		
		// Print first 3 lines of file "C:\test\a.txt"
		for (int counter = 0; counter < 3; counter++)
			try {
				System.out.println(fileInput.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		fileInput.close();
		
		
		   
		  
	}
}
