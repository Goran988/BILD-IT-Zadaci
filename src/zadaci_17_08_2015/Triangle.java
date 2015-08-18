package zadaci_17_08_2015;

/**
 * Design a class named Triangle that extends GeometricObject. The class
 * contains: 
 * Three double data fields named side1, side2, and side3 with default
 * values 1.0 to denote three sides of the triangle
 * A no-arg constructor that creates a default triangle.
 * A constructor that creates a triangle with the specified side1, side2, and
 * side3
 * The accessor methods for all three data fields.
 * A method named getArea() that returns the area of this triangle
 * A method named getPerimeter() that returns the perimeter of this triangle
 * A method named toString() that returns a string description for the triangle
 */
public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	
	//default constructor
	Triangle() {
		side1 = 1;
		side2 = 1;
		side3 = 1;
	}
	//constructor that allows user to set values for sides
	Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	//get method for side1 data field
	public double getSide1() {
		return side1;
	}
	//set method for side1 data field
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	//get method for side2 data field
	public double getSide2() {
		return side2;
	}
	//set method for side2 data field
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	//get method for side3 data field
	public double getSide3() {
		return side3;
	}
	//set method for side3 data field
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	//method that calculates area of triangle
	public double getArea() {
		double h = getPerimeter() / 2;
		double area = Math.sqrt(h * (h - side1) * (h - side2) * (h - side3));
		return area;
	}
	//method that calculates perimeter of triangle
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	//method that prints values of data fields of object
	public String toString() {
		return "Triangle sides are " + side1 + ", " + side2 + ", " + side3
				+ ", " + "\nTriangle is filled? " + this.isFilled()
				+ "\nColor is: " + this.getColor();

	}

}
