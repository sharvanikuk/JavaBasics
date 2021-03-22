package OOPConceptsPart1;

public class WrapperClassConcept 
{

	public static void main(String[] args) 
	{
		String x="100";
		System.out.println(x+20);
		//Data conversion:String to int
		
		int  i=Integer.parseInt(x);
		System.out.println(i+20);
		
		//Integer, Double, Character, Boolean
		
		//String to Double conversion
		
		String y="12.33";
		double d=Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to boolean;
		String bk="true";
		boolean b=Boolean.parseBoolean(bk);
		System.out.println(b);
		
		//int to String conversion
		int j=200;
		System.out.println(j+20);
		
		String s=String.valueOf(j);
		System.out.println(s+100);
		
		
	}

}
