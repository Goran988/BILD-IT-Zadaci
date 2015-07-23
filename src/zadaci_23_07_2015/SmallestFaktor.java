package zadaci_23_07_2015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SmallestFaktor {
//prvi zadatak
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj cije najmanje faktore zelite: ");
		int num = input.nextInt();
		input.close();
		int temp = num;														//privremeni broj kojim cemo manipulisati prilikom svake iteracije petlje
		ArrayList<Integer> lista = new ArrayList<>();						//lista u koju smjesatmo brojeve
		int i = 2;
		while (temp != 1) {													//petlja ce da radi dok privremeni broj ne bude 1
			if (temp % i == 0) {											//ako je trenutni temp broj djelijiv sa i dodajemo i u listu
				lista.add(i);
				temp=temp/i;
			}
			else {															//ako ne broj i povecavamo za 1 i pokusavamo ponovo
				i++;
			}
		}
		System.out.println(lista);											//stampamo listu koja sadrzi najmanje faktore

	}

}
