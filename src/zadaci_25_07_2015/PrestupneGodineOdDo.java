package zadaci_25_07_2015;
import java.util.Scanner;

public class PrestupneGodineOdDo {
//drugi zadatak
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite pocetnu i krajnju godinu: ");
		int first = input.nextInt();							//korisnik unosi pocetnu godinu
		int last = input.nextInt();								//korisnik unosi krajnju godinu
		input.close();											//zatvaramo scanner
		int counter = 0; // brojac godina, koji sluzimo i za prebacivanje u novi
							// red nakon sto dodjemo do 10
		for (int i = first; i <= last; i++) { // petlja koja ide od pocetne do
												// krajnje godine
			if ((i % 4 == 0 && i % 100 != 0 || i % 400 == 0)) { // logicki uslov
																// kojim
																// provjeravamo
																// da li je
																// godina
																// prestupna
				System.out.print(i + " "); // ukoliko jeste stampamo i uvecavamo
											// brojac
				counter++;
				if (counter % 10 == 0) { // ukoliko je brojac djeljiv sa 10 bez
											// ostatka prebacujemo u novi red
					System.out.println();
				}

			}

		}
	}
}
