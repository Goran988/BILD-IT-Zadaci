package zadaci_02_08_2015;

import java.util.Scanner;

public class SocialSecurityNumber {
	/**
	 * Write a program that asks user to enter social security number in
	 * following format DDD-DD-DDDD, program should check if the number is
	 * correctly entered.
	 * 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter social security number(DDD-DD-DDDD format,D represents digit):");
		String num = input.next();
		if (num.matches("[1-9]{3}-[1-9]{2}-[0-9]{4}"))		//using regex(regular expresion) we check if the number user entered matches our desired format
			System.out.println("Your number is valid.");	//we notify the user if number is valid or not
		else
			System.out.println("Your number is not valid.");

	}
}
