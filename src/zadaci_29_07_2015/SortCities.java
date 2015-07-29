package zadaci_29_07_2015;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Goran Write a program that takes names of 3 cities, sort them by
 *         alphabet and print those names sorted.
 */
public class SortCities {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter names of 3 cities:"); // we ask user for names
														// of three cities
		String[] str = new String[3];
		str[0] = input.nextLine(); 						// we add the names into String array on
														// first 3 indexes
		str[1] = input.nextLine();
		str[2] = input.nextLine();
		input.close(); 									// closing scanner
		Arrays.sort(str); 								// we use sort method to sort cities
		System.out.println(Arrays.toString(str)); 		// converting array to string
														// for easier printing

	}

}
