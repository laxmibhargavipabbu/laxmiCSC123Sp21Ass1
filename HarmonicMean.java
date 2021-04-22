package laxmiCSC123Sp21Ass1;
import java.util.Scanner;
import java.lang.Math;

public class HarmonicMean
{	
	//Method to determine Harmonic mean of two integers
	public static double harmonicMean(int x, int y)
	{
		double H=0.0;
		H = (double)(2*x*y)/(x+y);
		return H;
	}
	
	//Method to determine Arithmetic mean of two integers
	public static double arithmeticMean(int x, int y)
	{
		double A=0.0;
		A = (double)(x+y)/2;
		return A;
	}
	
	//Method to determine Geometric mean of two integers
	public static double geometricMean(int x, int y)
	{
		double G=0.0;
		G = (double) Math.pow((x*y),0.5);
		return G;
	}
	
	public static void main (String [] args)
	{
		int i,j;
		Scanner integer1 = new Scanner(System.in);
		Scanner integer2 = new Scanner(System.in);
		System.out.printf("Enter two integers values: ");
		i = integer1.nextInt();
		j = integer2.nextInt();
		
		if(i > 0 && j > 0)
		{
			System.out.printf("Harmonic Mean of %d and % d is: %.7f\n", i, j, harmonicMean(i,j));
			System.out.printf("Arithmetic Mean of %d and %d is: %.7f\n", i, j, arithmeticMean(i,j));
			System.out.printf("Geometric Mean of %d and %d is: %.7f\n", i, j, geometricMean(i,j));
		}
		else
		{
			System.out.println("Invalid input!\n");
		}
		
	}
}