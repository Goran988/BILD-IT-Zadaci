package zadaci_08_08_2015;

import java.util.Arrays;

public class SortTwoDimensionalArray {
	/**
	 * Write a method to sort a two-dimensional array using the following
	 * header: public static void sort(int m[][]) The method performs a primary
	 * sort on rows and a secondary sort on columns.
	 */
	public static void main(String[] args) {
		int[][] nums = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 },
				{ 4, 1 } };

		sort(nums);

	}

	public static void sort(int m[][]) {
		String[] nums = new String[m.length];					//creating string array
		Arrays.fill(nums, "");									//filling array with "" to avoid it beeing null
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				nums[i] += String.valueOf(m[i][j]) + " ";		//converting rows of our 2D array into string array

			}
		}
		Arrays.sort(nums);										//sorting the string array
		System.out.print("{");
		for (int i = 0; i < nums.length; i++) {					//printing out  the elements of sorted arrays and adding brackets where needed
			System.out.print("{" + nums[i].charAt(0) + "," + nums[i].charAt(2)
					+ "}");
		}
		System.out.print("}");

	}

}
