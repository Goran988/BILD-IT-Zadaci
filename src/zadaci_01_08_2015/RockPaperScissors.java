package zadaci_01_08_2015;

import java.util.Scanner;

public class RockPaperScissors {
	/**
	 * Write a program that simulates playing rock paper scissors, user enters a
	 * number, program randoms a number and we check to see who won, and notify
	 * the user.
	 */
	public static void main(String[] args) {

		int randomPC = (int) (Math.random() * 3); // random number in range 0 to
													// 2
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your pick(0-scissors), (1-rock), (2-paper):");
		int user = input.nextInt(); // getting input from user
		if (user == randomPC) { // through if statements we determine who won
								// and print the result
			System.out.println("It's a tie!");
		} else if (user == 0 && randomPC == 2) {
			System.out.println("You won! You chose scissors , PC chose paper.");

		} else if (user == 1 && randomPC == 0) {
			System.out.println("You won! You chose rock, PC chose scissors.");
		} else if (user == 2 && randomPC == 1) {
			System.out.println("You won! You chose paper, PC chose rock.");
		} else if (user == 0 && randomPC == 1) {
			System.out.println("Defeat :( You chose scissors, PC chose rock.");
		} else if (user == 1 && randomPC == 2) {
			System.out.println("Defeat :( You chose rock, PC chose paper.");
		} else
			System.out.println("Defeat :( You chose paper, Pc chose scissors.");
	}

}
