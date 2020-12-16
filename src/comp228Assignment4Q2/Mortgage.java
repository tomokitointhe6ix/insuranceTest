package comp228Assignment4Q2;

public abstract class Mortgage implements MortgageConstants
{
	protected int mortgageNumber;
	protected String customerName;
	protected double mortgageAmount;
	protected double interestRate;
	protected int term;

	public Mortgage(int mortgageNumber, String customerName,
			double mortgageAmount, double interestRate, int term)
		   {
		      if (mortgageAmount >= MAX_AMOUNT)
		         throw new IllegalArgumentException(
		        		 "Maximum mortgage amount is $300,000");

		      if (term != SHORT){
		    	  if (term != MEDIUM) {
		    		  if (term != LONG) {
		    			  term = SHORT;
			    	  }
		    	  }
		      }

		      this.mortgageNumber = mortgageNumber;
		      this.customerName = customerName;
		      this.mortgageAmount = mortgageAmount;
		      this.interestRate = interestRate;
		      this.term = term;
		   }

	public abstract void getMortgageInfo();

}
