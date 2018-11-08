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
		
		String longestWord = "";
		for(String wrd : words)
		{
			if(wrd.length() > (wrd+1).length())
			{
				longestWord = wrd;
			}
			else
			{
				longestWord = words.get(+1);
			}
		}
		System.out.println("The longest word is " + longestWord);
		int numWords = 0;
		int totalLength = 0;
		for(String wrd : words)
		{
			numWords ++;
			totalLength = wrd.length();
		}
		int averageLength = totalLength/numWords;
		System.out.println("The average word length is " + averageLength + " letters long.");
	}

}
