package laxmiCSC123Sp21Ass1;
import java.util.*;
import java.io.*;

public class RemoveBlanksFromStrings
{
	public static Scanner createFileScanner(String input) throws FileNotFoundException
	{
		Scanner inputReader;
		inputReader = new Scanner(new File(input));
		return inputReader;
	}
	
	public static PrintWriter createPrintWriter(String output) throws IOException
	{
		PrintWriter outputWriter = new PrintWriter(new FileWriter(output));
		return outputWriter;
	}
	
	public static int readInLines(Scanner inputF,String arrlines[])
	{
		int count = 0;
		while(count < 100 && inputF.hasNext())
		{
			arrlines[count] = inputF.nextLine();
			count++;
		}
		return count;
	}
	
	public static String[] removeBlanks(String arrlines[],int nLines)
	{
		String[] result = new String[nLines];
		
		for(int i=0;i<nLines;i++)
		{
		String[] lines = arrlines[i].split("\\s+");
		result[i] = String.join("",lines);
		}
		return result;
	}
	
	public static void main (String [] args) throws IOException
	{
		int nLines=0;
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Please enter the name of the input file: \n");
		String inputFileName = keyboard.next();
		Scanner inputFile = createFileScanner(inputFileName);
		System.out.printf("Please enter the name of the output file: \n");
		String outputFileName = keyboard.next();
		PrintWriter outputFile = createPrintWriter(outputFileName);
		String[] arrlines = new String[100];
		nLines = readInLines(inputFile,arrlines);
		arrlines = removeBlanks(arrlines, nLines);
		for(int i=0;i<nLines;i++)
		{
			outputFile.println(arrlines[i]);
		}
		inputFile.close();
		outputFile.close();
	}
}