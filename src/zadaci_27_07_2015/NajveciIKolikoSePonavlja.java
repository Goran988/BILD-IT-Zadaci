package zadaci_27_07_2015;

import java.util.Scanner;

public class NajveciIKolikoSePonavlja {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // pravimo skener objekat pomocu
		// kojeg korisnici unose brojeve
		// obavestavamo korisnika da treba da unesu brojeve
		System.out.println("Unesite niz brojeva, unos zavrsava sa 0");
		int counter = 0; // brojac, da bi mogli da znamo koliko puta se broj
		// ponovio
		int max = 0; // varijabla koja biljezi koji je najveci broj
		int unos = 0; // unos korisnika, 0 se mjenja unosom preko skenera
		do {
			unos = input.nextInt();
			if (max == 0) { // neophodno da bi se izbjeglo da 0 prikazuje kao
							// najveci u slucaju unosa negativnih brojeva
				max = unos; // jer max inicijaliziramo kao 0
			}
			if (unos == 0) { // takodje u slucaju negativnih brojeva
								// zaustavljamo petlju da ne bi koristilo 0 kao
								// max
				break;
			} else {
				if (max < unos) { // ukoliko je trenutna max vrijednost manja od
									// unosa, unos postaje max vrijednost
					max = unos;
					counter = 1;
				} else if (max == unos) {
					counter++; // ukoliko je max vrijednost jednaka unosu
								// povecavamo counter za 1
				}
			}
		} while (unos != 0);
		System.out.println("Najveci broj je " + max + " a unesen je " + counter // printamo
																				// koji
																				// je
																				// najveci
																				// broj
																				// i
																				// koliko
																				// se
																				// puta
																				// ponovio
				+ " puta.");

	}

}
