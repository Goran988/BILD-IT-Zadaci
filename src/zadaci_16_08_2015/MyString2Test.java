package zadaci_16_08_2015;
//class that tests methods for MyString2 class
public class MyString2Test {

	public static void main(String[] args) {
		MyString2 str = new MyString2("Some new String");
		// method that compares strings
		System.out.println(str.compare("Some other string"));
		// method that prints substring with starting parameter
		System.out.println(str.substring(3));
		// method that converts string to upper case
		System.out.println(str.toUpperCase());
		// method tha converts string to array of chars
		char[] ch = str.toChars();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
		// method that returns textual value of boolean
		boolean test = true;
		System.out.println("\n" + MyString2.valueOf(test));

	}

}
