package comp228Assignment4Q2;

public class BusinessMortgage extends Mortgage
{

	public BusinessMortgage(int mortgageNumber, String customerName,
			double mortgageAmount, double interestRate, int term)
	{
		super(mortgageNumber, customerName, mortgageAmount,
				interestRate, term);
		super.interestRate = interestRate * 1.01;
	}

	@Override
	public void getMortgageInfo()
	{
		System.out.println("Mortgage ty pe: Business");
		System.out.println("Bank Name: "
				+ BANK_NAME);
		System.out.println("Mortgage Number: "
				+ mortgageNumber);
		System.out.println("Customer Name: "
				+ customerName);
		System.out.println("Mortgage Amount: $"
				+ mortgageAmount);
		System.out.println("Interest Rate: "
				+ String.format("%.4f", (interestRate)));
		System.out.println("Term: "
				+ term);
		System.out.println("Total amount: $"
				+ String.format("%.2f", (mortgageAmount * interestRate)));
	}

}
