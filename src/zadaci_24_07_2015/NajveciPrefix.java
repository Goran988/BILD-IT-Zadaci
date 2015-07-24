package zadaci_24_07_2015;

import java.util.Scanner;

public class NajveciPrefix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite dva stringa:"); // trazimo od korisnika da
													// unese dva stringa
		String one = input.nextLine();
		String two = input.nextLine();
		najveciPrefix(one, two); // prosledjujemo stringove u metod

	}

	public static void najveciPrefix(String a, String b) {
		String result = ""; // string u koji cemo smjestiti zajednicki prefix
		int length = 0;
		String[] strA = a.split(" ");				//oba stringa dodajemo u niz, tako sto razdvajamo svako rijec po "spacu"
		String[] strB = b.split(" ");
		if (strA.length > strB.length) {			//odredjujemo duzinu koju koristimo za broj iteracija petlje, tako sto uzimamo duzinu manje niza
			length = strB.length;
		} else {
			length = strA.length;
		}
		for (int i = 0; i < length; i++) {
			if (strA[i].equals(strB[i])) {			//poredimo i-ti clan prvog niza sa i-tim clanom drugog niza, ukoliko su isti dodajemo u string result
				result += strA[i] + " ";
			}
		}
		if (result.length() > 0)					//ukoliko je duzina stringa result veca od 0, tj. ako nije prazan ispisujemo ga
			System.out.println("Najveci zajednicki prefix je:\n" + result);
		else										//ukoliko je string result prazan obavestavamo korisnika da nizovi nemaju zajednicki prefix
			System.out.println("Dva stringa nemaju zajednicki prefix.");
	}
}
