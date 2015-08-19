package zadaci_19_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a method that removes the duplicate elements from an array list of
 * integers using the following header: public static void
 * removeDuplicate(ArrayList<Integer> list) Write a test program that prompts
 * the user to enter 10 integers to a list and displays the distinct integers
 * separated by exactly one space.
 *
 */
public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 integers:");
		// creating array list where we will store numbers
		ArrayList<Integer> list = new ArrayList<>();
		// taking numbers from user
		for (int i = 0; i < 10; i++) {
			list.add(input.nextInt());
		}
		input.close();
		// invoking method
		removeDuplicate(list);

	}

	/**
	 * method that removes duplicate numbers(leaves only 1 occurance of each
	 * number)
	 * 
	 * @param list
	 *            - array list we pass to the method
	 */
	public static void removeDuplicate(ArrayList<Integer> list) {
		// creating new array list where we will store numbers
		ArrayList<Integer> unique = new ArrayList<Integer>();
		// loop will check every element of the list
		for (int i = 0; i < list.size(); i++) {
			// if unique list doesn't contain the element loop is at it adds it
			// to the unique list
			if (!unique.contains(list.get(i))) {
				unique.add(list.get(i));
			}
		}
		// printing out old and new lists
		System.out.println("Numbers you entered are: " + list
				+ "\nUnique numbers are: " + unique);
	}

}
