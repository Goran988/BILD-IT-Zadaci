package zadaci_07_08_2015;

import java.util.Scanner;

public class SumOfElements {
	/**
	 * (Sum elements column by column) Write a method that returns the sum of
	 * all the elements in a specified column in a matrix using the following
	 * header: public static double sumColumn(double[][] m, int columnIndex)
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] matrix = new double[3][4];
		System.out.println("Enter the values of your matrix");
		for (int i = 0; i < matrix.length; i++) {					//using nested loop to set elements of matrix
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		for(int i=0; i<4; i++){										//printing out sums of matrix column by column
			System.out.println("Sum of column " + i+ " is "+sumColumn(matrix, i));
		}
	}

	public static double sumColumn(double[][] m, int columnIndex) {
		//Method that goes through two dimensional array and sums elements of each column
		double sum = 0;
		for (int i = 0; i < m.length; i++) {				
			sum += m[i][columnIndex];				//adding to sum elements that coresponds to "column index"
		}
		return sum;

	}
}
