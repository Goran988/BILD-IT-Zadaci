package zadaci_28_07_2015;

public class OneToSeven {
/**
 *@author Goran 
 * Write a program that writes all combinations for two numbers in range 1 to 7 and number of those combinations.
 */
	
	public static void main(String[] args) {
		int count=0;									//used to count number of combinations
		for(int i=1; i<=7; i++){						//first loop that goes from 1 to 7
			for(int j=1; j<i; j++){						//nested loop that goes from 1 to "i"
				System.out.println(i+" "+j);			//printing out combinations
				count++;								//incrementing counter for every iteration
			}
		}
		System.out.println("Number of combinations is: " +count);	//printing out number of combinations

	}

}
