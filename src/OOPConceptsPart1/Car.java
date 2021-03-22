package OOPConceptsPart1;

public class Car {
	int mod;
	int wheel;
	
	public static void main(String[] args)
	{
		Car a=new Car();
		Car b=new Car();
		Car c=new Car();
		
		a.mod=2015;
		a.wheel=4;
		
		b.mod=2016;
		b.wheel=4;
		
		c.mod=2014;
		c.wheel=2;
		 
		System.out.println("Before Assigning the references");
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
				
		
		System.out.println("After shifting the references");
		a=b;
		b=c;
		c=a;
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		 
	}

}
