/**
 * @author Akira Morales
 * Gettysburg Address
 * Period 6
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GettysburgAddressMain {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner file = new Scanner(new File("GettysburgAddress.txt"));	
		ArrayList<String> words = new ArrayList<String>();
		
		while(file.hasNext())
		{
			words.add(file.next());
		}
		for(String fileIn : words)
		{
			if(fileIn.endsWith(",") || fileIn.endsWith("."))
			{
				fileIn = fileIn.substring(0, fileIn.length() - 1);
			}
			else if(fileIn.contains("--"))
			{
				fileIn = fileIn.substring(0, fileIn.indexOf("--"));
			}
		}
		
		String longestWord = words.get(0);
		for(String fileIn : words)
		{
			if(longestWord.length() < fileIn.length())
			{
				longestWord = fileIn;
			}
		}
		System.out.println("The longest word is \"" + longestWord + "\".");
		
		double sum = 0;
		for(String fileIn : words)
		{
			sum += fileIn.length();
		}
		System.out.println("The average word length is " + sum/words.size() + " letters.");
	}

}
