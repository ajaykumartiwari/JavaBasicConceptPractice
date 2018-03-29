package com.javapractice.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamFiltersExample21 {

	 public static void main(String[] args) {

	        List<String> lines = Arrays.asList("abc", "def", "ghi");
	        List<String> result = getFilterOutput(lines, "def");
	        for (String temp : result) {
	            System.out.println(temp);  
	        }

	    }

	    private static List<String> getFilterOutput(List<String> lines, String filter) {
	        List<String> result = new ArrayList<>();
	        for (String line : lines) {
	            if (!"def".equals(line)) { 
	                result.add(line);
	            }
	        }
	        return result;
	    }
}
