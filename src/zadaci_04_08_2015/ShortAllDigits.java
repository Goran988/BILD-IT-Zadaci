package zadaci_04_08_2015;

import java.util.Scanner;

/**
 * Short numbers are stored in 16 bits, program have to print them out.
 *
 */
public class ShortAllDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your \"short\" number:");
		short num = input.nextShort();
		String str =Integer.toBinaryString(num);					//converting number to binary and storing it in string
		System.out.println(format(Integer.valueOf(str), 16));		//passing the value of the string to method that will add leading zeros

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
		res += a; // adding the number to res string
		return res; // returning the res string
	}

}
