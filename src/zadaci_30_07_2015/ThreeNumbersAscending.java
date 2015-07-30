package zadaci_30_07_2015;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeNumbersAscending {
	/**
	 * Write a program that ask user to input 3 integers, than sort them and
	 * display in ascending order. Bonus: write a method that takes those
	 * numbers and returns them sorted.
	 * 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers: ");					//asking user for input
		int first = input.nextInt();									//taking 3 numbers from user
		int second = input.nextInt();
		int third = input.nextInt();
		input.close();
		System.out.println(Arrays.toString(displaySortedNumbers(first, second,			//printint out result of our method as a string
				third)));

	}

	public static int[] displaySortedNumbers(int num1, int num2, int num3) {
		int[] nums = { num1, num2, num3 };					//making int array with numbers user gave us
		Arrays.sort(nums);									//sorting numbers in array
		return nums;										//returning sorted array

	}
}