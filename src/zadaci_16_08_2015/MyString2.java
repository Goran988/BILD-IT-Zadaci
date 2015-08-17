package zadaci_16_08_2015;

/**
 * The String class is provided in the Java library. Provide your own
 * implementation for the following methods (name the new class MyString2):
 * public MyString2(String s); 
 * public int compare(String s);
 * public MyString2 substring(int begin); 
 * public MyString2 toUpperCase();
 *  public char[] toChars(); 
 *  public static MyString2 valueOf(boolean b)
 * 
 */
public class MyString2 {
	String str;

	// constructor that uses string parameter to create object
	MyString2(String s) {
		this.str = s;
	}

	/**
	 * method that compares two objects
	 * 
	 * @param s
	 *            - object that is to be compared with object that invokes
	 *            method
	 * @return returns 1 if "this" object is bigger, 0 if they're equal and -1
	 *         if "this" object is smaller
	 */
	public int compare(String s) {
		if (str.length() > s.length())
			return 1;
		else if (str.length() == s.length())
			return 0;
		else
			return -1;
	}

	/**
	 * method that returns new string that goes from parameter begin to the end
	 * of the string
	 * 
	 * @param begin
	 *            - index of element that will be at the begining of the new
	 *            string
	 * @return MyString2 object with new value
	 */
	public MyString2 substring(int begin) {
		String s = "";
		for (int i = begin; i < str.length(); i++) {
			s += str.charAt(i);
		}
		return new MyString2(s);
	}

	/**
	 * method that converts string to upper case letters
	 * 
	 * @return returns new object with upper case letters
	 */
	public MyString2 toUpperCase() {
		String strUp = "";
		for (int i = 0; i < str.length(); i++) {
			strUp += Character.toUpperCase(str.charAt(i));
		}
		return new MyString2(strUp);
	}

	/**
	 * method that converts string to char array
	 * 
	 * @return - char array
	 */
	public char[] toChars() {
		char[] ch = new char[this.str.length()];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = str.charAt(i);
		}
		return ch;
	}

	/**
	 * method that returns textual value of boolean variable
	 * 
	 * @param b
	 *            - boolean variable passed to method
	 * @return returns string value of boolean
	 */
	public static MyString2 valueOf(Boolean b) {
		if (b)
			return new MyString2("true");
		else
			return new MyString2("false");
	}

	// method that allows us printing of the object
	public String toString() {
		return this.str;
	}
}
