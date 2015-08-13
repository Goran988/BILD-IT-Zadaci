package zadaci_12_08_2015;

public class MyInteger {
	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	/**
	 * @return returns value of MyInteger object
	 */
	public int getValue() {
		return value;
	}

	/**
	 * 
	 * @return returns true if value is even and false if it's not
	 */
	public boolean isEven() {
		if (this.value % 2 == 0)
			return true;
		else
			return false;
	}

	/**
	 * 
	 * @return returns true if value if odd and false if it's not
	 */
	public boolean isOdd() {
		if (this.value % 2 != 0)
			return true;
		else
			return false;
	}

	/**
	 * 
	 * @return returns if the value of the object is prime number
	 */
	public boolean isPrime() {
		for (int i = 2; i < this.value; i++) {
			if (this.value % i == 0)
				return false;
		}
		return true;
	}

	/**
	 * static method that checks if the number is even
	 * 
	 * @param num
	 *            number we pass to the method
	 * @return returns true if number is even and false if it's not
	 */
	public static boolean isEven(int num) {
		if (num % 2 == 0)
			return true;
		else
			return false;
	}

	/**
	 * static method that checks if the number is odd
	 * 
	 * @param num
	 *            number we pass to the method
	 * @return returns true if the number is odd and false if it's not
	 */
	public static boolean isOdd(int num) {
		if (num % 2 != 0)
			return true;
		else
			return false;

	}

	/**
	 * static method that checks if the number passed to the method is prime
	 * 
	 * @param n
	 *            number we pass to the method
	 * @return returns true if number is prime and false if it's not
	 */
	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	/**
	 * static method that checks if the value of the passed object is even
	 * 
	 * @param num
	 *            object we pass to method
	 * @return returns true if value is even and false if it's not
	 */
	public static boolean isEven(MyInteger num) {
		return isEven(num.value);
	}

	/**
	 * static method that checks if the value of the passed object is odd
	 * 
	 * @param num
	 *            object we pass to the method
	 * @return returns true if value of object is odd and false if it's not
	 */
	public static boolean isOdd(MyInteger num) {
		return isOdd(num.value);
	}

	/**
	 * static method that checks if the value of MyInteger object is prime
	 * number
	 * 
	 * @param num
	 *            object we pass to the method
	 * @return returns true if it is and false if it's not
	 */
	public static boolean isPrime(MyInteger num) {
		return isPrime(num.value);
	}

	/**
	 * method that checks if value of MyInteger object is equal to number we
	 * passed to method
	 * 
	 * @param num
	 *            number we pass to method
	 * @return returns true if they're equal and false if they're not
	 */
	public boolean equals(int num) {
		if (this.value == num)
			return true;
		else
			return false;
	}

	/**
	 * 
	 * @param num
	 *            object of MyInteger class we pass to the method
	 * @return returns true if values of objects are equal and false if they're
	 *         not
	 */
	public boolean equals(MyInteger num) {
		return equals(num.value);
	}

	/**
	 * 
	 * @param nums
	 *            character array that we convert into integer
	 * @return number we get by converting the characters array
	 */
	public static int parseInt(char[] nums) {
		String num = "";
		for (int i = 0; i < nums.length; i++) {
			num += nums[i];
		}
		return Integer.valueOf(num);
	}

	/**
	 * 
	 * @param num
	 *            String that we pass to method
	 * @return value of integer that we converted string into
	 */
	public static int parseInt(String num) {
		return Integer.valueOf(num);
	}
}
