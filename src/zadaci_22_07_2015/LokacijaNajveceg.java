package zadaci_22_07_2015;

import java.util.Arrays;
import java.util.Scanner;

public class LokacijaNajveceg {
//cetvrti zadatak
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.println("Unesite koliko redova i koliko kolona ce imati vas dvodimenzionalni niz:");		//korisnik unosi koliko redova i kolona
		double[][] nums = new double[input.nextInt()][input.nextInt()];										//treba da ima 2D niz
		System.out.println("unesite elemente vaseg dvodimenzionalnog niza");
		for (int i = 0; i < nums.length; i++) {							//duplom petljom popunjavamo dvodimenzionalni niz
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = input.nextDouble();
			}

		}
		System.out.println("Lokacija najveceg clana je: "				//stampamo "koordinate" najveceg clana niza
				+ Arrays.toString(locateLargest(nums)));
	}

	public static int[] locateLargest(double[][] a) {
		int row = 0;
		int column = 0;
		double max = a[0][0];											//koristimo max varijablu da bi skladistili dosadasnju najvecu vrijednost
		for (int i = 0; i < a.length; i++) {							//a varijable row i column da bi skladistili lokaciju, odnosno u kom redu i koloni
			for (int j = 0; j < a[i].length; j++) {						//se nalazi najveca vrijednost
				if (max < a[i][j]) {
					max = a[i][j];
					row = i;
					column = j;
				}
			}
		}
		int[] result = { row, column };									//vracamo niz od dva clana, gdje prvi clan predstavlja red, a drugi clan kolonu
		return result;													//najveceg clana
	}
}
