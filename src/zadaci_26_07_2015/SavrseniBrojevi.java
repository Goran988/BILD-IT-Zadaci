package zadaci_26_07_2015;

public class SavrseniBrojevi {
	// cetvrti zadatak
	public static void main(String[] args) {
		System.out.println("Savrseni brojevi su:");
		for (int i = 1; i <= 10000; i++) {									//prva petlja prolazi kroz brojeve od 1 do 10000
			int sum = 0;
			for (int j = 1; j < i; j++) {									//druga petlja ide od 1 do broja "i"
				if (i % j == 0) {											//ukoliko je i djeljivo sa j bez ostatka dodajemo j u sumu
					sum += j;

				}
			}
			if (i == sum) {													//ako je suma svih djelilaca jednaka broju i, broj i je "savrseni broj"
				System.out.print(i + " ");
			}
		}

	}

}
