package zadaci_23_07_2015;

import java.util.Arrays;
import java.util.Scanner;

public class NumberISBN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite prvih 9 brojeva ISBN broja:");
		String numberLiteral = input.next();				//vrijednost broja unosim kao string jer u slucaju integera, prva 0 se gubi
		int num = Integer.parseInt(numberLiteral);			//parsiramo unos u integer, koji nam je potreban za racunanje checksum-a
		input.close();
		int[] nums = new int[9];							//niz brojeva u koje smjestamo pojedinacne jednocifrene brojeve
		int temp = num;										//privremeni broj kojem cemo kasnije "odbijati" zadnju cifru
		for (int i = 8; i > 0; i--) {						//petljom dodjeljujemo vrijednosti nizu od zadnjeg ka nultom indexu
			nums[i] = temp % 10;							//iz razloga sto brojeve "odbijamo" od zadnjeg ka prvom
			temp = temp / 10;
		}
		input.close();
		int checksum = (nums[0] * 1 + nums[1] * 2 + nums[2] * 3 + nums[3] * 4					//formula za racunanje check sum-a
				+ nums[4] * 5 + nums[5] * 6 + nums[6] * 7 + nums[7] * 8 + nums[8] * 9) % 11;
		System.out.print("Vas ISBN broj je: " + numberLiteral);			//stampamo prvih 9 cifara ISBN broja
		if (checksum == 10)												//ovisno o "if" uslovu dodajemo "X" ili vrijednost checksum-a
			System.out.println("X");
		else
			System.out.println(checksum);

	}

}
