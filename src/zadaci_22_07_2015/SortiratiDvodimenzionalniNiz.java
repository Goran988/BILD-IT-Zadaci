package zadaci_22_07_2015;

import java.util.Arrays;
import java.util.Scanner;

public class SortiratiDvodimenzionalniNiz {
//peti zadatak
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.println("Unesite koliko redova i kolona ima vasa simetricna matrica (jedan broj): ");
		int size = input.nextInt();
		double[][] nums = new double[size][size];			//kreiramo matricu sa onoliko redova i kolona koliko je korisnik unjeo
		System.out.println("Unesite elemente vase matrice: ");
		for (int i = 0; i < size; i++) {					//duplom petljom popunjavamo matricu
			for (int j = 0; j < size; j++) {
				nums[i][j] = input.nextDouble();
			}
		}
		double[][] result = sortRows(nums);					//stampamo matricu, pri cemo svaki novi red prebacujemo u novu liniju
		for (double[] e : result) {
			for (double i : e) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

	public static double[][] sortRows(double[][] array) {
		boolean nonAsc = true;									//boolean vrijednost nam je potrebna da bi odredili do kada ce while petlja da radi
		while (nonAsc) {
			nonAsc = false;										//pocinjemo s pretpostavkom da je niz rastuci(dupla negacija - nonAsc - false)

			for (int i = 0; i < array.length; i++) {			//duplom petljom prolazimo kroz elemente niza i koristimo buble sort algoritam
				for (int j = 0; j < array.length - 1; j++) {	//objasnjenje buble sort algoritma na dnu stranice
					double temp = array[i][j + 1];
					if (array[i][j] > array[i][j + 1]) {
						array[i][j + 1] = array[i][j];
						array[i][j] = temp;
						nonAsc = true;							//u slucaju da je doslo do situacije kada je drugi clan reda veci od prethodnog 
					}											//petlja nastavlja sa radom
				}
			}
		}
		return array;
	}

}
//buble sort algoritam provjerava trenutni broj sa narednim, ako je naredni broj manji od trenutnog mjenja im mjesta
//ponavlja se dok niz nije sortiran po velicini