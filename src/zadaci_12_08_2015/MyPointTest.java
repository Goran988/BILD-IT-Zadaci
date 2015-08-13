package zadaci_12_08_2015;

public class MyPointTest {

	public static void main(String[] args) {
		//object of MyPoint class created with default constructor
		MyPoint pointA = new MyPoint();
		// object of MyPoint class created with constructor that allows that user sets values for x and y data field
		MyPoint pointB = new MyPoint(10, 30.5);
		//result of distance method that calculates distance between two objects
		System.out.printf("Distance between two points is %.2f",
				pointA.distance(pointB));

	}
}
