package laxmiCSC123Sp21Ass1;
import java.util.*;
public class CalculatePi
{
	public static void main (String [] args)
	{
		double pi = 0.0;
		double denominator =1 ;
		double term; 
		int n = 200000;
		int x = 2000;
		
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				term = -(4/denominator);
			}
			else
			{
				term = (4/denominator);
			}
			pi = pi + term;
			
			denominator = denominator+2;
			
			if(i == x)
			{
				System.out.printf("The value of pi after summing %d terms is %.8f\n", x, pi);
				x = x+2000;
			}
				
		}
		
	}
}
