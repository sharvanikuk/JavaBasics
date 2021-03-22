package OOPConceptsPart1;

public class MethodOverloading {

	public static void main(String[] args)
	{
		
		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 12);
	}
	
	public void sum()
	{
		System.out.println("Sum method-zero param");
		
	}

	public void sum(int i)
	{
		System.out.println("Sum method - 1 input param");
		System.out.println(i);
	}
	
	public void sum(int i, int j)
	{
		System.out.println("Sum method - 2 input param");
		System.out.println(i+j);
	}
}
