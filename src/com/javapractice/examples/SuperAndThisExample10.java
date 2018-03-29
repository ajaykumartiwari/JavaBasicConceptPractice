package com.javapractice.examples;


class FirstChild extends SuperAndThisExample10{
	private String name = null;
	public FirstChild() {
		super("Super Envoking..1");
		name = "abc";
	}
	public String getName() {
		return name;
	}
	public FirstChild(String name){
        super("Super Envoking... 2");
        this.name = name;
    }
	
}

class  SecondChild extends SuperAndThisExample10{
	private String name = null;
	public SecondChild(){
        this("Super Envoking...1", "abc");
    }
    public SecondChild(String name){
        this("Super Envoking...2", name);
    }
    private SecondChild(String superStr, String name)
    {
        super(superStr);
        this.name = name;
    }
	public String getName() {
		return name;
	}
	
}

public class SuperAndThisExample10 {
	
	public SuperAndThisExample10(String str) {
		System.out.println("SuperAndThisExample10 constructor called with  "+ str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello from main, FirstChild results:");
        FirstChild fc1 = new FirstChild();
        FirstChild fc2 = new FirstChild("xyz");
        System.out.println("           child fc1 name: " + fc1.getName());
        System.out.println("           child fc2 name: " + fc2.getName());
        System.out.println("Hello from main, SecondChild results:");
        SecondChild sc1 = new SecondChild();
        SecondChild sc2 = new SecondChild("xyz");
        System.out.println("           child sc1 name: " + sc1.getName());
        System.out.println("           child sc2 name: " + sc2.getName());
	}

}
