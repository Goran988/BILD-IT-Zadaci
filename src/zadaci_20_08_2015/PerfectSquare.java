package zadaci_20_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a program that prompts the user to enter an integer m and find the
 * smallest integer n such that m * n is a perfect square. (Hint: Store all
 * smallest factors of m into an array list. n is the product of the factors
 * that appear an odd number of times in the array list.
 */
public class PerfectSquare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//asking the user to enter the integer
		System.out.println("Enter an integer m:");
		int num = input.nextInt();
		//printing out the result
		System.out
				.println("The smallest number n for m * n to be a perfect square is "
						+ perfectSquare(num)
						+ " m*n is "
						+ (perfectSquare(num) * num));
	}

	/**
	 * method that finds lowest "n" that should be multiplyed to get perfect
	 * square
	 * 
	 * @param num
	 *            - number we pass to the method
	 * @return - returns value of "n"
	 */
	public static int perfectSquare(int num) {
		ArrayList<Integer> list = new ArrayList<>();
		int temp = num;
		int i = 2;
		int n = 1;
		// loop that finds lowest factors and adds them to the array list
		while (temp != 1) {
			if (temp % i == 0) {

				list.add(i);
				temp = temp / i;
			} else {
				i++;
			}
		}
		// list that stores factors that apear odd number of times
		ArrayList<Integer> odd = new ArrayList<>();
		// loops that find factors that apears odd number of times and add them
		// to array list "odd"
		for (int k = 0; k < list.size(); k++) {
			int count = 0;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(k) == list.get(j))
					count++;
			}
			// checks if number is already added since we need them only once
			if (count % 2 != 0 && !odd.contains(list.get(k))) {
				odd.add(list.get(k));
			}
		}
		int oddMulty = 1;
		// checking if product of factors multiplyed with "num" is perfect
		// square
		for (int j = 0; j < odd.size(); j++) {
			oddMulty *= odd.get(j);
			// we break the loop when we get lowest product of factors that
			// fulfils the condition
			if (isPerfectSquare(num * oddMulty)) {
				break;
			}

		}
		return oddMulty;
	}

	/**
	 * method that checks if the number is perfect square
	 * 
	 * @param n
	 *            - number we're going to check
	 * @return true if it's perfect square and false if it's not
	 */
	public final static boolean isPerfectSquare(int n) {
		// if number is less than 0 return false
		if (n < 0)
			return false;
		int num = (int) (Math.sqrt(n) + 0.5);
		// if product of two squares is the orignal number, number is perfect
		// square
		return num * num == n;
	}
}
