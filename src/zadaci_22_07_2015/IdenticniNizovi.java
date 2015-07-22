package zadaci_22_07_2015;

import java.util.Scanner;

public class IdenticniNizovi {
//treci zadatak
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite duzinu prvog niza brojeva: ");			//korisnik unosi duzinu prvog niza
		int[] first = new int[input.nextInt()];								//kreiramo prvi niz duzine korisnikovog unosa
		System.out
				.println("Unesite " + first.length + " elemenata prvog niza:");
		for (int i = 0; i < first.length; i++) {							//petljom popunjavamo prvi niz
			first[i] = input.nextInt();
		}
		System.out.println("Unesite duzinu drugog niza brojeva: ");				
		int[] second = new int[input.nextInt()];							//korisnik unosi duzinu drugog niza
		System.out.println("Unesite " + second.length						//kreiramo drugi niz duzine korisnikovog unosa
				+ " elemenata drugog niza:");
		for (int i = 0; i < second.length; i++) {							//petljom popunjavamo drugi niz
			second[i] = input.nextInt();
		}
		System.out.println(equals(first, second));							//stampamo rezultat poredjenja

	}

	public static boolean equals(int[] niz1, int[] niz2) {			
		if (niz1.length != niz2.length)										//ako nizovi nisu iste duzini, nisu ni identicni
			return false;
		else
			for (int i = 0; i < niz1.length; i++) {							//petljom poredimo i-ti clan prvog niza sa i-tim clanom drugog niza
				if (niz1[i] != niz2[i]) {
					return false;											//ukoliko se desi da clanovi nisu identicni vracamo vrijednost false
				}
			}
		return true;														//ako dodjemo do kraja niza bez da je doslo do razlike izmedju clanova vracamo
	}																		//vrijednost true

}
