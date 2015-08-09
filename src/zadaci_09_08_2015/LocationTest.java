package zadaci_09_08_2015;

import java.util.Scanner;

public class LocationTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of rows and columns");
		double[][] nums = new double[input.nextInt()][input.nextInt()];				//we create new array with number of columns/rows that user entered
		System.out.println("Enter values for you 2D array");
		for (int i = 0; i < nums.length; i++) {										//adding values to the 2D array
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = input.nextDouble();
			}
		}
		Location l1 = locateLargest(nums);											//creating object of location class
		System.out.println("The largest elements is: " + l1.maxValue				//printing out datafield values of location object
				+ "\nLocation is (" + l1.row + "," + l1.column + ")");

	}

	public static Location locateLargest(double[][] a) {	
		//method that goes through the array, finds largest elements and it's "coordinates" and than assign those values to location object
		Location location = new Location();
		int largestR = 0;
		int largestC = 0;
		double temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (temp < a[i][j]) {
					temp = a[i][j];
					largestR = i;
					largestC = j;
				}
			}
		}
		location.column = largestC;
		location.row = largestR;
		location.maxValue = temp;
		return location;							//returning as a result location object
	}
}
