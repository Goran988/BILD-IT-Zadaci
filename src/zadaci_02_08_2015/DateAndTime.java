package zadaci_02_08_2015;

import java.util.Date;

public class DateAndTime {
	/**
	 * Write a method that returns time and date.
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(dateAndTime());				//printing out the result
	}

	public static Date dateAndTime() {
		Date date = new Date();							//creating new object of Date class
		return date;									//returning the object
	}

}
