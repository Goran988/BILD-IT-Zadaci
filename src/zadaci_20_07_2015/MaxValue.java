package zadaci_20_07_2015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxValue {
	// prvi zadatak
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); // pravimo listu
															// Integera
															// list.add(5); //
															// dodajemo brojeve
															// u listu
		// list.add(2);
		// list.add(3);
		// list.add(8);
		// list.add(1);
		System.out.println(max(list)); // stampamo broj koji nam metod vraca

	}

	public static Integer max(ArrayList<Integer> list) {
		if (list == null) { // ukoliko je lista null vraca null
			return null;
		}
		if (list.size() == 0) { // ukoliko je lista prazna vraca null
			return null;
		}
		Collections.sort(list); // sortiramo listu po velicini
		return list.get(list.size() - 1); // vracamo zadnji clan koji je ujedno
											// i najveci

	}
}
