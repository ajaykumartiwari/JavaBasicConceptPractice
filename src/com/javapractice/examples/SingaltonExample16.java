package com.javapractice.examples;

public class SingaltonExample16 {

	private static volatile SingaltonExample16 instance;
	

    private SingaltonExample16(){}
    public static void main(String args[]) {
	// TODO Auto-generated method stub
    	//SingaltonExample16.getInstance();
    	SingaltonExample16 s = SingaltonExample16.getInstance();

    }
    public static SingaltonExample16 getInstance(){
        if(instance == null){
           synchronized(SingaltonExample16.class){
               //double checking Singleton instance
               if(instance == null){
                   instance = new SingaltonExample16();
                   System.out.println("Singalton Instance Created...\n"+instance);
               }
           }
        }
        return instance;
    }
    
}
