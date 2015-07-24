package zadaci_24_07_2015;

import java.util.Scanner;

public class StedniRacun {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.println("Unesite iznos mjesecne stednje i broj mjeseci nakon kojih vas zanima stanje na racunu:");
		double balance = input.nextDouble();			//korisnik unosi koliko ce uplacivati mjesecno
		int months = input.nextInt();					//korisnik unosi koliko mjeseci ce vrsiti uplate
		double monthlyInterest = 0.05 / 12;				//mjesecna kamata
		double sum = 0;
		for (int i = 0; i < months; i++) {				//petlja se izvrsava onoliko puta, koliko je uneseno mjeseci
			sum = (balance + sum) * (1 + monthlyInterest);		//formula koja stanje na racunu nakon svake uplate
		}
		System.out.printf("%.3f", sum);					//ispisujemo rezultat, pri cemu zaokruzujemo na 3 decimale
	}
}
