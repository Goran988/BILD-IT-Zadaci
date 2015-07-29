package zadaci_29_07_2015;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {
	/**
	 * Write a program that calculate current date and time by using
	 * System.currentTimeMilis().
	 */
	public static void main(String[] args) {
//		long totalSeconds = System.currentTimeMillis() / 1000;
//		int currentSecond = (int) (totalSeconds % 60);						formulas used to calculate current seconds, minutes and hours
//		int currentMinute = (int) ((totalSeconds / 60) % 60);
//		int currentHour = (int) (((totalSeconds / 60) / 60) % 24);
		long currentMillis = System.currentTimeMillis();
		SimpleDateFormat simpleDate = new SimpleDateFormat("dd MMM, yyyy HH:mm:ss"); 	//usage of SimpleDateFormat class allows us to format the date we're going to  
		Date date = new Date(currentMillis);										//print in order we want(days, months, year, and time
		System.out.println(simpleDate.format(date));								//while printing we're using SDF to format date output
	}

}
