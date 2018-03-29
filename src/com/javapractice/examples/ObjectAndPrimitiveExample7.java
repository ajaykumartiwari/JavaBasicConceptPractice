package com.javapractice.examples;


class A{
    public int i = 10;
}
public class ObjectAndPrimitiveExample7 {

	public static void main(String argv[]){
		ObjectAndPrimitiveExample7 op = new ObjectAndPrimitiveExample7();
		op.m1();
        }

        public void m1(){
                int i = 99;
                A v = new A();
                v.i=30;
                m2(v,i);
                System.out.println(v.i); //print 20
        }
        public void m2(A v, int i){
                i=0;
                v.i = 20;
                A a = new A();
                v =  a;
                System.out.println(v.i+ " "+i); //10 0
        }

}
