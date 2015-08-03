package zadaci_03_08_2015;

import java.util.Scanner;

public class IntToBinary {
	/**
	 * Program that converts integer into binary number.
	 * 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.println("Enter the ineger you want to convert into binary number:");
		int num = input.nextInt();
		String res = "";
		/**
		 * Loop work in a way that we're dividing the number with 2, if there is
		 * no leftover we add 0, if leftover is 1 we add 1, and we continue
		 * dividing as long as the number is bigger than zero. String that we
		 * get as result is reversed version of binary number, so we print it
		 * from back to front.
		 * 
		 */
		if (num > 0) {

			while (num > 0) {

				res += num % 2;

				num = num / 2;
			}
			for (int i = res.length() - 1; i >= 0; i--) {
				System.out.print(res.charAt(i));
			}
		}
	}
}
