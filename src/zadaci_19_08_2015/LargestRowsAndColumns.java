package zadaci_19_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a program that randomly fills in 0s and 1s into an n-by-n matrix,
 * prints the matrix, and finds the rows and columns with the most 1s
 *
 */
public class LargestRowsAndColumns {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of your matrix:");
		int n = input.nextInt();
		// 2D array with size uzer entered
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// assigning values to the elements with Math.random method in
				// this case 1s and 0s
				matrix[i][j] = (int) (Math.random() * 2);
				// printing out the matrix
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		input.close();
		// printing out the results for rows
		System.out.println("Largest row is " + getRows(matrix));
		// printing out the results for columns
		System.out.println("Largest column is " + getColumns(matrix));

	}

	/**
	 * method that finds rows with most 1s and add them to array list
	 * 
	 * @param a
	 *            - 2D array we pass to the method
	 * @return - array list with indexes of rows with most 1s
	 */
	public static ArrayList<Integer> getRows(int[][] a) {
		// in temp value we store maximum number of 1s
		int temp = 0;
		// list that will store the indexes
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j < a[i].length; j++) {
				// we're getting sum for every row
				sum += a[i][j];
			}
			// if sum is larger than temp we assign to the temp value of sum
			if (sum > temp) {
				temp = sum;
				// in case we found row with larger value we clear the list and
				// start add new index
				list.clear();
				list.add(i);
			} else if (sum == temp) {
				// else we just add new index
				list.add(i);
			}
		}
		// returns list with indexes
		return list;
	}

	/**
	 * method that finds columns with most 1s and store their indexes into array
	 * list
	 * 
	 * @param a
	 *            - 2D array we pass to method
	 * @return - returns array list with indexes of columns with most 1s
	 */
	public static ArrayList<Integer> getColumns(int[][] a) {
		// temp value where most number of 1s is stored
		int temp = 0;
		// list where we store the indexes
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			// sum for every column
			int sum = 0;
			for (int j = 0; j < a[i].length; j++) {
				sum += a[j][i];
			}
			// if sum is larger than temp we assign to the temp value of sum
			if (sum > temp) {
				temp = sum;
				// in case we find column with larger number of 1s we clear the
				// list and add new index
				list.clear();
				list.add(i);
			} else if (sum == temp) {
				// else we add the new index
				list.add(i);
			}

		}
		// returns the list with indexes
		return list;
	}
}
