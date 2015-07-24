package zadaci_24_07_2015;

import java.util.Scanner;

public class DesetCijelihBrojeva {
//cetvrti zadatak
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite 10 cijelih brojeva:");
		int[] nums = new int[10];								//niz u koji smjestamo brojeve
		for (int i = 0; i < 10; i++) {							//korisnik preko konzole unosi 10 brojeva koje petljom smjestano u niz
			nums[i] = input.nextInt();
		}
		for (int i = 9; i >= 0; i--) {							//niz stampamo od zadnjeg indexa ka prvom
			System.out.print(nums[i] + " ");
		}
	}

}
