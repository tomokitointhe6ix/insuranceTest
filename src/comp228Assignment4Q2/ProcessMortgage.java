package comp228Assignment4Q2;

import java.util.Scanner;

public class ProcessMortgage {

	public static void main(String[] args)
	{
		Mortgage[] morgages = new Mortgage[3];
		int mortgageNumber;
		String customerName;
		double mortgageAmount = 0;
		double interestRate;
		int term;

		Scanner inputRate = new Scanner(System.in);
		System.out.print("Enter the current interest rate: ");
		interestRate = inputRate.nextDouble();
		System.out.println();

		for(int z = 0; z <= 2; z++)
		{
			System.out.println("Input" + (z + 1));

			Scanner inputNumber = new Scanner(System.in);
			System.out.print("Enter the mortgage number: ");
			mortgageNumber = inputNumber.nextInt();

			Scanner inputName = new Scanner(System.in);
			System.out.print("Enter your name: ");
			customerName = inputName.nextLine();

			Scanner inputAmount = new Scanner(System.in);
			System.out.print("Enter the amount of mortgage: ");
			mortgageAmount = inputAmount.nextDouble();

			Scanner inputTerm = new Scanner(System.in);
			System.out.print("Enter the payment term: ");
			term = inputTerm.nextInt();

			System.out.println();

			try
			{
				if(z == 0)
				{
					morgages[z] = new BusinessMortgage(
							mortgageNumber, customerName, mortgageAmount,
							interestRate, term);
				}
				else
				{
					morgages[z] = new PersonalMortgage(
							mortgageNumber, customerName, mortgageAmount,
							interestRate, term);
				}
			}

			catch (IllegalArgumentException e)
			{
				System.out.printf("Exception: %s%n%n", e.getMessage());
			}
		}
		System.out.println();
		System.out.println("=================");

		for (Mortgage currentMortgage : morgages)
	      {
			int i = 0;
			System.out.println("Input" + (i + 1));
			currentMortgage.getMortgageInfo();
			System.out.println();
	      }
	}
}
