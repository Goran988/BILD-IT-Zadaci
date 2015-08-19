package zadaci_19_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a method that returns the union of two array lists of integers using
 * the following header: public static ArrayList<Integer> union(
 * ArrayList<Integer> list1, ArrayList<Integer> list2) Write a test program that
 * prompts the user to enter two lists, each with five integers, and displays
 * their union. The numbers are separated by exactly one space in the output.
 */
public class CombineTwoLists {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 numbers for first list:");
		// creating first array list of integers
		ArrayList<Integer> list1 = new ArrayList<>();
		// populating the list with numbers from the user
		for (int i = 0; i < 5; i++) {
			list1.add(input.nextInt());
		}
		System.out.println("Enter 5 numbers for second list:");
		// creating second array list of integers
		ArrayList<Integer> list2 = new ArrayList<>();
		// opulating second list with numbers from user
		for (int i = 0; i < 5; i++) {
			list2.add(input.nextInt());
		}
		// printing out the results of the method
		System.out.println("Merged lists are: " + union(list1, list2));

	}

	/**
	 * method that merges two array lists into one
	 * 
	 * @param list1
	 *            - first array list
	 * @param list2
	 *            - second array list
	 * @return - array list that contains elements from both first and second
	 *         array lists
	 */
	public static ArrayList<Integer> union(ArrayList<Integer> list1,
			ArrayList<Integer> list2) {
		// adding all elements of list2 to list1
		list1.addAll(list2);
		// returns list1 that contains elements from both lists
		return list1;
	}

}
