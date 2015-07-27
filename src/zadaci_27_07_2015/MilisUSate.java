package zadaci_27_07_2015;

import java.util.Scanner;

public class MilisUSate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj milisekundi:");
		long millis = input.nextLong();									//korisnik unosi broj milisekundi
		System.out.println(convertMillis(millis));						//prosljedujemo broj milisekundi metodi i stampamo rezultat
	}

	public static String convertMillis(long millis) {
		String res = "";
		int hours = (int) ((millis / (1000 * 60 * 60)) % 24);			//formula za pretvaranje milisekundi u sate
		int minutes = (int) ((millis / (1000 * 60)) % 60);				//formula za pretvaranje milisekunde u minute
		int seconds = (int) (millis / 1000) % 60;						//formula za pretvaranje milisekundi u sekudne
		res += hours + ":" + minutes + ":"+seconds;						//sate, minute i sekunde dodajemo u string

		return res;														//vracamo string res
	}

}
