package zadaci_24_07_2015;

import java.util.Scanner;

public class BrojSlovaUStringu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite neki string:");
		String line = input.nextLine();										//korisnik unosi string
		System.out.println("Uneseni string ima: " + countLetters(line)		//stampamo rezultat
				+ " slova");
	}

	public static int countLetters(String s) {
		int counter = 0;													//brojac slova 
		s = s.toLowerCase();												//string pretvaramo u string sa svim malim slovima da skratimo posao
		for (int i = 0; i < s.length(); i++) {								//petljom prolazimo kroz string
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {					//pomoci ascii koda provjeravamo da li je svaki character slovo
				counter++;													//ukoliko je slovo uvecavamo brojac za 1
			}
		}
		return counter;														//vracamo rezultat odnosno broj slova

	}
}
