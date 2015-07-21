package zadaci_21_07_2015;

import java.util.Scanner;

public class BrojPitanjaOduzimanje {
//drugi zadatak
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj pitanja koje zelite");		//trazimo od korisnika i kroz scaner prihvatamo broj pitanja
		int pitanja = input.nextInt();
		brojPitanja(pitanja);										//prosledjujemo broj pitanja u metod
	}

	public static void brojPitanja(int num) {	
		Scanner input = new Scanner(System.in);
		int tacniOdgovori = 0;										//brojac za tacne odgovore(broj netacnih dobijemo oduzimanjem od broja pitanja
		for (int i = 0; i < num; i++) {								//petlja koja se ponavlja koliko je pitanja uneseno
			int brojJedan = (int) (Math.random() * 100);			//nasumicni cijeli brojevi 0-100
			int brojDva = (int) (Math.random() * 100);
			System.out.println("Koliko je " + brojJedan + "-" + brojDva);	//pitamo korisnika za odgovor
			int odgovor = input.nextInt();				
			if (odgovor == (brojJedan - brojDva)) {					//ako je odgovor tacan razlici brojeva povecavamo brojac tacnih odgovora za 1
				tacniOdgovori++;
			}

		}
		System.out.println("Broj tacnih odgovora je: " + tacniOdgovori		//ispisujemo broj tacnih i netacnih odgovora
				+ "\nBroj netacnih odgovora je: " + (num - tacniOdgovori));
	}
}
