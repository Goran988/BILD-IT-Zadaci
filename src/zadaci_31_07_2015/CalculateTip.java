package zadaci_31_07_2015;

import java.util.Scanner;

public class CalculateTip {
	/**
	 * Write a program that asks user to enter the bill and precentage of tip. Program should
	 * calculate the tip, and print out both tip and bill + tip.
	 */

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the bill amount and tip in percentage:");			//ask user for input
		double bill = input.nextDouble();
		double tip = input.nextDouble();
		double tipAmmount = bill * (tip/100);										//formula to calculate tip ammount
		System.out.println("Your tip is: " + tipAmmount + " and whole bill is " + (bill + tipAmmount));		//printing out tip ammount and whole bill
	}

}
