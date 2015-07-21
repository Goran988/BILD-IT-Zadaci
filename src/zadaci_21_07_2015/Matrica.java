package zadaci_21_07_2015;

import java.util.Scanner;

public class Matrica {
//cetvrti zadatak
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj redova i kolona simetricne matrice: ");	//trazimo od korisnika da unese broj kolona i redova
		int num = input.nextInt();
		printMatrix(num);
	}

	public static void printMatrix(int n) {
		int[][] matrix = new int[n][n];							//pravimo simetricnu matricu sa brojem redova i kolona koje je korisnik unjeo
		for (int i = 0; i < n; i++) {							//duplom petljom pristupamo preko indexa pojedinacnim clanovima matrice
			for (int j = 0; j < n; j++) {
				matrix[i][j]=(int)(Math.random()*2);			//Math.random metodom dodjeljujemo vrijednosti 0 - 1
			}
		}
		for (int[] e : matrix) {								//enhanced for each petljom stampamo clanove matrice
			for (int i : e) {
				System.out.print(i + " ");
			}
			System.out.println();								//po zavrsenom stampanju svakog reda matrice prebacujemo u novu liniju
		}
	}

}
