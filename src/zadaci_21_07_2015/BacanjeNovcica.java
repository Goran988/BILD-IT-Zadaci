package zadaci_21_07_2015;

import java.util.Scanner;

public class BacanjeNovcica {
//peti zadatak
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);							//scaner objekat
		System.out.println("Koliko puta zelite da bacimo novcic:");		//trazimo od korisnika da unese broj bacanja novcica
		int num = input.nextInt();
		bacanjeNovcica(num);											//pozivamo metod
	}

	public static void bacanjeNovcica(int n) {
		int counterGlava = 0;											//brojac za glavu
		for (int i = 0; i < n; i++) {					
			if ((int) (Math.random() * 2) == 0) {						//petljom simularamo bacanje novcica, pri cemu 0 biljezimo kao "glavu"				
				counterGlava++;
			}
		}
		System.out.println("Novic je bacen: " + n + " puta\nGlava je bila: "		//stampamo rezultat, pismo dobijamo kad od broja bacanja
				+ counterGlava + " puta\nPismo je bilo: " + (n - counterGlava)		//oduzmemo koliko puta je bila "glava"
				+ " puta");
	}

}
