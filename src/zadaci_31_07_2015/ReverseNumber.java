package zadaci_31_07_2015;

import java.util.Scanner;

public class ReverseNumber {
	/**
	 * Write a method that takes number and prints it in reversed order.
	 *
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number:");		//asking user for input
		int num = input.nextInt();						//taking the input
		reverse(num);									//invoking method

	}

	public static void reverse(int num) {
		String line = Integer.toString(num); 			// converting from int to string
		String res = "";								// new string that we will use to store new number
		for (int i = line.length() - 1; i >= 0; i--) { 	//loop going from the back of the string to the 0 index
			res += line.charAt(i);						//adding to the res string one one by one "digit" from back to front
		}
		System.out.println(res); 						//printing out the result
	}
}
