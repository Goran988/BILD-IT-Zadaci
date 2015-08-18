package zadaci_17_08_2015;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Write the following method that shuffles the elements in an ArrayList of
 * integers. 
 * public static void shuffle(ArrayList<Integer> list)
 * 
 *
 */
public class ShuffleArrayList {

	public static void main(String[] args) {
		//array list object
		ArrayList<Integer> list = new ArrayList<>();
		//adding numbers to the list
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		//invoking the shuffle method
		shuffle(list);
	}

	public static void shuffle(ArrayList<Integer> list) {
		//loop that will iterate as many time as list have elements
		for (int i = 0; i < list.size(); i++) {
			//temp value that stores value of element we remove
			int num = list.get(i);
			//removing element
			list.remove(list.get(i));
			//creating random index
			int random = (int) (Math.random() * list.size() - 1);
			////adding back the value of element we removed at random index
			list.add(random, num);
		}
		//printing out new "shuffled" list
		System.out.println(list);
	}
}
