package zadaci_13_08_2015;

/**
 * Define the MyRectangle2D class that contains: Two double data fields named x
 * and y that specify the center of the rectangle with getter and setter
 * methods. (Assume that the rectangle sides are parallel to x- or y- axes.) The
 * data fields width and height with getter and setter methods.
 * A no-arg constructor that creates a default rectangle with (0, 0) for (x, y) and 1 for
 * both width and height. 
 * A constructor that creates a rectangle with the
 * specified x, y, width, and height. 
 * A method getArea() that returns the area of the rectangle. 
 * A method getPerimeter() that returns the perimeter of the
 * rectangle. 
 * A method contains(double x, double y) that returns true if the
 * specified point (x, y) is inside this rectangle. A method
 * contains(MyRectangle2D r) that returns true if the specified rectangle is
 * inside this rectangle. 
 * A method overlaps(MyRectangle2D r) that returns true if the specified rectangle overlaps with this rectangle
 */
public class MyRectangle2D {
	private double x;
	private double y;
	private double width;
	private double height;

	MyRectangle2D() {
		x = 0;
		y = 0;
		width = 1;
		height = 1;
	}

	MyRectangle2D(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	// get method for x data field
	public double getX() {
		return x;
	}

	// set method for x data field
	public void setX(double x) {
		this.x = x;
	}

	// get method for y data field
	public double getY() {
		return y;
	}

	// set method for y data field
	public void setY(double y) {
		this.y = y;
	}

	// get method for width data field
	public double getWidth() {
		return width;
	}

	// set method for width data field
	public void setWidth(double width) {
		this.width = width;
	}

	// get method for height data field
	public double getHeight() {
		return height;
	}

	// set method for height data field
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * method that calculates the area of the rectangle
	 * 
	 * @return area of the rectangle that is calculated by multiplying width and
	 *         length
	 */
	public double getArea() {
		return width * height;
	}

	/**
	 * method that calculates the perimeter of the rectangle
	 * 
	 * @return perimetere of the rectangle that is calculated by adding all
	 *         sides
	 */
	public double getPerimeter() {
		return 2 * (height + width);
	}

	/**
	 * method that checks if MyRectangle object contains point with passed
	 * coordinates
	 * 
	 * @param x
	 *            coordinate of our point
	 * @param y
	 *            coordinate of our point
	 * @return true if rectangle contains point and false if it don't
	 */
	public boolean contains(double x, double y) {
		if (x < (getWidth() / 2 + getX()) && x > getX() - (getWidth() / 2)) {
			if (y < (getY() + getHeight() / 2)
					&& y > getY() - (getHeight() / 2))
				return true;
		}
		return false;
	}

	/**
	 * method that checks if object that invokes the method contains passed
	 * object of MyRectangle2D class
	 * 
	 * @param r
	 *            object of MyRectangle2D class we pass to method
	 * @return true if our object contains object "r" and false if it doesn't
	 */
	boolean contains(MyRectangle2D r) {
		if (r.getX() < (getWidth() / 2 + getX())
				&& r.getX() > getX() - (getWidth() / 2)) {
			if (r.getY() < (getY() + getHeight() / 2)
					&& r.getY() > getY() - (getHeight() / 2)) {
				if (r.getWidth() <= getWidth() && r.getHeight() <= getHeight())
					return true;
			}
		}
		return false;
	}

	/**
	 * method that checks if two objects of MyRectangle2D class overlaps
	 * 
	 * @param r
	 *            object of MyRectangle2D class we pass to the method
	 * @return true if objects overlaps and false if they don't
	 */
	public boolean overlaps(MyRectangle2D r) {
		return x < r.x + r.width && x + width > r.x && y < r.y + r.height
				&& y + height > r.y;
	}
}
