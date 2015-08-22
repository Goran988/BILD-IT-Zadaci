package zadaci_21_08_2015;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a program that removes all the occurrences of a specified string from a
 * text file. For example, invoking java Exercise12_11 John filename removes the
 * string John from the specified file. Your program should get the arguments
 * from the command line.
 */
public class RemoveText {

	public static void main(String[] args) throws IOException {
		//string we need to remove from the file
		String str = args[0];
		//file name
		String fileName = args[1];
		//file object with argument fileName
		File file = new File(fileName);
		//scanner object that reads from file
		Scanner in = new Scanner(file);
		//array list where we store text from file
		ArrayList<String> list = new ArrayList<>();
		//loopt that runs while scanner can read new line
		while (in.hasNextLine()) {
			//temp string that contains current line
			String fromFile = in.nextLine();
			//using regex to remove every occurrence of the file
			//and adding new version of the string to the list
			list.add((fromFile.replaceAll(str, "") + "\n"));
		}
		//file writer object
		FileWriter fw = new FileWriter(file);
		in.close();
		try {
			//writing content of the list into the file
			for (int i = 0; i < list.size(); i++) {
				fw.write(list.get(i));
			}
		} finally {
			fw.close();
		}
	}

}
