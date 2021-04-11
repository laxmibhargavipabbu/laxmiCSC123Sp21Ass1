package Assignment1;
import java.util.*;
import java.io.*;

public class SlotMachine
{
	static Scanner keyboard = new Scanner(System.in);
	public static boolean runGame(long s)
	{
		Random generator = new Random(s);
		generator.setSeed(s);
		boolean rtrnValue=false;
		int[] a = new int[3] ;
		for(int i=0; i<a.length;i++)
		{
				a[i] = generator.nextInt(5)+1;
		}
		if(a[0]==a[1] && a[0]==a[2] && a[1]==a[2])
		{
				rtrnValue = true;
		}
		else
		{
				rtrnValue = false;
		}		
		return rtrnValue;
	}
			
	public static void main (String [] args)
	{
		int num;
		long seed;
		int numWins=0;
		int numLosses=0;
		double pctWins;
		boolean rtrnValue;
		System.out.printf("Please enter the number of times to run the game: ");
		num = keyboard.nextInt();
		System.out.printf("Please enter the starting seed as an integer: ");
		seed = keyboard.nextLong();
		//run the game
		for(int i=0;i<=num;i++)
		{
			rtrnValue = runGame(seed);
			if(rtrnValue)
			{
				numWins = numWins+1;
			}
			else
			{
				numLosses = numLosses+1;
			}
			seed++;
		}
		pctWins = (double) (numWins)/num * 100;
		System.out.printf("The number of games won is %d and the percentage of wins is %.2f%%\n", numWins, pctWins);
	}
}