package zadaci_28_07_2015;

import java.util.Scanner;

public class IsStringASubstring {
	/**
	 * @author Goran Write a program that asks user to input two strings, and
	 *         that check if second string is substring of a first string.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.println("Enter two strings(string A and string you want to check if it's substring of string A:");
		String a = input.nextLine();						//user inputs first string
		String b = input.nextLine();						//user inputs seconds string(the one we want to check if it's substring)
		input.close();
		if (a.contains(b)&&!a.equals(b))					//checking if string a contains string b, but not equal
			System.out.println("Substring \"" + b			//printing results depending of the outcome of "if" statement
					+ "\" is a substring of string \"" + a + "\"");
		else
			System.out.println(("Substring \"" + b
					+ "\" is not a substring of string \"" + a + "\""));
	}

}
