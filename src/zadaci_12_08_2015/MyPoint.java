package zadaci_12_08_2015;

/**
 * Class MyPoint have x and y data fields that store coordinates on x and y
 * axis, default constructor that sets values to 0,0 and constructor where user
 * assigns values. And method distance that calculates distance between two
 * points.
 * 
 *
 */
public class MyPoint {
	double x;
	double y;

	// default constructor that sets values of x and y to 0
	public MyPoint() {
		x = 0;
		y = 0;
	}

	/**
	 * 
	 * @param x
	 *            sets value for the x coordinate
	 * @param y
	 *            sets value for the y coordinate
	 */
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
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

	/**
	 * 
	 * @param a
	 *            object of My point class that we pass to the method
	 * @return method returns distance between two objects of MyPoint class as
	 *         double value
	 */
	public double distance(MyPoint a) {
		return Math.sqrt((this.x - a.x) * (this.x - a.x) + (this.y - a.y)
				* (this.y - a.y));
	}

}
