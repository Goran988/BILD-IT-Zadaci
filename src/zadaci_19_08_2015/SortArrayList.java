package zadaci_19_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write the following method that sorts an ArrayList of numbers: public static
 * void sort(ArrayList<Integer> list) Write a test program that prompts the user
 * to enter 5 numbers, stores them in an array list, and displays them in
 * increasing order.
 * 
 */
public class SortArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 integers:");
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list.add(input.nextInt());
		}
		sort(list);

	}

	/**
	 * method that uses bubble sort algorytm to sort array list
	 * 
	 * @param list
	 *            - array list we pass to the method
	 */
	public static void sort(ArrayList<Integer> list) {
		int temp = 0;
		boolean sorted = false;
		// if list is bigger than one we will use bubble sort
		if (list.size() > 1) {
			// loop will run until list is sorted
			while (!sorted) {
				// we set sorted to be true
				sorted = true;
				for (int i = 0; i < list.size() - 1; i++) {
					// if current element is bigger than the next one we swap
					// their places
					if (list.get(i) > list.get(i + 1)) {
						// if swap occured it we set sorted to false to run
						// outer loop one more time
						sorted = false;
						temp = list.get(i);
						list.set(i, list.get(i + 1));
						list.set(i + 1, temp);
					}
				}
			}
		}
		// printing out the new list
		System.out.println(list);
	}

}
