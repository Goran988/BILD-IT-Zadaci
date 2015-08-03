package zadaci_03_08_2015;

public class ScholarshipInTenYears {
	/**
	 * Program that calculate scholarship. Year costa 10000 it's increased by
	 * 5% every year, calculate how much will scholarship be in 10 years.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		double scholarship = 10000;
		for (int i = 1; i <= 10; i++) {								//loop will display scholarship for each year
			scholarship = scholarship + (scholarship * 0.05);		//formula for calculating scholarship
			System.out.printf("Year " + i + " schoolarship is %.2f",	//printing out result rounded on 2 decimals
					scholarship);
			System.out.println();
		}

	}

}
