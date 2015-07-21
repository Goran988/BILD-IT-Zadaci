package zadaci_21_07_2015;

public class PrestupneGodine {
//prvi zadatak
	public static void main(String[] args) {
		godinaPrestupna(101, 2100);						//prosledjujemo pocetnu i krajnju godinu

	}

	public static void godinaPrestupna(int first, int last) {
		int counter = 0;								//brojac godina, koji sluzimo i za prebacivanje u novi red nakon sto dodjemo do 10
		for (int i = first; i <= last; i++) {			//petlja koja ide od pocetne do krajnje godine
			if ((i % 4 == 0 && i % 100 != 0 || i % 400 == 0)) {		//logicki uslov kojim provjeravamo da li je godina prestupna
				System.out.print(i + " ");				//ukoliko jeste stampamo i uvecavamo brojac
				counter++;
				if(counter%10==0){						//ukoliko je brojac djeljiv sa 10 bez ostatka prebacujemo u novi red
					System.out.println();
				}

			}
		}
		System.out.println("\nBroj prestupnih godina je: " + counter);		//stampamo koliko je bilo prestupnih godina u datom intervalu

	}

}
