package zadaci_21_08_2015;

/**
 * Write a program that will count
 * the number of characters, words, and lines in a file. Words are separated by
 * whitespace characters. The file name should be passed as a command-line
 * argument.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountInFile {

	public static void main(String[] args) throws FileNotFoundException {
		//string fileName is first argument passed from command line
		String fileName = args[0];
		//file object created with fileName string
		File file = new File(fileName);
		//scanner object that reads from file
		Scanner in = new Scanner(file);
		//counter for words
		int sumWords = 0;
		//counter for chars
		int sumChars = 0;
		//counter for lines
		int sumLines = 0;
		//loop will run until scaner has next line
		while (in.hasNextLine()) {
			//every line from file is stored into temp string object
			String line = in.nextLine();
			//for each iteration of the loop we increment lines counter
			sumLines++;
			//we add length of each line to sumChars counter;
			sumChars += line.length();
			//we add length of array made by spliting temp string at " " (space)
			sumWords += line.split(" ").length;
		}
		//closing scanner
		in.close();
		//printing out results
		System.out.println("Number of words in a file was: " + sumWords);
		System.out.println("Number of chars in a file was: " + sumChars);
		System.out.println("Number of lines in a file was: " + sumLines);

	}
}
