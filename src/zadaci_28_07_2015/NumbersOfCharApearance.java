package zadaci_28_07_2015;

import java.io.IOException;
import java.util.Scanner;

public class NumbersOfCharApearance {
	/**
	 * @author Goran Write a method that finds and counts every characker
	 *         ocurance in a string, ask a user to input string and character he
	 *         wants method to find.
	 */
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string and character you want us to find: ");
		String line = input.nextLine(); 											// user inputs string
		char ch = (char) System.in.read();											//user inputs char he wants to count
		input.close();
		System.out.println("Number of ocurences of  character" + ch + " is : "		//printing out result
				+ count(line, ch));
	}

	public static int count(String str, char a) {
		str = str.toLowerCase();													//turning string to lower case so we don't skip the char in upper case
		int count = 0;																//used for counting char ocurances
		for (int i = 0; i < str.length(); i++) {									//loop going through the string and comparing every char with char user entered
			if (str.charAt(i) == a)													//if charAt(i) matches user's char we increment counter by 1
				count++;		
		}
		return count;																//returning the result
	}

}
