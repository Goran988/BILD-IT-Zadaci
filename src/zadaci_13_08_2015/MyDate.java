package zadaci_13_08_2015;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
	private int year;
	private int month;
	private int day;

	/** default constructor that sets date based on current time */
	MyDate() {
		setDate(System.currentTimeMillis());
	}

	/** constructor that allows the user to enter time elapsed in milliseconds */
	MyDate(long timeElapsed) {
		setDate(timeElapsed);
	}

	// get method for year data field
	public int getYear() {
		return year;
	}

	/**
	 * get method for month data field(incremented by 1 because months are 0
	 * based, january starts at 0)
	 */
	public int getMonth() {
		return month + 1;
	}

	// get method for day data field
	public int getDay() {
		return day;
	}

	/**
	 * method that uses long value elapsedTime to set value for instance of GregorianCalendar class
	 * 
	 * @param elapsedTime
	 *            value of milliseconds used to set date
	 */
	public void setDate(long elapsedTime) {
		GregorianCalendar date = new GregorianCalendar();
		date.setTimeInMillis(elapsedTime);
		this.year = date.get(Calendar.YEAR);
		this.month = date.get(Calendar.MONTH);
		this.day = date.get(Calendar.DAY_OF_MONTH);
	}
	@Override
	/**
	 * method that converts day, month and year values into string
	 */
	public String toString() {
		return getDay() + "." + getMonth() + "." + getYear();

	}
}
