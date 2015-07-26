package zadaci_26_07_2015;

import java.util.Scanner;

public class KalendarMjesecGodinaBrojevi {
	// drugi zadatak
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.println("Unesite godinu i mjesec, za koji zelite znati koliko ima dana:");
		int year = input.nextInt(); // korisnik unosi godinu i mjesec
		int month = input.nextInt();
		if (month == 4 || month == 6 || month == 9 || month == 11) { // mjeseci
																		// koji
																		// imaju
																		// po 30
																		// dana
			System.out.println(month + ". mjesec " + year
					+ ". godine ima 30 dana");
		} else if (month == 2 && isLeap(year)) { // drugi mjesec prestupne
													// godine ima 29 dana
			System.out.println(month + ". mjesec " + year
					+ ". godine ima 29 dana");

		} else if (month == 2 && !isLeap(year)) { // drugi mjesec ako nije
													// prestupna godina ima 28
													// dana
			System.out.println(month + ". mjesec " + year
					+ ". godine ima 28 dana");
		} else
			// ostali mjeseci imaju po 31 dan
			System.out.println(month + ". mjesec " + year
					+ ". godine ima 31 dan");

	}

	public static boolean isLeap(int num) {							//metod kojim provjeravamo da li je godina prestupna vraca true ako jeste i false ako nije
		if (num % 4 == 0 && num % 100 != 0 || num % 400 == 0)
			return true;
		else
			return false;
	}

}
