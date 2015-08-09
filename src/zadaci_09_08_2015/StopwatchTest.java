package zadaci_09_08_2015;

public class StopwatchTest {

	public static void main(String[] args) {
		int[] num = new int[100000]; // int array with 100000 numbers
		for (int i = 0; i < 100000; i++) { // we assign values to the numbers in
											// range 0 to 99
			num[i] = (int) (Math.random() * 100);
		}
		Stopwatch s = new Stopwatch();
		s.start(); // starting stopwatch
		int[] sortedNums = doSelectionSort(num); // invoking method that will
													// sort numbers in the array
		s.stop(); // stoping stopwatch
		System.out.println("Elapsed time is: " + s.elapsedTime()); // printing
																	// out how
																	// much time
																	// passed

	}

	public static int[] doSelectionSort(int[] arr) {
		// Method that sorts numbers in the array and returns sorted array
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[index])
					index = j;

			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
		return arr;
	}
}
