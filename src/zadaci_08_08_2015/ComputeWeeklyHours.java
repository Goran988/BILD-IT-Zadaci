package zadaci_08_08_2015;

import java.util.Arrays;

public class ComputeWeeklyHours {
	/**
	 * (Compute the weekly hours for each employee) Suppose the weekly hours for
	 * all employees are stored in a two-dimensional array. Each row records an
	 * employee’s seven-day work hours with seven columns. For example, the
	 * following array stores the work hours for eight employees. Write a
	 * program that displays employees and their total hours in decreasing order
	 * of the total hours.
	 */
	public static void main(String[] args) {
		int[][] hours = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 },		//int array with hours for every worker
				{ 3, 3, 4, 3, 3, 2, 2 }, { 9, 3, 4, 7, 3, 4, 1 },
				{ 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 },
				{ 3, 7, 4, 8, 3, 8, 4 }, { 6, 3, 5, 9, 2, 7, 9 } };
		String[] workers = new String[hours.length];
		Arrays.fill(workers, "");
		System.out.println("\t     Su    M    T    W    Th    F  Sa");  //first we print out the table with employee names, hours and week days
		for (int i = 0; i < hours.length; i++) {
			int sum = 0;
			System.out.print("Employee " + i + "    ");
			for (int j = 0; j < hours[i].length; j++) {
				System.out.print(hours[i][j] + "    ");
				sum += hours[i][j];										//we sum up hours for every worker
			}
			workers[i] += sum + " hours, employee number " + i;			//we add to string array total hours and names of workers
			System.out.println();
		}
		Arrays.sort(workers);											//sorting will use hours as primary condition
		for (int i = 0; i < workers.length; i++) {						//printing out elements of the string array
			System.out.println(workers[i]);
		}

	}

}
