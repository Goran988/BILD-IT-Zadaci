package zadaci_30_07_2015;

import java.util.Scanner;

public class NumberRepetitions {
	/**
	 * Write a program that takes number in range from 1 to 100, input ends with
	 * 0, and displays us how many times each number was entered.
	 * 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter integers, input ends with 0:");
		int[] nums = new int[101];							//nums array length of 101 since index starts from 0 and we need 100 numbers
		int user;
		while ((user = input.nextInt()) != 0) {				//input ends with 0
			nums[user]++;									//elements on the indexes user entered are incremented by 1
		}
		for (int i = 0; i < nums.length; i++) {				//going through the loop, printing elements that are not equal 0
			if (nums[i] != 0) {								//becouse that means user entered those numbers
				System.out.println("Number " + i + " was entered: " + nums[i]
						+ " times.");
			}
		}

	}

}
