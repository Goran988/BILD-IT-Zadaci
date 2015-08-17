package zadaci_16_08_2015;

/**
 * test class for MyCharacter class
 */
public class CharTest {

	public static void main(String[] args) {
		// object of MyCharacter class with value of 'a'
		MyCharacter ch = new MyCharacter('a');
		// method that tests if our object is a letter
		System.out.println("Is character letter: " + MyCharacter.isLetter(ch));
		// method that tests if our object is a digit
		System.out.println("Is character digit: " + MyCharacter.isDigit(ch));
		// method that converts character from lower case to upper case
		System.out.println(ch.toUpperCase());
		// method that converts object from upper case to lower case
		System.out.println(new MyCharacter('A').toLowerCase());
		// toString method test
		System.out.println(ch);
	}

}
