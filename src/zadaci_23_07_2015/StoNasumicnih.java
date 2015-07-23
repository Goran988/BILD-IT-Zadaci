package zadaci_23_07_2015;

public class StoNasumicnih {

	public static void main(String[] args) {
		stoNasumicnih();															//pozivamo metod
	}

	public static void stoNasumicnih() {
		int counter = 0;															//brojac koji sluzi da predjemo u novi red
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";								//string koji sadrzi slova engleskog alfabeta
		for (int i = 0; i < 100; i++) {												//for petlja koja ce se iterirati 100 puta
			System.out.print(alphabet.charAt((int) (Math.random() * 26)) + " ");	//charAt metode kojoj prosledjujemo nasumicne brojeve od 0 - 25
			counter++;																//pristupamo pojedinacnim karakterima stringa i uvecavamo brojac za 1
			if (counter % 10 == 0)													//nakon 10 isprintatnih prelazimo u novi red
				System.out.println();
		}
		for (int i = 0; i < 100; i++) {
			System.out.print((int) (Math.random() * 100) + " ");					//stampamo nasumicne brojeve u rangu od 0 do 99
			counter++;
			if (counter % 10 == 0)
				System.out.println();
		}
	}

}
