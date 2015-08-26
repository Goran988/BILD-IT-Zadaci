package zadaci_25_08_2015;

/**
 * Design an interface named Colorable with a void method named howToColor().
 * Every class of a colorable object must implement the Colorable interface.
 * Design a class named Square that extends GeometricObject and implements
 * Colorable. Implement howToColor to display the message Color all four sides.
 */
public class ColorableTest {

	public static void main(String[] args) {
		// creating 5 objects that we will store in GeometricObject array list
		Square rec1 = new Square("blue", true, 2, 3);
		Square rec2 = new Square("", false, 1, 1);
		Square rec3 = new Square("", false, 3, 3);
		Square rec4 = new Square("", false, 2, 3);
		Circle c1 = new Circle(2);
		//creating array with 5 objects
		GeometricObject[] list = { rec1, rec2, rec3, c1, rec4 };
		//going through the array and invoking howToColor method if possible
		for (int i = 0; i < list.length; i++) {
			if (list[i] instanceof Colorable) {
				System.out.print("Area of object is: " + list[i].getArea()
						+ " ");
				((Colorable) list[i]).howToColor();
			} else
				System.out.println();
		}
	}

}

/**
 * Interface Colorable that contains abstract method howToColor
 */
interface Colorable {
	abstract void howToColor();
}

/** Class Square that implements Colorable interface */
class Square extends GeometricObject implements Colorable {
	private double height;
	private double width;

	// default constructor
	public Square() {

	}

	// constructor that create object with set datafields
	public Square(String color, boolean filled, double height, double width) {
		super(color, filled);
		this.height = height;
		this.width = width;
	}

	/** Overriden method that calculates area of the square */
	@Override
	public double getArea() {
		return height * width;
	}

	// implementation of the howToColor interface
	public void howToColor() {
		System.out.println("Color all four sides.");

	}

}
