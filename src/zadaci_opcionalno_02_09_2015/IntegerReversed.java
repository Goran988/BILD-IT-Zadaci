package zadaci_opcionalno_02_09_2015;

import java.util.Scanner;

/**
 * Write a recursive method that displays an int value reversely on the console
 * using the following header: public static void reverseDisplay(int value) For
 * example, reverseDisplay(12345) displays 54321. Write a test program that
 * prompts the user to enter an integer and displays its reversal.
 */
public class IntegerReversed {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your integer:");
		//taking the integer from user and invoking the method
		reverseDisplay(input.nextInt());
		input.close();

	}
/**
 * method that prints integer user entered in reversed order
 * @param value - integer user entered
 */
	public static void reverseDisplay(int value) {
		//if it's single digit print the value
		if (value < 10)
			System.out.println(value);
		else {
			//print last digit of number
			System.out.print(value % 10);
			//removing last digit of number
			reverseDisplay(value / 10);
		}
	}
}
