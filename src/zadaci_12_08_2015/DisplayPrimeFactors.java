package zadaci_12_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class DisplayPrimeFactors {
	/**
	 * Write a program that prompts the user to enter a positive integer and
	 * displays all its smallest factors in decreasing order. For example, if
	 * the integer is 120, the smallest factors are displayed as 5, 3, 2, 2, 2.
	 * Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5)
	 * and retrieve and display them in reverse order.
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter integer you want prime factors of:");
		int user = input.nextInt();
		int temp = user;
		// creating object of StackOfIntegers class
		StackOfIntegers stack = new StackOfIntegers();
		int i = 2;
		// loop we use to find lowest factors of a number
		while (temp != 1) {
			if (temp % i == 0) {
				// every time we find new factor we push(add) it to the stack
				stack.push(i);
				temp = temp / i;
			} else {
				i++;
			}
		}
		//printing out the elements of the stack, by using "pop" method that returns last element of the stack
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
	}

}
