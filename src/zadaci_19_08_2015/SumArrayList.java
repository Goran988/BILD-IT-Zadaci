package zadaci_19_08_2015;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Write the following method that returns the sum of all numbers in an
 * ArrayList: public static double sum(ArrayList<Double> list) Write a test
 * program that prompts the user to enter 5 numbers, stores them in an array
 * list, and displays their sum.
 *
 */
public class SumArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 numbers: ");
		// creating array list with double data type
		ArrayList<Double> list = new ArrayList<>();
		// taking numbers from user and adding them to array list
		for (int i = 0; i < 5; i++) {
			list.add(input.nextDouble());
		}
		input.close();
		// printing out the list and the result of sum method
		System.out.println("Numbers you entered are: " + list + "\nSum is: "
				+ sum(list));

	}

	/**
	 * method that calculates sum of all elements in array list
	 * 
	 * @param list
	 *            - array list passed to method
	 * @return value of the sum
	 */
	public static double sum(ArrayList<Double> list) {
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;
	}

}
