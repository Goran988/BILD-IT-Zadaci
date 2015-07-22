package zadaci_22_07_2015;

import java.util.Arrays;
import java.util.Scanner;

public class NajmanjiElement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] array = new double[10];							//niz duzine 10
		System.out.println("Unesite deset decimalnih brojeva: ");	
		for (int i = 0; i < array.length; i++) {					//petljom popunjavamo niz, brojevima koje korisnik unosi
			array[i] = input.nextDouble();
		}
		System.out.println("Najmanje element u nizu je broj: " + min(array));			//stampamo rezultat

	}

	public static double min(double[] array) {
		Arrays.sort(array);											//sortiramo niz
		return array[0];											//prvi clan sortiranog niza je ujedno i najmanji
	}

}
