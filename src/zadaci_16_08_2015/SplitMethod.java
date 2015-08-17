package zadaci_16_08_2015;

import java.util.ArrayList;

/**
 * The split method in the String class returns an array of strings consisting
 * of the substrings split by the delimiters. However, the delimiters are not
 * returned. Implement the following new method that returns an array of strings
 * consisting of the substrings split by the matching delimiters, including the
 * matching delimiters. 
 * public static String[] split(String s, String regex) 
 * For example, split("ab#12#453", "#") returns ab, #, 12, #, 453 in an
 * array of String
 * 
 */
public class SplitMethod {
	public static void main(String[] args) {
		String[] res = split("ab#12#453", "#");
		for (String e : res) {
			System.out.print(e + " ");
		}
	}

	/**
	 * method that splits the string and add "tokens" to string array
	 * 
	 * @param s
	 *            - string that will be split
	 * @param regex
	 *            - string that serves as delimiter
	 * @return string array consisting of pieces of string passed to method
	 */
	public static String[] split(String s, String regex) {

		ArrayList<String> res = new ArrayList<String>();
		String temp = "";
		int count = 0;
		// nested loop goes compares each character of the string with each
		// character of "regex" expresion
		for (int i = 0; i < s.length(); i++) {
			count = 0;
			for (int j = 0; j < regex.length(); j++) {
				// if loop find match between char from string and char from
				// regex it adds temp string to array list and resets the string
				// else it increments the counter
				if (s.charAt(i) == regex.charAt(j)) {
					res.add(temp);
					res.add(Character.toString(regex.charAt(j)));
					temp = "";
					break;
				} else {
					count++;
				}
				// if looped passed through regex and didn't find match it adds
				// character to temp strings
				if (count == regex.length()) {
					temp += s.charAt(i);
				}
			}
		}
		// adding last part of the string
		res.add(temp);
		// converting array list to string array
		String[] result = new String[res.size()];
		for (int i = 0; i < res.size(); i++) {
			result[i] = res.get(i);
		}
		return result;
	}
}
