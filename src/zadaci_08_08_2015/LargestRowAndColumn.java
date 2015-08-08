package zadaci_08_08_2015;

public class LargestRowAndColumn {
	/**
	 * Write a program that randomly fills in 0s and 1s into a 4-by-4 matrix,
	 * prints the matrix, and finds the first row and column with the most 1s.
	 */
	public static void main(String[] args) {
		int[][] nums = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				nums[i][j] = (int) (Math.random() * 2); // populating matrix
														// with 0s and 1s
			}
		}
		for (int i = 0; i < 4; i++) { // printing out matrix for user to see
			for (int j = 0; j < 4; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		int row = 0;
		int rowSum = 0;
		int rowSumTemp = 0;
		int column = 0;
		int columnSum = 0;
		int columnSumTemp = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) { // getting sums for both rows and
											// columns
				rowSum += nums[i][j];
				columnSum += nums[j][i];
			}
			if (rowSum > rowSumTemp) { // we use temporary value to compare
										// current sum with sum of the previous
										// row/column
				row = i; // if current sum is higher it means it has more 1s and
							// we assign that row/column to be the one with
							// highest number of 1s
				rowSumTemp = rowSum;
			}
			rowSum = 0; // reseting sum for every new row
			if (columnSum > columnSumTemp) {
				column = i;
				columnSumTemp = columnSum;
			}
			columnSum = 0; // reseting sum for every new column
		}
		System.out.println("Row with most 1s " + row);
		System.out.println("Column with most 1s " + column);

	}

}
