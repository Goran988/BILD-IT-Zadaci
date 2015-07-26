package zadaci_26_07_2015;

import java.util.Scanner;

public class KalendarMjesecGodinaSlova {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.println("Unesite godinu i mjesec(prva tri slova, prvo slovo veliko), za koji zelite znati koliko ima dana:");
		int year = input.nextInt(); // korisnik unosi godinu i mjesec
		int month = month(input.next());
		if(month!=0){													//u slucaju da je mjesec unesen pravilno metod vraca vrijednost razlicitu od 0
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
		else										//ukoliko je metod "month" vratio 0 znaci da mjesec nije unesen tacno, obavjestavamo korisnika o tome
			System.out.println("Unjeli ste pogresan mjesec");

	}

	public static boolean isLeap(int num) { // metod kojim provjeravamo da li je
											// godina prestupna vraca true ako
											// jeste i false ako nije
		if (num % 4 == 0 && num % 100 != 0 || num % 400 == 0)
			return true;
		else
			return false;
	}

	public static int month(String line) {		//metod koji na prosljedjenu tekstualnu veriziju mjeseca vraca numericku vrijednost datog mjeseca
		int ret = 0;
		if (line.equals("Jan"))
			ret = 1;
		if (line.equals("Feb"))
			ret = 2;
		if (line.equals("Mar"))
			ret = 3;
		if (line.equals("Apr"))
			ret = 4;
		if (line.equals("Maj"))
			ret = 5;
		if (line.equals("Jun"))
			ret = 6;
		if (line.equals("Jul"))
			ret = 7;
		if (line.equals("Avg"))
			ret = 8;
		if (line.equals("Sep"))
			ret = 9;
		if (line.equals("Okt"))
			ret = 10;
		if (line.equals("Nov"))
			ret = 11;
		if (line.equals("Dec"))
			ret = 12;
		return ret;
	}

}
