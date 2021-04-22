package laxmiCSC123Sp21Ass1;
import java.io.*;
import java.util.*;
public class StringRotation
{
	static Scanner keyboard = new Scanner(System.in);
		
	public static void main (String [] args)
	{
		String str = " ";
		String newStr = " ";
		int n, length;
		System.out.printf("Please enter a String for rotation\n");
		str = keyboard.nextLine();
		System.out.printf("Please enter the number of characters to rotate. Rotation must be greater than or equal to 0\n");
		n = keyboard.nextInt();
		length = str.length();
		newStr = str.substring(str.length()-n) + str.substring(0,str.length() - n);    
		System.out.printf("When the original String " + '"' + "%s" + '"' + " is rotated %d and the rotated String is " + '"' + "%s" + '"' + "\n",str,n,newStr);
	}
}
