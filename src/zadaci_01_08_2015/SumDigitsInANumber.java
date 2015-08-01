package zadaci_01_08_2015;

import java.util.Scanner;

/**
 * Write a program that will print sum of all digits in the number.
 *
 */
public class SumDigitsInANumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number you want to get sum for:");
		int num = input.nextInt();										//taking input from user
		sumOfDigits(num);						
	}

	public static void sumOfDigits(int num) {
		int temp = num;												
		int sum = 0;
		while (temp != 0) {												//loop will keep going until number is single digit
			sum += (temp % 10);											//we add to the sum rightmost number
			temp = temp / 10;											//assingning the new value without rightmost number to temp variable
		}
		System.out.println(sum);										//printing out result
	}

}
