package zadaci_17_08_2015;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * Write the following method that returns the maximum value in an ArrayList of
 * integers. The method returns null if the list is null or the list size is 0.
 * public static Integer max(ArrayList<Integer> list)
 * Write a test program that prompts the user to enter a sequence of numbers ending with 0, and invokes
 * this method to return the largest number in the input.
 */
public class MaximumElementArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your numbers, input ends with 0");
		int num;
		ArrayList<Integer> nums = new ArrayList<>();
		//loop that goes until 0 is entered
		while ((num = input.nextInt()) != 0) {
			//adding numbers to the list
			nums.add(num);

		}
		//printing out the result
		System.out.println("Max number was: " + max(nums));

	}
/**
 * method that sorts list and returns last element which is the highest one
 * @param list - array list we pass to the method
 * @return - max element of the list
 */
	public static Integer max(ArrayList<Integer> list) {
		Collections.sort(list);
		return list.get(list.size() - 1);

	}

}
