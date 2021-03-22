package OOPConceptPart2;

public class TestBank
{

	public static void main(String[] args)
	{
			HSBCBank hs=new HSBCBank();
			System.out.println(USBank.min_bal);
			hs.credit();
			hs.debit();
			hs.transferMoney();
			hs.educationLoan();
			hs.carLoan();
			
			//dynamic polymorphism
			// child class object can be referred by parent Interface reference var
			USBank ub=new HSBCBank();
			ub.credit();
			ub.debit();
			ub.transferMoney();
		
	}

}
