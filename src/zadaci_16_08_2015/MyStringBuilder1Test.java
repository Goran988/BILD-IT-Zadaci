package zadaci_16_08_2015;

//class that tests methods from MyStringBuilder1 class
public class MyStringBuilder1Test {

	public static void main(String[] args) {
		MyStringBuilder1 str = new MyStringBuilder1("Some string");
		MyStringBuilder1 str2 = new MyStringBuilder1("other string");
		// method that appends two strings
		System.out.println(str.append(str2));
		// method that appends string and int
		System.out.println(str.append(5));
		// method that returns length of the object
		System.out.println(str.length());
		// method that returns char at given index
		System.out.println(str.charAt(5));
		// method that converts string to lower case
		System.out.println(str.toLowerCase());
		// method that returns substring of previous string
		System.out.println(str.substring(2, 10));

	}

}
