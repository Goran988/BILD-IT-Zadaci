package zadaci_27_07_2015;

public class DjeljiviSaPetISest {
	
	public static void main(String[] args) {
		int count = 0;
		for (int i = 100; i <= 1000; i++) {					//petljom prolazimo od broja 100 do(i ukljucujuci) 1000
			if (i % 5 == 0 && i % 6 == 0) {					//provjeravamo da li je trenutno broj djeljiv sa 5 i sa 6 bez ostatka
				System.out.print(i+" ");					//ukoliko jeste stampamo ga
				count++;									//uvecavamo brojac za 1
				if(count%10==0)								//ukoliko je brojac djeljiv sa 10 bez ostatka prebacujemo u novi red
					System.out.println();
			}
		}

	}

}
