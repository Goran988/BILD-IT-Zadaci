package zadaci_03_08_2015;

import java.util.Scanner;

public class NumberOfUpperCase {
	/**
	 * Program that count the number of uppercase letters.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.println("Enter the sentence you want to have upper case characters counted for:");
		String line = input.nextLine();					//taking input from user
		int count = 0;
		for(int i=0; i<line.length(); i++){				//using loop to go through the string
			if(Character.isUpperCase(line.charAt(i))){	//if current character is upper case we increment count
				count++;
			}
		}
		System.out.println("Number of upper case characters is: "+count);	//printing out result

	}

}
