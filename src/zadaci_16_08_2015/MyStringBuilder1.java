package zadaci_16_08_2015;

/**
 * The StringBuilder class is provided in the Java library. Provide your own
 * implementation for the following methods 
 * public MyStringBuilder1(String s);
 * public MyStringBuilder1 append(MyStringBuilder1 s); 
 * public MyStringBuilder1 append(int i); 
 * public int length(); 
 * public char charAt(int index);
 * public MyStringBuilder1 toLowerCase(); 
 * public MyStringBuilder1 substring(int begin, int end); 
 * public String toString();
 *
 */
public class MyStringBuilder1 {
	String str;

	public MyStringBuilder1(String s) {
		this.str = s;
	}

	// method that apends two strings and returns the result
	public MyStringBuilder1 append(MyStringBuilder1 s) {
		this.str += s.str;
		return new MyStringBuilder1(this.str);
	}

	// method that apends integer to the string
	public MyStringBuilder1 append(int i) {
		return new MyStringBuilder1(this.str += i);
	}

	// method that returns length of the string
	public int length() {
		return str.length();
	}

	// method that returns character at given index
	public char charAt(int index) {
		return str.charAt(index);
	}

	// method that converts string to lower case and returns new string
	public MyStringBuilder1 toLowerCase() {
		String res = "";
		for (int i = 0; i < this.str.length(); i++) {
			res += Character.toLowerCase(this.str.charAt(i));
		}
		return new MyStringBuilder1(res);
	}

	/**
	 * method that creates substring from previous string
	 * 
	 * @param begin
	 *            - first index
	 * @param end
	 *            - last index
	 * @return new string that is created by cutting old one at given indexes
	 */
	public MyStringBuilder1 substring(int begin, int end) {
		String res = "";
		for (int i = begin; i <= end; i++) {
			res += this.str.charAt(i);
		}
		return new MyStringBuilder1(res);
	}

	// overriden method that alows printing
	public String toString() {
		return this.str;
	}
}
