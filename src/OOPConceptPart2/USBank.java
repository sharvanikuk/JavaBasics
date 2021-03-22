package OOPConceptPart2;

public interface USBank
{

	int min_bal=100;
	
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//properties:
	//Only method declaration, no method body
	//only method prototype
	//In Interface, we can declare the variables and
	// variables are by default static in nature
	//vars value will not change
	//NO static  methods allowed in Interface
	//NO main() method in Interface
	//CAN NOT create the object of Interface
	//Interface is abstract in nature
	
}
