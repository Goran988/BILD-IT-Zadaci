package zadaci_21_08_2015;

/**
 * Write the bin2Dec(String binaryString) method to convert a binary string into
 * a decimal number. Implement the bin2Dec method to throw a
 * NumberFormatException if the string is not a binary string.
 * 
 *
 */
public class BinToDecimal {

	public static void main(String[] args) {
		// string num represents number in binary form
		String num = "101010";
		// printing out the result of the method
		System.out.println(bin2Dec(num));

	}

	/**
	 * method that converts binary string to integer
	 * 
	 * @param binaryString
	 *            - number in binary form
	 * @return integer representation of number
	 */
	public static int bin2Dec(String binaryString) {
		// if string consists of anything other than 0s and 1s method will throw
		// exception
		if (!binaryString.matches("[0-1]+")) {
			throw new NumberFormatException();
		}
		//converting string into integer
		int num = Integer.parseInt(binaryString, 2);
		return num;
	}

}
