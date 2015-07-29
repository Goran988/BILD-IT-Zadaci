package zadaci_29_07_2015;

import java.util.Scanner;

public class ConvertMinutesToYearsAndDays {
	/**
	 * Write a program that asks user to input number of minutes and to convert
	 * it to years and days.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes:");					//ask user for input
		long minutes = input.nextLong();									//we take users input as long data type
		input.close();														//closing scanner object
		int year = (int) (minutes / 525600);								//calculating year by dividing minutes by number of minutes in a year
		int days = (int) (minutes%525600)/1440;								//calculating days by dividing what's left from years, with 1440
		System.out.println(minutes + " minutes is " + year + " years and "
				+ days + " days.");
	}

}
