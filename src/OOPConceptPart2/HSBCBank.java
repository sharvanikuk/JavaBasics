package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank
{
	//IS-a relationship
	
	//If a class is implementing any Interface, its
	//mandatory to define/override all the methods of Interface

	// USBank methods, overriding
	public void credit()
	{
		System.out.println("HSBC-credit");
	}
	
	public void debit()
	{
		System.out.println("HSBC-debit");
	}
	
	public void transferMoney()
	{
		System.out.println("HSBC-transferMoney");
	}
	
	//HSBC methods
	public void educationLoan()
	{
		System.out.println("HSBC-educationLoan");
	}
	
	public void carLoan()
	{
		System.out.println("HSBC-carLoan");
	}
	
	//brazil bank method, overriding from Brazil bank
	public void mutualFund()
	{
		System.out.println("HSBC-mutual fund");
	}
}
