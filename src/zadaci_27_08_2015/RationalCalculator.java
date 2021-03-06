package zadaci_27_08_2015;

/**
 * Write a program similar to Listing 7.9, Calculator.java. Instead of using
 * integers, use rationals, as shown in Figure 13.10a. You will need to use the
 * split method in the String class, introduced in Section 10.10.3, Replacing
 * and Splitting Strings, to retrieve the numerator string and denominator
 * string, and convert strings into integers using the Integer.parseInt method.
 */
public class RationalCalculator {

	public static void main(String[] args) {
		//creating string array from string passed by cmd
		String[] line = args[0].split(" ");
		//element at index 0 is first number
		String first = line[0];
		//element at index 1 is operation wanted(division, subtraction...)
		String operation = line[1];
		//element at index 2 is second number
		String second = line[2];
		//numerator for first number
		int numFirst = Integer.parseInt(first.split("/")[0]);
		//denominator for first number
		int denFirst = Integer.parseInt(first.split("/")[1]);
		//first rational number
		Rational ratFirst = new Rational(numFirst, denFirst);
		//numerator for second number
		int numSecond = Integer.parseInt(second.split("/")[0]);
		//denominator for second number
		int denSecond = Integer.parseInt(second.split("/")[1]);
		//second rational number
		Rational ratSecond = new Rational(numSecond, denSecond);
		//result object
		Rational result = new Rational();
		//depending of the operation sign we assign result different value
		if (operation == "+")
			result = ratFirst.add(ratSecond);
		else if (operation == "-")
			result = ratFirst.subtract(ratSecond);
		else if (operation == "*")
			result = ratFirst.multiply(ratSecond);
		else if (operation == "/")
			result = ratFirst.divide(ratSecond);
		else {
			System.out.println("Operation not suported");
			System.exit(1);
		}
		//printing out result
		System.out.println(ratFirst + " " + operation + " = " + result);
	}

}
