package zadaci_02_08_2015;

import java.util.Scanner;

public class PiramidByNumber {
	/**
	 * Write a program that will ask a number from a user and than print a
	 * piramide up to that number.
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {					//first loop gives the piramid the height by going to new line in each iteration
			System.out.println();
			for (int m = n; m >= i; m--) {				//nested loop inserts empty space on the left side
				if (m >= 10) {
					System.out.print("   ");
				} else {
					System.out.print("   ");
				}
			}
			for (int j = i; j >= 1; j--) {				//loop that prints number from the max number in the iteration towards 1
				if (j >= 10) {
					System.out.print(" " + j);
				} else {
					System.out.print("  " + j);
				}
			}
			for (int a = 2; a <= i; a++) {				//loop that prints number from 1 to max number in the iteration
				if (a >= 10) {
					System.out.print(" " + a);
				} else {
					System.out.print("  " + a);
				}
			}
		}

	}

}
