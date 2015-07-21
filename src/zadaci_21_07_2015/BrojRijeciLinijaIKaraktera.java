package zadaci_21_07_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BrojRijeciLinijaIKaraktera {
//treci zadatak
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Unesite ime file-a");			//trazimo unos imena file-a od korisnika
		Scanner input = new Scanner(System.in);				
		String fileName = input.next();						
		brojUFilu(fileName);								//prosledjujemo ime file-a metodu

	}

	public static void brojUFilu(String line) throws FileNotFoundException {
		int counterWords = 0;								//brojac rijeci
		int counterLines = 0;								//brojac linija u file-u
		int counterChars = 0;								//brojac "znakova", slova itd.
		File file = new File(line);							//novi file objekat, koristi ime file-a koje smo dobili od korisnika(file more biti na nivou projekta)
		Scanner input = new Scanner(file);
		while (input.hasNextLine()) {						//petlja radi dok ima novu liniju u file-u
		String lineFromFile = input.nextLine();
			counterChars += lineFromFile.length();			//duzinu svake linije dodajemo ukupnom broju karaktera
			counterLines++;									//za svaku iteraciju petlje uvecavamo broj linija za 1
			counterWords += lineFromFile.split(" ").length;		//svaku liniju splitamo po "space-u" i broj dobijenih elemenata dodajemo kao broj rjeci

		}
		System.out.println("Broj karaktera u file-u je: " + counterChars		//stampamo rezultat
				+ "\nBroj linija u file-u je: " + counterLines
				+ "\nBroj rjeci u file-u je: " + counterWords);
	}

}
