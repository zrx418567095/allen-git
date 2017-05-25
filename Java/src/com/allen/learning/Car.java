package com.allen.learning;

public class Car 
{
   public int age = 30;
   public String name = "车";
   public double price = 10000;
   
   public void run()
   {
	   System.out.println("我能跑！");
   }



   public boolean equals(Object obj) 
{
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Car other = (Car) obj;
	if (age != other.age)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
		return false;
	return true;
}
   
   
   
   /*
   public Car()
   {
	   System.out.println("这是无参构造方法。");
   }
   */
   
   /*public Car()
   {
	   System.out.println("这是有参构造方法，年龄是："+age+"。");
   }*/
}
