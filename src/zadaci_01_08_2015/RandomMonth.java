package zadaci_01_08_2015;

public class RandomMonth {
	/**
	 * Write a program that generates random number 1-12 and print out month
	 * that represents the number.
	 * 
	 */
	public static void main(String[] args) {
		String month = "";
		int monthNum = (int) (Math.random() * 12);			//we use math.random method to generate random number from 0-11
		switch (monthNum) {									//depending of the number switch statement assign coresponding value to string month
		case 0:
			month = "January";
			break;
		case 1:
			month = "February";
			break;
		case 2:
			month = "March";
			break;
		case 3:
			month = "April";
			break;
		case 4:
			month = "May";
			break;
		case 5:
			month = "June";
			break;
		case 6:
			month = "July";
			break;
		case 7:
			month = "August";
			break;
		case 8:
			month = "September";
			break;
		case 9:
			month = "Oktober";
			break;
		case 10:
			month = "November";
			break;
		case 11:
			month = "December";
			break;
		default:
			month = "Invalid month";
			break;
		}
		System.out.println(month);					//printing out month string

	}

}
