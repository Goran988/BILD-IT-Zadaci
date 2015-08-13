package zadaci_12_08_2015;

/**
 * Design a class named Time. The class contains: The data fields hour, minute,
 * and second that represent a time. A no-arg constructor that creates a Time
 * object for the current time. (The values of the data fields will represent
 * the current time.)A constructor that constructs a Time object with a
 * specified elapsed time since midnight, January 1, 1970, in milliseconds. (The
 * values of the data fields will represent this time.) A constructor that
 * constructs a Time object with the specified hour, minute, and second. Three
 * getter methods for the data fields hour, minute, and second, respectively. A
 * method named setTime(long elapseTime) that sets a new time for the object
 * using the elapsed time. For example, if the elapsed time is 555550000
 * milliseconds, the hour is 10, the minute is 19, and the second is 10.
 * 
 *
 */
public class Time {

	int hour;
	int minute;
	int second;

	// default constructor that creates Time object with current time
	Time() {
		setTime(System.currentTimeMillis());
	}

	// constructor that allows user to set the elapsed time in milliseconds
	Time(long elapsedTime) {
		setTime(elapsedTime);
	}

	// constructor that allows user to set the values of hours, minutes and
	// seconds
	Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	// getter method for hour data field
	public int getHour() {
		return hour;
	}

	// getter method for minute data field
	public int getMinute() {
		return minute;
	}

	// getter method for second data field
	public int getSecond() {
		return second;
	}

	/**
	 * method that use elapsed time and converts from milliseconds to hours,
	 * minutes and seconds
	 */
	public void setTime(long elapsedTime) {
		this.hour = (int) ((elapsedTime / (1000 * 60 * 60)) % 24);
		this.minute = (int) ((elapsedTime / (1000 * 60)) % 60);
		this.second = (int) (elapsedTime / 1000) % 60;
	}

}
