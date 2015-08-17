package zadaci_16_08_2015;

//test class for MyString1 class methods
public class MyString1Test {

	public static void main(String[] args) {
		char[] ch = { 'a', 'b', 'c', 'd' };
		char[] chUpper = { 'A', 'B', 'C', 'D' };
		//object of MyString1 class created with ch char array
		MyString1 str1 = new MyString1(ch);
		//test for charAt method
		System.out.println("Character at index 2 " + str1.charAt(2));
		//test of length method
		System.out.println("Length of our str1 object " + str1.length());
		//substring method test
		MyString1 string = str1.substring(1, 2);
		System.out.println("Substring of str1 object ");
		for (int i = 0; i < string.length(); i++) {
			System.out.print(string.charAt(i) + " ");
		}
		//method tha tests if the objects are equal
		System.out.println("\nAre objects equal " + ch.equals(chUpper));
		//method that converts integer into array of characters and prints them out
		System.out.println(MyString1.valueOf(10));
	}

}
