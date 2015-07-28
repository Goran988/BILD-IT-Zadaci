package zadaci_28_07_2015;

import java.util.Scanner;

/**
 * @author Goran Write a method that returns number of days in a year and write
 *         a program that asks for users input for starting and ending year, and
 *         write number of days for years in between.
 */
public class NumberOfDaysInAYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter starting and ending year: ");
		int first = input.nextInt();								//user inputs starting year
		int last = input.nextInt();									//user inputs ending year
		input.close();
		for(int i = first; i<=last; i++){							//loop that goes from starting to(and including) ending year
			System.out.print(numberOfDayInAYear(i)+" ");			//invoking and printhing method in every loop iteration
		}

	}
	public static int numberOfDayInAYear(int year){
		if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0))	//if it's a leap year returns 366 days
			return 366;
		else														//else returns 365 days
			return 365;
	}

}
