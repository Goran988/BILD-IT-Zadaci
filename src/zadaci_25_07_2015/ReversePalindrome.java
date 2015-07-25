package zadaci_25_07_2015;

import java.util.Scanner;

public class ReversePalindrome {
	// treci zadatak
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.println("Unesite broj koje zelite provjeriti da li je palindrome:");
		int num = input.nextInt();									//korisnik unosi broj
		input.close();												//zatvaramo scanner
		System.out.println(isPalindrome(num));						//pozivamo metod koji provjerava da li je broj palindrome, ispisuje true ako jeste
																	//ili false ako nije
	}

	public static int reverse(int num) {
		String line = Integer.toString(num);						//pretvaramo broj iz int tipa podataka u string
		String res = "";
		for (int i = line.length() - 1; i >= 0; i--) {				//u novi string dodajemo broj obrnutim redosledom
			res += line.charAt(i);
		}
		return Integer.parseInt(res);								//vracamo novi broj ispisan unazad, pri cemu parsiramo string u int tip podataka
	}

	public static boolean isPalindrome(int num) {
		if(num==reverse(num))										//poredimo broj koji je korisnik unjeo sa brojem koji nam vraca metod "reverse"
			return true;											//ukoliko su jednaki vraca true
		else
			return false;											//ukoliko nisu jednaki vraca false

	}

}
