package zadaci_13_08_2015;

public class MyRectangle2DTest {

	public static void main(String[] args) {
		//object of MyRectangle2D class
		MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
		//area of our object
		System.out.printf("Area of the rectangle is %.2f\n", r1.getArea());
		//perimeter of our object
		System.out
				.println("Perimeter of the rectangle is " + r1.getPerimeter());
		//test to see if our rectangle contains point (3,3)
		System.out.println("Rectangle contains point " + r1.contains(3, 3));
		//test to see if our rectangle contains another rectangle
		System.out.println("Rectangle contains other rectangle "
				+ r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
		//test to see if our rectangle overlapse with other rectangle
		System.out.println("Rectangle overlapse other rectangle "
				+ r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));

	}
}
