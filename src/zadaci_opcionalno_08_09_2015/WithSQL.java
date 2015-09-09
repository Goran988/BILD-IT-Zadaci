package zadaci_opcionalno_08_09_2015;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.YearMonth;
import java.util.Scanner;

public class WithSQL {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter month and year:");
		int month = input.nextInt();
		int year = input.nextInt();
		printMonth(month, year);
		userChoice(month, year);
	}

	/**
	 * method that returns us literal name of the month
	 * 
	 * @param monthNum
	 *            - number of month
	 * @return - string containing the name of the month
	 */
	public static String whichMonth(int monthNum) {
		String month = "";
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

	/**
	 * method that prints the month to the console
	 * 
	 * @param month
	 *            - month we're printing
	 * @param year
	 *            - year for the month we're printing
	 */
	public static void printMonth(int month, int year) {
		if (month != 0 && year != 0) {
			System.out.println(whichMonth(month) + "\t" + year + "\n");
			System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
			System.out
					.println("___________________________________________________\n");
			int firstDayInMonth = getFirstDay(year, month); // getting first day
															// of the month by
															// invoking the
															// method
			if (firstDayInMonth % 7 != 0) {

				for (int i = 0; i < firstDayInMonth; i++)
					// printing spaces up to first month
					System.out.print("\t");
			}
			for (int i = 1; i <= (numberOfDaysInMonth(year, firstDayInMonth)); i++) { // printing
																						// dates
																						// for
																						// the
																						// rest
																						// of
																						// the
																						// month
				if (i < 10) { // loop goes up to number of days in the month
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
	 * method that determines how many days month have
	 * 
	 * @param year
	 *            - it's important to find out if it's leap year
	 * @param month
	 *            - that we're getting number of days for
	 * @return - returns how many days givven month has
	 */
	public static int numberOfDaysInMonth(int year, int month) {

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
				|| month == 10 || month == 12)
			return 31;

		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;

		if (month == 2
				&& (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
			return 29;
		else
			return 28;
	}

	/**
	 * method that gets value of the first day of the month
	 * 
	 * @param year
	 *            - year for the first day we want
	 * @param month
	 *            - month for the first day we want
	 * @return returns value of first day of the month
	 */
	public static int getFirstDay(int year, int month) {
		// we use YEARMONTH class with users values to get value of the first
		// day of set month
		YearMonth ym = YearMonth.of(year, month);
		return ym.atDay(1).getDayOfWeek().getValue();

	}

	/**
	 * method that deals with user choice and interacts with database
	 * 
	 * @param month
	 *            - month user entered
	 * @param year
	 *            - year user entered
	 */
	public static void userChoice(int month, int year) {
		boolean ok = false;
		Scanner input = new Scanner(System.in);
		while (!ok) {
			ok = true;
			System.out
					.println("1. To add notes to current month\n2. To see notes for current month");
			int user = input.nextInt();
			if (user > 2)
				ok = false;
			if (user == 1) {
				System.out.println("Enter note for current month:");
				String note = input.nextLine();
				try {
					Connection myConn = DriverManager.getConnection(
							"jdbc:mysql://127.0.0.1:3306/calendar", "root",
							"user");
					Statement myStmt = myConn.createStatement();
					// in case user chose to add new note we send statement to
					// the database that contains month, year and text of the
					// note
					myStmt.executeUpdate("INSERT INTO calendar (month, year, note) VALUES ('"
							+ month + "','" + year + "','" + note + "')");
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			} else if (user == 2) {
				try {
					Connection myConn = DriverManager.getConnection(
							"jdbc:mysql://127.0.0.1:3306/calendar", "root",
							"user");
					Statement myStmt2 = myConn.createStatement();
					// in case chose to see notes for current month we send
					// query that selects note column where month, and year
					// matches month and year in the table
					ResultSet rs = myStmt2
							.executeQuery("SELECT note FROM calendar WHERE month='"
									+ month + "' AND year='" + year + "'");
					while (rs.next()) {
						System.out.println(rs.getString("note"));
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
		input.close();
	}

}
