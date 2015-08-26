package zadaci_25_08_2015;

import java.util.Calendar;

/**
 * Rewrite the PrintCalendar class in Listing 6.12 to display a calendar for a
 * specified month using the Calendar and GregorianCalendar classes. Your
 * program receives the month and year from the command line.
 */
public class DisplayCalendars {

	public static void main(String[] args) {
		// month is first argument passed by command line
		int month = Integer.parseInt(args[0]);
		// year is second argument passed by command line
		int year = Integer.parseInt(args[1]);
		// invoking printMonth method
		printMonth(month, year);
	}

	/**
	 * method that prints calendar as a table
	 * 
	 * @param month
	 *            - number of the month we want
	 * @param year
	 *            - number of the year we want
	 */
	public static void printMonth(int month, int year) {
		if (month != 0 && year != 0) {
			// printing out header (month and year)
			System.out.println(whichMonth(month) + "\t" + year + "\n");
			// printing out days of the week
			System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
			System.out
					.println("___________________________________________________\n");
			int firstDayInMonth = getFirstDay(year, month);
			// printing out spaces until we reach day of the 1st in the month
			if (firstDayInMonth % 7 != 0) {

				for (int i = 0; i < firstDayInMonth; i++)
					System.out.print("\t");
			}
			// printing out the rest of the month
			for (int i = 1; i <= (numberOfDaysInMonth(year, firstDayInMonth)); i++) {
				if (i < 10) { //
					System.out.print(" " + i + "\t");
				} else {
					System.out.print(i + "\t");
				}
				if ((firstDayInMonth + i) % 7 == 0) {
					System.out.println();
				}

			}
			System.out.println();
		}

	}

	/**
	 * method that calculates how many days month have
	 * 
	 * @param year
	 *            - int value of year
	 * @param month
	 *            - int value of month
	 * @return - days of the month as int
	 */
	public static int numberOfDaysInMonth(int year, int month) {
		// months that have 31 days
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
				|| month == 10 || month == 12)
			return 31;
		// months that have 30 days
		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		// depending if the year is loop or not february have 29 or 28 days
		if (month == 2
				&& (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
			return 29;
		else
			return 28;
	}

	/**
	 * method that uses Calendar class to find first day of the month
	 * 
	 * @param year
	 *            - int value of year
	 * @param month
	 *            - int value of month
	 * @return - first day of the month as int
	 */
	public static int getFirstDay(int year, int month) {
		// creating calendar object
		Calendar cal = Calendar.getInstance();
		// setting month value(decreasing by one, months in calendar class are 0
		// based)
		cal.set(Calendar.MONTH, (month - 1));
		// setting year
		cal.set(Calendar.YEAR, year);
		// setting day of month
		cal.set(Calendar.DAY_OF_MONTH, 1);
		// getting value of day of week for currently set date
		int firstDayOfMonth = cal.get(Calendar.DAY_OF_WEEK);
		// returning value -1 since our calendar starts at sunday
		return firstDayOfMonth - 1;

	}

	/**
	 * method that returns month as a word
	 * 
	 * @param monthNum
	 *            - number of month
	 * @return - string with month name
	 */
	public static String whichMonth(int monthNum) {
		String month = "";
		// switch statmenet that assigns value to month string depending on the
		// month number
		switch (monthNum) {
		case 1:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "Oktober";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
			break;
		default:
			month = "Invalid month";
			break;
		}
		return month;

	}

}
