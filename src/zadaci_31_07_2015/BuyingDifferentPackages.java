package zadaci_31_07_2015;

import java.util.Scanner;

public class BuyingDifferentPackages {
	/**
	 * Write a program that compares prices on two packages of the same product
	 * but different weight.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight and price for first package:");
		double firstWeight = input.nextDouble();							//taking input from user for first package
		double firstPrice = input.nextDouble();
		double firstRatio = firstWeight / firstPrice;						//calculating weight/price ratio for first package
		System.out.println("Enter weight and price for second package:");
		double secondWeight = input.nextDouble();							//taking input from user for second package
		double secondPrice = input.nextDouble();
		double secondRatio = secondWeight / secondPrice;					//calculating weight/price ratio for second package
		if (firstRatio > secondRatio)										//comparing ratios and printing the message depending of 
			System.out.println("First package has better price.");			//the result
		else if (firstRatio == secondRatio)
			System.out.println("Both packages have same price.");
		else
			System.out.println("Second package has better price.");
	}

}
