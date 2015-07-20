package zadaci_20_07_2015;

public class SamoglasniciISuglasnici {
//drugi zadatak
	public static void main(String[] args) {
		String str = "Neki tamo string";
		samoglasniciItd(str);

	}

	public static void samoglasniciItd(String str) {
		int samoglasnici = 0; // broj samoglasnika
		int space = 0; // broj praznih prostora ili interpunkcijskih znakova

		for (int i = 0; i < str.length(); i++) { // petljom prolazimo kroz
													// string
			char test = str.toLowerCase().charAt(i); // izdvajamo character na
														// kom je trenutno
														// petlja i pri tome
														// string prebacujemo u
														// mala slova
			if (test == 'a' || test == 'e' || test == 'i' || test == 'o'
					|| test == 'u') {
				samoglasnici++; // ukoliko je "test" character samoglasnik
								// uvecavamo brojac za 1
			} else if (test == ' ' || test == ',' || test == '.') {
				space++; // ukoliko je "test" character "space" uvecavamo brojac
							// za prazan prostor za 1
			}
		}
		System.out.println("Broj samoglasnika je: " + samoglasnici
				+ "\nBroj Suglasnika je: "
				+ (str.length() - (space + samoglasnici)));
		// stampamo rezultat pri cemu broj suglasnika dobijamo tako sto odbijemo broj samoglasnika i praznih prostora odnosno interpunkcijskih znakova
	}
}
