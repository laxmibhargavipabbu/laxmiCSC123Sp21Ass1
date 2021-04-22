package laxmiCSC123Sp21Ass1;
import java.io.*;
import java.util.*;

public class NameSearch  
{
	static Scanner keyboard = new Scanner(System.in);
	public static String[] getArray(String input) throws IOException
	{
		List<String> lines = new ArrayList<String>();
		int num =0;
		
		File inputFile = new File(input);
		Scanner inputReader = new Scanner(inputFile);
		num = getNumNames(inputFile);
		
        while (inputReader.hasNextLine())
        {
        		lines.add(inputReader.nextLine());
        }

        String[] namelist = lines.toArray(new String[0]);
		
		inputReader.close();
		return namelist;
	}
	
	public static int getNumNames(File input) throws IOException
	{
		Scanner inputReader = new Scanner(input);
		int count=0;
		while (inputReader.hasNext())
		{
			count++;
			inputReader.nextLine();
		}
		inputReader.close();
		return count;
	}
	
	public static boolean isFound(String nameSearch, String[] nameListSearch)
	{
		boolean result = false;
		
		for(int i = 0; i<nameListSearch.length; i++)
		{
			if(nameListSearch[i].equalsIgnoreCase(nameSearch))
			{
				result = true;
			}
		}
		return result;
	}
	
	public static void main(String args[]) throws IOException 
	{
		
		boolean result1 = false;
		boolean result2 = false;
		String yesOrNo;
		String[] boyslist=new String[200];
		String[] girlslist=new String[200];
		
		System.out.printf("Please enter the name of the boy's file:\n");
		String boysFile = keyboard.nextLine();
		
		System.out.printf("Please enter the name of the girl's file:\n");
		String girlsFile = keyboard.nextLine();
		
		boyslist = getArray(boysFile);
		girlslist = getArray(girlsFile);
		//System.out.printf("Do you want to search for names? Enter Y or N: \n");
		do
		{
			System.out.printf("Do you want to search for names? Enter Y or N: \n");
			yesOrNo = keyboard.nextLine();
			while(yesOrNo.equalsIgnoreCase("y"))
			{
				System.out.printf("Enter a boy's name, or N if you do not wish to enter a boy's name: \n");
				String ans = keyboard.nextLine();
				System.out.printf("Enter a girl's name, or N if you do not wish to enter a girl's name: \n");
				String ans1 = keyboard.nextLine();
					
				if(ans !="N" || ans !="n")
				{
					result1 = isFound(ans, boyslist);
					
					if(ans1 !="N" || ans1 !="n")
					{
						result2 = isFound(ans1, girlslist);
					}
					if(result1)
					{
						System.out.printf("%s is one of the most popular boy's names\n", ans);
					}
					else
					{
						System.out.printf("%s is not one of the most popular boy's names.\n", ans);
					}
					if(result2)
					{
						System.out.printf("%s is one of the most popular girl's names.\n", ans1);
					}
					else
					{
						System.out.printf("%s is not one of the most popular girl's names.\n", ans1);
					}
				}
				break;
			}
			
		}while(yesOrNo.equalsIgnoreCase("y"));
			
	}
}