package zadaci_04_08_2015;

import java.util.Scanner;

public class FormatNumberLeadingZeros {
	/**
	 * Program that adds leading zeros to the number user entered.
	 * 
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number and number of digits you want it writen in:");
		System.out.println(format(input.nextInt(), input.nextInt()));			//printing out result of method with numbers user entered
	}

	public static String format(int number, int width) {
		String a = Integer.toString(number);
		String res = "";
		for (int i = 0; i < (width - a.length()); i++) { // adding leading
															// zeroes to the res
															// string, number of
															// zeros added is
															// width user wanted
															// - number of
															// digits
			res += '0';
		}
		res += a;											//adding the number to res string
		return res;											//returning the res string
	}
}
