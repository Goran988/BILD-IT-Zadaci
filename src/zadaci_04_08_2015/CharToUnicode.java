package zadaci_04_08_2015;

import java.util.Scanner;

/**
 * Program that converts character into Unicode.
 *
 */
public class CharToUnicode {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the char you want to convert into Unicode:");
		char ch = input.next().charAt(0); // taking input from user, in case
											// user enters string instead of
											// char we'll take first char of the
											// string
		System.out.println("Unicode is: " + (int) ch);	//printing out character by casting it into integer

	}

}
