package zadaci_03_08_2015;

import java.util.Scanner;

public class ReverseString {
	/**
	 * Write a program that takes a string from user and prints it out
	 * backwards.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string you want writen backwards:");
		String line = input.nextLine();							//taking input from user
		String reverse = "";									//making new string which we'll use to store the users string backwards
		for (int i = line.length() - 1; i >= 0; i--) {			//loop going from the last index of the string towards index 0
			reverse += line.charAt(i);							//adding char at "i" index
		}
		System.out.println(reverse);							//printing out the reversed string
	}

}
