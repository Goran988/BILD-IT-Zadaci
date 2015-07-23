package zadaci_23_07_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class StoBrojevaProsjek {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.println("Unesite cijele brojeve, nula zavrsava unos, ili 100 unesenih brojeva.");
		double sum = 0;
		int aboveAndAverage = 0;
		ArrayList<Integer> lista = new ArrayList<>();						//brojeve smjestamo u listu jer ne znamo koliko ce ih biti uneseno
		for (int i = 0; i < 100; i++) {										//petlja koja se izvrsava 100 puta, u kojoj unosimo brojeve
			int num = input.nextInt();										
			if (num == 0)													//ukoliko je uneseni broj 0 prekidamo rad petlje
				break;
			else {
				lista.add(num);												//u listu dodajemo broj koji unosi korisnik
				sum += num;													//sumu uvecavamo za uneseni broj
			}
		}
		double average = sum / lista.size();								//prosjek racunamo tako sto sumu podjelimo sa brojem unesenih brojeva
		for (Integer e : lista) {											//petljom prolazimo kroz listu i provjeravamo za svaki clan da li je veci 
			if (e >= average) {												//ili manji od prosjeka
				aboveAndAverage++;											//ukoliko je veci/jednak uvecavamo brojac za brojeve iznad ili jednako prosjeku
			}
		}
		System.out.println("Uneseno je " + lista.size() + " brojeva");		//stampamo rezultate
		System.out.printf("Prosjek je %.2f", average);
		System.out.println("\nBrojeva iznad ili jednako prosjeku: "
				+ aboveAndAverage);
		System.out.println("Brojeva ispod prosjeka: "
				+ (lista.size() - aboveAndAverage));

	}
}
