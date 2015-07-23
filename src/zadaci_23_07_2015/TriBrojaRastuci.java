package zadaci_23_07_2015;

import java.util.Arrays;
import java.util.Scanner;

public class TriBrojaRastuci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite tri broja: ");
		double first = input.nextDouble();
		double second = input.nextDouble();
		double third = input.nextDouble();
		input.close();
		displaySortedNumbers(first, second, third);							//prosledjujemo brojeve koje je unjeo korisnik

	}

	public static void displaySortedNumbers(double num1, double num2,
			double num3) {
		double[] nums = { num1, num2, num3 };								//dodajemo u niz
		Arrays.sort(nums);													//sortiramo niz
		for (double e : nums) {												//"for each" petljom stampamo clanove niza
			System.out.print(e + " ");
		}
	}
}
