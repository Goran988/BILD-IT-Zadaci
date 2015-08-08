package zadaci_07_08_2015;

import java.util.Scanner;

public class ConsecutiveEqualFour {
	/**
	 * Write the following method that tests whether the array has four
	 * consecutive numbers with the same value. public static boolean
	 * isConsecutiveFour(int[] values) Write a test program that prompts the
	 * user to enter a series of integers and displays if the series contains
	 * four consecutive numbers with the same value.
	 * 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of values:");
		int[] nums = new int[input.nextInt()];					//creating array of integers(user enters size)
		System.out.println("Enter the values:");
		for (int i = 0; i < nums.length; i++) {					//user fills out the array
			nums[i] = input.nextInt();
		}
		if(isConsecutiveFour(nums)){							//if method result is true array have 4 consecutive numbers
			System.out.println("The list have consecutive fours");
		}
		else{													//else array doesn't have 4 consecutive numbers
			System.out.println("The list has no consecutive fours");
		}

	}

	public static boolean isConsecutiveFour(int[] values) {
		int counter = 0;
		boolean result = false;
		for (int i = 0; i < values.length - 1; i++) {
			if (values[i] == values[i + 1]) {					//comparing current value to the next one
				counter++;										//if they match we increment the counter
			} else {
				counter = 0;									//else we reset counter to zero
			}
			if (counter == 3) {									//with three matches(and first value where counter was 0) we get 4 consecutive numbers
				result = true;									//boolean result is true
				break;
			}
		}
		return result;											//return result

	}

}
