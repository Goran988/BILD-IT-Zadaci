package zadaci_04_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class UniqueOutOfTen {
	/**
	 * Program that takes 10 numbers, prints out how many of them were unique
	 * and prints out unique numbers.
	 */
	public static void main(String[] args) {
		System.out.println("Enter 10 numbers:");
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<>(); // array list that we will
														// use to store unique
														// numbers
		for (int i = 0; i < 10; i++) { // loop that will do 10 iterations
			int num = input.nextInt();
			if (!nums.contains(num)) { // if list doesn't contain the number we add it, that way we make sure numbers are added just once
				nums.add(num);
			}
		}
		System.out.println("Unique numbers are:");
		for(Integer e:nums){								//printing out elements of the list
			System.out.print(e+" ");
		}
		System.out.println("\nThere are "+nums.size()+" unique numbers.");		//printing out size of the list
	}

}
