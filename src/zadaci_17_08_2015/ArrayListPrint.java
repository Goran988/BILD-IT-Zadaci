package zadaci_17_08_2015;

import java.util.ArrayList;
import java.util.Date;

import javafx.scene.shape.Circle;

/**
 * Write a program that creates an ArrayList and adds a Loan object, a Date
 * object, a string, and a Circle object to the list, and use a loop to display
 * all the elements in the list by invoking the object’s toString() method.
 *
 */
public class ArrayListPrint {

	public static void main(String[] args) {
		// array list object
		ArrayList list = new ArrayList();
		// adding date object
		list.add(new Date());
		// adding triangle object
		list.add(new Triangle());
		// adding loan object
		list.add(new Loan(2500));
		// adding circle object
		list.add(new Circle());
		// printing out all the elements of the list
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
}
