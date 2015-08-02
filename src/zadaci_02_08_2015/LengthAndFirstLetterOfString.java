package zadaci_02_08_2015;

import java.util.Scanner;

public class LengthAndFirstLetterOfString {
	/**
	 * Write a program that asks user for a string and than shows the length and
	 * the first letter.
	 * 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");							//we ask user for a sentence
		String line = input.nextLine();
		System.out.println("Length of your sentence is " + line.length());	//print out length of the sentence
		System.out.println("First letter is " + line.charAt(0));			//printing out first character of the string

	}

}
