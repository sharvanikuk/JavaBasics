package OOPConceptsPart1;

public class StaticAndNonStaticConcept 
{

	String name="Tom";  //non-static gloval var
	static int age=25; // static global var
	
	public static void main(String[] args) 
	{
		
		
		//how to call static methods and vars?
		//1.  direct calling:
		sum();
		//2.  call by class name
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		//how to call non-static methods and vars?
		StaticAndNonStaticConcept obj=new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		//can i access static methods by using object reference? yes but not recommended
		obj.sum();
		System.out.println(obj.age);
		
	}
	
	public void sendMail()  //non-static method
	{
		System.out.println("send mail method");
	}
	
	public static void sum()  // static method
	{
		System.out.println("sum method");
	}

}
