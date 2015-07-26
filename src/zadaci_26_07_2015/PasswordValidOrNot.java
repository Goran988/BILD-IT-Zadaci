package zadaci_26_07_2015;

import java.util.Scanner;

public class PasswordValidOrNot {
//peti zadatak
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite password: ");
		String password = input.next();								//korisnik unosi password
		isPassordValid(password);									//uneseni password prosledjujemo u metod
	}

	public static void isPassordValid(String line) {
		int countNumbers = 0;										//brojac brojeva u passwordu
		boolean isValid = true;										//boolean vrijednost, ukoliko jedan uslov nije ispunjen prelazi u false
		if (line.length() < 8)										//ukoliko je duzina manja od 8 password nije validan
			isValid = false;
		for (int i = 0; i < line.length(); i++) {					//ukoliko bilo koji pojedinacni karakter nije ni broj ni slovo, password nije validan
			if (!Character.isLetter(line.charAt(i))
					&& !Character.isDigit(line.charAt(i))) {
				isValid = false;
			}
			if (Character.isDigit(line.charAt(i))) {				//ukoliko je karakter broj, povecavamo brojac za 1
				countNumbers++;
			}
		}
		if (isValid && countNumbers >= 2) {							//ako je isValid true i password sadrzi 2 ili vise brojeva password je validan
			System.out.println("Password je validan.");
		} else {													//u suprotnom password nije validan
			System.out.println("Password nije validan.");
		}
	}

}
