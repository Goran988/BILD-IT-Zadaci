package zadaci_08_08_2015;

public class EvenNumberOfOnes {
	/**
	 * Write a program that generates a 6-by-6 two-dimensional matrix filled
	 * with 0s and 1s, displays the matrix, and checks if every row and every
	 * column have an even number of 1s.
	 */
	public static void main(String[] args) {
		int[][] nums = new int[6][6];
		for (int i = 0; i < 6; i++) {						//generating and filling 2D array with 0s and 1s
			for (int j = 0; j < 6; j++) {
				nums[i][j] = (int) (Math.random() * 2);
			}
		}
		int sumRow = 0;
		int sumColumn = 0;
		boolean even = true;
		for (int[] e : nums) {
			for (int i : e) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < 6; i++) {					//getting sum for all rows and columns
			for (int j = 0; j < 6; j++) {
				sumRow += nums[i][j];					//sum for rows in matrix
				sumColumn+=nums[j][i];					//sum for columns in matrix
			}
			if (sumRow % 2 != 0 || sumColumn%2!=0) {	//if sums of rows/columns can be divided by 2 with no remainder number of 1s was even
				even = false;
				break;
			}

		}
		if(even){										//depending of boolean even we print the result
			System.out.println("Number of 1s in rows and columns is even");
		}
		else {
			System.out.println("Number of 1s in rows and columns is not even");
		}

	}

}
