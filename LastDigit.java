package Assignment1;
import java.util.Scanner;
import java.lang.Math;


public class LastDigit
{
	public static void main (String [] args)
	{
		int n, x;
		double a, b, lastdigit;
		
		//Using scanner to accept input from user
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Please enter the integer to power of three: ");
		n = keyboard.nextInt();
		
		if (n > 0)
		{
			x = (n%4);
			
			//Calculate the last digit using expersion
			lastdigit = (((-2)*(Math.pow(x,3))) + (8*(Math.pow(x,2))) - (4*x) + (1));
			
			//printing the last digit
			System.out.printf("The last digit of 3 to the power %d is %.1f \n", n, lastdigit);
		}
		else
		{
		  System.out.printf("Invalid input!\n");
		}
	}
}