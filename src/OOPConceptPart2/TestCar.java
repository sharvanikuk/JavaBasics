package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args)
	{
		//static polymorphism
		//or compile time polymorphism
		BMW b=new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		System.out.println("**************");
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		
		
		//Top Casting
		//child class object can be referred
		//by parent class variable
		//is called dynamic or runtime polymorphism
		Car c1=new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		
		//Down Casting
		BMW bm=(BMW)new Car(); //ClassCastException
		
		
	}

}
