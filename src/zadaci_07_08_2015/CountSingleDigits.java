package zadaci_07_08_2015;

public class CountSingleDigits {
	/**
	 * Prgoram that randoms 100 number in range 0-9 and prints out how many
	 * times each number randomed.
	 * 
	 */
	public static void main(String[] args) {
		int[] nums = new int[10];
		for (int i = 0; i < 100; i++) {						//loop iterates 100 times and increment element on randomed index
			nums[(int) (Math.random() * 10)]++;
		}
		for (int i = 0; i < 10; i++) {						//we're printing how many times each index was incremented
			System.out.println(i + " has been randomed " + nums[i] + " times.");
		}

	}

}
