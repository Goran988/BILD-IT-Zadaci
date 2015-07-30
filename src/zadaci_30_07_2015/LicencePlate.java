package zadaci_30_07_2015;

import java.util.Random;

public class LicencePlate {
	/**
	 * Write a program that generates random license plate in AAA-1234 format.
	 */
	public static void main(String[] args) {
		String res = "";
		String[] alphabet = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",			//string array that we'll use to get random letter
				"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
				"W", "X", "X", "Y", "Z" };
		for(int i=0; i<3; i++){															//adding 3 random letters to our res string by generating
			res+=alphabet[(int)(Math.random()*26)];										//random number on alphabet index
		}
		res+="-"+(new Random().nextInt(9999-1000)+1000);								//adding 4 digit random number (by subtracting 1000 and adding 1000
																						//we're making sure it's over 1000 and it doesn't go over 9999
		System.out.println(res);

	}

}
