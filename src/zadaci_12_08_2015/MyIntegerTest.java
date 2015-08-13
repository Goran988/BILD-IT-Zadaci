package zadaci_12_08_2015;

import zadaci_12_08_2015.MyInteger;

public class MyIntegerTest {
	// class with main method where we will test methods from MyInteger class
	public static void main(String[] args) {
		// instance of MyInteger class
		MyInteger m1 = new MyInteger(4);
		// method that tests if object of MyInteger class is even
		System.out.println("Object is even: " + m1.isEven());
		// static method that tests if the number is even
		System.out.println("Number is even: " + MyInteger.isEven(4));
		// method that tests if the object of MyInteger class is odd
		System.out.println("Object is odd: " + m1.isOdd());
		// static method that tests if the number is odd
		System.out.println("Number is odd: " + MyInteger.isOdd(4));
		// method that tests if the object of MyInteger class is prime
		System.out.println("Object is prime number: " + m1.isPrime());
		// static method that tests if the number is prime
		System.out.println("Number is prime: " + MyInteger.isPrime(7));
		// method that tests if object of MyInteger class is equal to passed
		// value
		System.out.println("Object is equal to number: " + m1.equals(3));
		// method that compares m1 object with new object of the MyInteger class
		System.out.println("Object is equal to object: "
				+ m1.equals(new MyInteger(4)));
		char[] ch = { '2', '3', '4' };
		// method that converts char array into an integer
		System.out.println(MyInteger.parseInt(ch));
		// method that converts string into an integer
		System.out.println(MyInteger.parseInt("1234"));

	}
}
