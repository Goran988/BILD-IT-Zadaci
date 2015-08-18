package zadaci_17_08_2015;

import java.util.Scanner;

//class that is used to test methods for Triangle class
public class TriangleTest {

	public static void main(String[] args) {
		System.out.println("Enter three sides of triangle: ");
		Scanner input = new Scanner(System.in);
		//constructor that creates triangle object and takes side values from user
		Triangle t1 = new Triangle(input.nextDouble(), input.nextDouble(),
				input.nextDouble());
		System.out
				.println("Enter true if triangle is filled and false if it isn't");
		//taking filled value from user
		t1.setFilled(input.nextBoolean());
		System.out.println("Enter the color of triangle: ");
		//taking color value from user
		t1.setColor(input.next());
		System.out.println(t1);

	}
}
