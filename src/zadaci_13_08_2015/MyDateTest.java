package zadaci_13_08_2015;

public class MyDateTest {

	public static void main(String[] args) {
		//object of MyDate class created with default constructor that uses current time
		MyDate date = new MyDate();
		System.out.println(date.toString());
		//object created with constructor that allows user to enter timeElapsed in milliseconds
		MyDate date2 = new MyDate(561555550000L);
		System.out.println(date2.toString());

	}
}
