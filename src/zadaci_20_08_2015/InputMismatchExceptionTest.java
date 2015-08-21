package zadaci_20_08_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Write a program that prompts the user to read two integers and displays their
 * sum. Your program should prompt the user to read the number again if the
 * input is incorrect.
 */
public class InputMismatchExceptionTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int first = 0;
		// boolean value that states if the integer is entered correctly
		boolean ok = true;
		// loop runs while value of "ok" is true
		while (ok) {
			// set the value on false
			ok = false;
			// try statement that asks user to enter the integer
			try {
				System.out.println("Enter first integer:");
				first = input.nextInt();
				// in case exception happens we set ok to false and "clear" the
				// scanner
			} catch (InputMismatchException ex) {
				ok = true;
				input.next();
			}
		}
		ok = true;
		int second = 0;
		while (ok) {
			// set the value of "ok" to false
			ok = false;
			// try statement that asks user to enter second integer
			try {
				System.out.println("Enter second integer:");
				second = input.nextInt();
				// if exception happens we set "ok" to true and clear the
				// scanner
			} catch (InputMismatchException ex1) {
				ok = true;
				input.next();
			}
		}
		//printing out the sum of our integers
		System.out.println("Sum of your integers is " + (first + second));

	}
}
