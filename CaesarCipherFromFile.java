package Assignment1;
import java.util.*;
import java.io.*;

public class CaesarCipherFromFile
{
	public static StringBuffer encrypt(String text, int shift) 
    { 
        StringBuffer result= new StringBuffer(); 
  
        for (int i=0; i<text.length(); i++) 
        { 
            if (Character.isUpperCase(text.charAt(i))) 
            { 
                char ch = (char)(((int)text.charAt(i) +shift - 65) % 26 + 65); 
                result.append(ch); 
            } 
            else if (Character.isLowerCase(text.charAt(i)))
            { 
                char ch = (char)(((int)text.charAt(i) + shift - 97) % 26 + 97); 
                result.append(ch); 
            } 
            else if ((Character.isWhitespace(text.charAt(i))) || (!Character.isLetter(text.charAt(i))))
            { 
                continue;
            }
            	
        } 
        return result; 
    } 

	public static void main(String [] args) throws IOException
	{
		int shift=0;
		String message;
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Please enter the name of the input file: \n");
		String inputFileName = keyboard.next();
		File inputFile = new File(inputFileName); 
		if(!inputFile.exists())
		{
			System.out.printf("Input File %s not found\n", inputFileName);
			System.exit(0);
		}
		Scanner inputReader = new Scanner(inputFile);
		System.out.printf("Please enter the shift of places: \n");
		shift = keyboard.nextInt();
		System.out.printf("Please enter the name of the output file: \n");
		String outputFileName = keyboard.next();
		File outputFile = new File (outputFileName);
		PrintWriter outputWriter = new PrintWriter(outputFile);
		
		while (inputReader.hasNext())
		{
			message = inputReader.nextLine();
			String outputLine = (encrypt(message, shift)).toString();
			outputLine = outputLine.toUpperCase();
			outputWriter.printf("%s\n",outputLine);
		}
		inputReader.close();
		outputWriter.close();
	}
}