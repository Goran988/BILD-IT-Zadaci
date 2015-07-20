package zadaci_20_07_2015;

public class NajveciZajednickiDjelilac {
	// treci zadatak
	public static void main(String[] args) {
		int numOne = 125;
		int numTwo = 2525;
		System.out.println(najveciDjelilac(numOne, numTwo));		//stampamo rezultat metoda

	}

	public static int najveciDjelilac(int a, int b) {
		int result = 0; // varijabla za broj koji predstavlja najveci zajednicki
						// djelilac
		int spin = 0;	//varijabla koju koristimo da bi znali koliko puta se petlja mora izvrsiti
		if (a > b)		//ako je a vece od b znaci da se petlja izvrsava "a" puta i obratno ako je b vece od a
			spin = b;
		else
			spin = a;
		for (int i = spin; i > 0; i--) {		// i inicijaliziramo na vrijednost manjeg broja i umanjeujemo za 1 u svakoj iteraciji
			if (a % i == 0 && b % i == 0) {		//provjeravamo da li su oba broja djeljiva sa "i" bez ostatka
				result = i;						//ukoliko jeste rezultatu dodjeljujemo tu vrijednost i prekidamo petlju
				break;
			}
		}
		return result;							//vracamo rezultat
	}

}
