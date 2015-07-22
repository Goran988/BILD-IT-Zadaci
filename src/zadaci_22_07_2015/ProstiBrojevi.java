package zadaci_22_07_2015;

import java.util.Scanner;

public class ProstiBrojevi {
//prvi zadatak
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);			//trazimo od korisnika da unese pocetni i krajnji broj i koliko
		System.out										//brojeva da stampamo po liniji
				.println("Unesite pocetni i krajnji prosti broj, te koliko brojeva zelite da stampatu po liniji:");	
		int first = input.nextInt();
		int last = input.nextInt();
		int nums = input.nextInt();
		prostiBrojevi(first, last, nums);

	}

	public static void prostiBrojevi(int first, int last, int nums) {
		int counter = 0;								//brojac nam je potreban da bi znali koliko smo brojeva odstampali
		for (int i = first; i <= last; i++) {			//petlja koja ide od pocetnog do krajnjeg broja
			boolean isPrime = true;						//boolean vrijednost ukoliko je broj prost
			for (int j = 2; j < i; j++) {				
				if (i % j == 0) {						//provjeravamo da li je broj djeljiv sa nekim drugim brojem bez ostatka
					isPrime = false;					//ukoliko jeste broj nije prost
					break;								//prvi put kad se desi da je dijeljiv bez ostatka prekidamo petlju
				}
			}
			if (isPrime && i!=1 && i!=0) {						//ukoliko je broj prost, a nije broj 1 stampao i brojac uvecamo za 1
				counter++;
				System.out.print(i + " ");
				if (counter % nums == 0) {				//kad je brojac djeljiv sa brojem koji je korisnik unjeo prebacujem ispisivanje u novi red
					System.out.println();
				}
			}

		}

	}
}
