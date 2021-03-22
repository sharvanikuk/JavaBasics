package OOPConceptPart2;

public class BMW extends Car //has-a relationship
{
	//when same method is present in both parent and class
	//with same name and same number of arguments 
	//is called Method Overriding
	
	public void start() //Overridden method
	{
		System.out.println("BMW--start method");
	}
	
	public void theftSafety()
	{
		System.out.println("BMW--theftSafety");
	}

}
