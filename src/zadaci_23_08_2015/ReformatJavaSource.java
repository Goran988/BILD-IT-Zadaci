package zadaci_23_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Write a program that converts the Java source code from the next-line brace
 * style to the end-of-line brace style. Your program can be invoked from the
 * command line with the Java sourcecode file as the argument. It converts the
 * Java source code to a new format. For example, the following command converts
 * the Java source-code file Test.java to the end-of-line brace style.
 */
public class ReformatJavaSource {

	public static void main(String[] args) throws FileNotFoundException {
		//in case there is just one passed argument
		if (args.length == 1) {
			try {
				//creating string with argument
				String fileName = args[0];
				//creating file with string passed from cmd
				File file = new File(fileName);
				//scanner object with file as argument
				Scanner input = new Scanner(file);
				String string = "";
				//loop runs until there are no more lines in the file
				while (input.hasNext()) {
					//adding to string next line and "next line" command
					string += input.nextLine() + "\n";

				}
				//using "regex" to replace any white spaces(including tabs) and { with ){
				string = string.replaceAll("\\)\\s*\\{", ") {");
				//using "regex" to remove white space
				string = string.replaceAll("\\s*\\{", " {");
				//closing scanner
				input.close();
				//print writer object with file we created as argument
				PrintWriter pw = new PrintWriter(file);
				//writing the string into the file
				pw.append(string);
				pw.close();
				System.out.println("Reformat complete.");
			} catch (Exception e) {
				System.out.println("File not found!");
			}
		}
	}
}
