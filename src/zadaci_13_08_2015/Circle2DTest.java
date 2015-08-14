package zadaci_13_08_2015;

public class Circle2DTest {

	public static void main(String[] args) {
		// circle object with user assigned coordinates and radius
		Circle2D circle = new Circle2D(2, 2, 5.5);
		// test to see if our circle object contains point with coordinates user
		// entered
		System.out.println(circle.contains(3, 3));
		// test to see if our circle object contains new circle object with
		// values user entered
		System.out.println(circle.contains(new Circle2D(4, 5, 10.5)));
		// test to see if our circle object overlaps with new circle
		// object(checks if their perimeters overlap)
		System.out.println(circle.overlaps(new Circle2D(3, 5, 2.3)));

	}
}
