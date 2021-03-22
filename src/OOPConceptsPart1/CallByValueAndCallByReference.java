package OOPConceptsPart1;

public class CallByValueAndCallByReference
{
	int p;
	int q;

	public static void main(String[] args) 
	{
		
		CallByValueAndCallByReference obj=new CallByValueAndCallByReference();
		int x=10;
		int y=20;
		obj.testSum(x,y); //Call by Value
		
		obj.p=50;
		obj.q=60;
		
		System.out.println("Value of P and Q before swap");
		System.out.println("p= "+obj.p+" q= "+obj.q);
		
		obj.swap(obj); //call by reference
		System.out.println("Value of P and Q after swap");
		System.out.println("p= "+obj.p+" q= "+obj.q);
		
		
	}
	
	public int testSum(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	//call by ref
	public void swap(CallByValueAndCallByReference t)
	{
		int temp=0;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
			
	}

}
