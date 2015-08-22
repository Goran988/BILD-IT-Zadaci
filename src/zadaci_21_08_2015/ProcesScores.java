package zadaci_21_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Suppose that a text file contains an unspecified number of scores separated
 * by blanks. Write a program that prompts the user to enter the file, reads the
 * scores from the file, and displays their total and average.
 */
public class ProcesScores {

	public static void main(String[] args) throws FileNotFoundException {
		// scanner object that takes input from user
		Scanner input = new Scanner(System.in);
		// asking user for input
		System.out.println("Enter name of the file:");
		// file object with "name" taken from user
		File file = new File(input.next());
		// scanner object that reads from file
		Scanner in = new Scanner(file);
		double sum = 0;
		double average = 0;
		double count = 0;
		// loop that runs until there are no more tokens in file
		while (in.hasNext()) {
			// sum of all tokens
			sum += in.nextInt();
			// counter for tokens
			count++;

		}
		input.close();
		in.close();
		// average calculation
		average = sum / count;
		// printing out results
		System.out.println("Total is: " + sum);
		System.out.println("Average is: " + average);

	}
}
