package laxmiCSC123Sp21Ass1;
import java.util.Scanner;
import java.lang.Math;

public class ArrayOperations2D
{
	public static void fillRandom(int array[][])
	{
		int randomCalculated;
		int x=0, y=99;
		
		for(int row=0;row<array.length;row++)
		{
			for(int col=0;col<array[row].length;col++)
			{
				double generated = Math.random();
				randomCalculated = (int)((y-x+1)*generated) + x;
				array[row][col] = randomCalculated;
			}
		}
	}
	
	public static void formatPrint(int array[][])
	{
		for(int row=0;row<array.length;row++)
		{
			for(int col=0;col<array[row].length;col++)
			{
				System.out.printf("%d\t", array[row][col]);
			}
			
			System.out.printf("Come Home\n");
		}
		
		System.out.printf("\n");
	}
	
	public static int getTotal(int array[][])
	{
		int total=0;
		
		for(int row=0;row<array.length;row++)
		{
			for(int col=0;col<array[row].length;col++)
			{
				total = (array[row][col] + total);
			}
		}
		
		return total;			
	}

	public static int getElementCount(int array[][])
	{
	
		int totalElements=0;
		
		for(int row=0;row<array.length;row++)
		{
			for(int col=0;col<array[row].length;col++)
			{
				totalElements = totalElements+1 ;
			}
		}
		
		return totalElements;
	}
	
	public static double getAverage(int array[][])
	{
		double average=0.0;
		int x = (getTotal(array));
		average = ((double)x/getElementCount(array));
		return average;					
	}
	
	public static int getRowTotal(int array[][], int row)
	{
		int rowTotal=0;
		
		for (int col = 0; col < array[row].length; col++) 
		{
			rowTotal = rowTotal + array[row][col];
        }
		return rowTotal;
	}
	
	public static int getColumnTotal(int array[][], int col)
	{
		int colTotal=0;
		
		for (int row = 0; row < array.length; row++) 
		{
			colTotal = colTotal + array[row][col];
        }
        
        return colTotal;
	}
	
	public static int getHighestInRow(int array[][], int row)
	{
		int rowHigh=0;
		int temp = 0;
		int i = row;
		
		for(int col=0;col<array[i].length;col++)
		{
			temp = array[i][col];			
			if(temp>rowHigh)
			{
				rowHigh = temp;
			}
		}
		return rowHigh;
	}
	
	public static int getLowestInRow(int array[][], int row)
	{
		int temp;
		int i = row;
		int rowLow=array[i][0];
		for(int col=0;col<array[i].length;col++)
			{
				temp = array[i][col];
				if(temp<rowLow)
				{
					rowLow = temp;
				}
			}
		return rowLow;
	}
	
	public static void main (String [] args)
	{
		int rows, cols;
		int rowNum = 0;
		int colNum = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Please enter the number of rows and columns in a two dimensional array: ");
		rows = keyboard.nextInt();
		cols = keyboard.nextInt();
		int [][] array = new int[rows][cols];
		
		//populating the array elements
		fillRandom(array);
		
		//printing the array elements
		formatPrint(array);
		
		System.out.printf("Processing the int array.\n");
		
		//getting total of array elements
		System.out.printf("Total : %d\n", getTotal(array));
			
		//getting average of all elements in the two dimensional array
		System.out.printf("Average : %.2f\n", getAverage(array));
		
		//getting total, highest, lowest value of a row
		for(int row=0;row<array.length;row++)
		{
			System.out.printf("Total of row %d : %d\n",row, getRowTotal(array, row));
			System.out.printf("Highest of row %d : %d\n", row, getHighestInRow(array, row));
			System.out.printf("Lowest of row %d : %d\n", row, getLowestInRow(array, row));
		}
		
		//getting total value of a column
		//for (int col = 0; col < cols; col++) 
		//{
		//	System.out.printf("The total of column %d : %d\n", col, getColumnTotal(array, col));
		//}
	}	
}