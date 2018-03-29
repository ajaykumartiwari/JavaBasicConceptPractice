package com.javapractice.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class User{
	int id;
	String firstName;
	String lastName;
	int age;
	public User(int id,String firstName,String lastName,int age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
}
public class FilterCollectionUsingLambdaExample23 {

	private static List<User> users = Arrays.asList(
		      new User(1, "Steve", "Vai", 40),
		      new User(4, "Joe", "Smith", 32),
		      new User(3, "Steve", "Johnson", 57),
		      new User(9, "Mike", "Stevens", 18),
		      new User(10, "George", "Armstrong", 24),
		      new User(2, "Jim", "Smith", 40),
		      new User(8, "Chuck", "Schneider", 34),
		      new User(5, "Jorje", "Gonzales", 22),
		      new User(6, "Jane", "Michaels", 47),
		      new User(7, "Kim", "Berlie", 60)
		    );

		  public static void main(String[] args) {
		    
		    filterLambda();
		  }
		  private static void filterLambda() {
		    List<User> list = users.stream().filter(u -> u.age > 30).collect(Collectors.toList());
		    printListByLambda("users List", list);
		  }

		  private static void printListByLambda(String type, List<User> users) {
		    System.out.println(type + ":");

		    users.forEach(u -> System.out.println("Id :" + u.id+"\nName :\t"+u.firstName+"\nLastName :\t"+u.lastName+"\nAge :\t"+u.age));
		    //String str = users.toString();
		    //users.forEach(System.out::println); 
		    System.out.println();
		  }
}
