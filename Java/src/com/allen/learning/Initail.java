package com.allen.learning;

public class Initail {

	public static void main(String[] args) 
	{
        Toyota t1 = new Toyota();
        t1.age = 20;
        t1.name = "T1";
        Toyota t2 = new Toyota();
        t2.age = 20;
        t2.name = "T1";
        if(t1.equals(t2))
        {
        	System.out.println("TURE");
        }
        else 
        {
        	System.out.println("FALSE");
        }
        //System.out.println(t1);
	}

}
