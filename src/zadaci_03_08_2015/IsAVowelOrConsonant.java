package zadaci_03_08_2015;

import java.io.IOException;
import java.util.Scanner;

public class IsAVowelOrConsonant {
	/**
	 * Program that takes character from user and prints out if it's consonant
	 * or vowel.
	 * 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.println("Enter the character you want to check to see if it's vowel or consonant:");
		char ch = input.next().charAt(0);
		if (isVowel(ch)) {													//if character is vowel we print message that it's a vowel
			System.out.println("Character you entered is a vowel.");
		} else if (!isVowel(ch) && Character.isLetter(ch)) {				//if character is not a vowel and it is a letter, we print a message that it's a consonant
			System.out.println("Character you entered is a consonant.");
		} else {															//else character is neither
			System.out
					.println("Your character is neither vowel nor consonant.");
		}
	}

	public static boolean isVowel(char ch) {
		//method that determines if characther is vowel, return true if it is and false if it's not
		if ((ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
				|| (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'))
			return true;
		else
			return false;

	}
}
