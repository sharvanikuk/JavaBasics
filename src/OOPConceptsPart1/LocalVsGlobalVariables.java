package OOPConceptsPart1;

public class LocalVsGlobalVariables
{
	//Global or Class variables
	String name="Tom";
	int age=25;
	public static void main(String[] args)
	{
		
		int i=10;
		System.out.println(i);
		
		LocalVsGlobalVariables lv=new LocalVsGlobalVariables();
		System.out.println(lv.name);
		System.out.println(lv.age);
		lv.sum( );
		
		
	}
	
	public void sum()
	{
		int i=10;
		int j=20;
		int age=25;
				
	}

}
