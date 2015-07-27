package zadaci_27_07_2015;

import java.util.Scanner;

public class UdeljenostIzmedjuDvijeTackeKruga {
//zadatak dva
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.println("Unesite geografsku sirinu i duzinu prve lokacije(zapad i sjever kao pozitivne vrijednosti, istok i jug kao negativne:");
		double firstX = Math.toRadians(input.nextDouble());			//korisnik unosi geografsku sirinu koju pri unosu pretvaramo u radijane(prva tacka)
		double firstY = Math.toRadians(input.nextDouble());			//korisnik unosi geografsku duzinu koju pri unosu pretvaramo u radijane
		System.out
				.println("Unesite geografsku sirinu i duzinu prve lokacije(zapad i sjever kao pozitivne vrijednosti, istok i jug kao negativne:");
		double secondX = Math.toRadians(input.nextDouble());		//korisnik unosi geografsku sirinu koju pri unosu pretvaramo u radijane(druga tacka)
		double secondY = Math.toRadians(input.nextDouble());		//korisnik unosi geografsku duzinu koju pri unosu pretvaramo u radijane
		double earthRadius = 6371.01;								//precnik zemlje u KM
		double distance = earthRadius								//formula za racunanje "Great Circle Distance"
				* Math.acos(((Math.sin(firstX) * Math.sin(secondX)) + (Math
						.cos(firstX) * Math.cos(secondX) * Math.cos(firstY
						- secondY))));
		System.out.println("Udaljenost izmedju dvije tacke je: " + distance);	//ispisujemo rezultat
	}

}
