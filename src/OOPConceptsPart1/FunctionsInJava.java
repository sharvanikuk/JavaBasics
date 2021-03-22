package OOPConceptsPart1;

public class FunctionsInJava {

	public static void main(String[] args) 
	{
		//non static methods
		FunctionsInJava obj=new FunctionsInJava();
		obj.test();
		int k=obj.pqr();
		System.out.println("Calling pqr function");
		System.out.println("k");
		
		System.out.println("Calling qa function");
		System.out.println(obj.qa());
		
		System.out.println("caalling division method");
		System.out.println(obj.division(5,2));
		
		

	}
	
		public void test()
		{
			System.out.println("test method");
		}
		
		public int pqr()
		{
			System.out.println("pqr method");
			int a=10;
			int b=20;
			int c=a+b;
			
			return c;
		}

		public String qa()
		{
			System.out.println("qa method");
			String s="Selenium";
			return s;
		}
			
		public double division(int x, int y)
		{
			System.out.println("division method");
			double d=x/y;
			return d;
		}

}
