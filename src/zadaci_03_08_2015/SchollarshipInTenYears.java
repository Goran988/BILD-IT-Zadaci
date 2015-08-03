package zadaci_03_08_2015;

public class SchollarshipInTenYears {
	/**
	 * Program that calculate schoolarship. Year costa 10000 it's increased by
	 * 5% every year, calculate how much will schoolarship be in 10 years.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		double schoolarship = 10000;
		for (int i = 1; i <= 10; i++) {
			schoolarship = schoolarship + (schoolarship * 0.05);
			System.out.printf("Year " + i + " schoolarship is %.2f",
					schoolarship);
			System.out.println();
		}

	}

}
