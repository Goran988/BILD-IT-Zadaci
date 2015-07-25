package zadaci_25_07_2015;

import java.util.Scanner;

public class MinimalnaDuzinaPiste {
//peti zadatak
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite brzinu aviona u m/s i ubrzanje u m/s:");
		double speed = input.nextDouble();										//korisnik unosi brzinu aviona
		double acceleration = input.nextDouble();								//korisnik unosi ubrzanje aviona 
		double length = speed * (speed / (2 * acceleration));					//formula za racunanje potrebne duzine piste
		System.out.printf("%.3f", length);										//stampamo rezultat i zaokruzujemo na 3 decimalna mjesta

	}

}
