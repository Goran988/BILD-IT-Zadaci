package zadaci_04_08_2015;

import java.util.Scanner;

public class NumToCharASCII {
	/**
	 * Program that takes number from user range 0-127 and prints char that
	 * corresponds to that ASCII code.
	 */
	public static void main(String[] args) {
		System.out
				.println("Enter the ASCII code for you want converted(0-127)");
		Scanner input = new Scanner(System.in);
		System.out.println((char) input.nextInt());		//printing out the number user entered and casting it to char while printing
	}
}
