package zadaci_29_07_2015;

import java.util.Scanner;

/**
 * Write program that takes numbers from user, input ends with 0. Calculate sum,
 * average and print how many numbers, positive and negative user entered.
 *
 */
public class PositiveNegativeSumAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers input ends with 0");				//we ask user for input
		int count = 0;														//counter for numbers
		int countPositive = 0;												//counter for positive numbers
		double sum = 0;														//sum
		double user;							
		while ((user = input.nextDouble()) != 0) {							//loop will work until user enters 0
			sum += user;													//add numbers to sum
			count++;
			if (user > 0)													//if number is bigger than 0 it's positive
				countPositive++;											//increment counter for positive numbers by 1
		}
		input.close();														//closing scanner
		double average = sum / count;										//average is calculated by dividing sum with number of numbers
		System.out.println("You entered:\n" + count + " numbers\n"			//printing out results
				+ countPositive + " were positive\n" + (count - countPositive)
				+ " were negative\n" + sum + " was sum\n" + average
				+ " was average");
	}
}
