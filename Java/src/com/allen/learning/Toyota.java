package com.allen.learning;

public class Toyota extends Car
{
	
    public Toyota()
   {
	  //System.out.println("这是子类的无参构造方法。");  
   }
   
    public void run()
   {
	  System.out.println("Toyota在跑。"); 
   }

@Override
     public String toString() 
   {
	 return "Toyota [age=" + age + "]";
   }
   
   
}
