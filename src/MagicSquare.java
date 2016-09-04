/**
 * class to create magic square
 * @author brettnelson
 */

import java.util.ArrayList;

public class MagicSquare {
	
	private int[][] nums;
	private boolean[][] checks;
	private int size;
	
	/**
	 * constructs a MagicSquare
	 * @param size an int
	 */
	public MagicSquare(int size)
	{
		this.size = size;
		nums = new int[size][size];
		checks = new boolean[size][size];
	}

	/**
	 * method to return toString value
	 * returns String
	 */
	public String toString()
	{
		setNumbers();
		String output = "";
		for (int i = 0; i<size; i++)
		{
			for (int j = 0; j<size; j++)
				output += nums[i][j] + " ";
			output += "\n";
		}
		return output;
	}
	
	public void setNumbers()
	{		
		int count = 1;
		int i = size-1;
		int j = size/2;
		while(count<=size*size)
		{
			nums[i][j] = count;
			checks[i][j] = true;
			count++;
			
			int i2 = i;
			int j2 = j;
			
			if(i+1 == size)
				i = 0;
			else
				i++;
			if(j+1 == size)
				j = 0;
			else
				j++;
			if(checks[i][j])
			{
				i = i2 - 1;
				j = j2;
			}
		}
	}
	
}
