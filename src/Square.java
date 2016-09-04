import java.util.ArrayList;

public class Square {

	private ArrayList<Integer> numbers = new ArrayList<Integer>();
	private ArrayList<Integer> testNumbers = new ArrayList<Integer>();
	private int[][] grid;
	private int total = 0;
	
	/**
	 * adds a number to numbers arraylist
	 * @param number an int
	 */
	public void add(int number)
	{
		numbers.add(number);
		total++;
	}
	
	/**
	 * tests to see if a square is a magic square
	 * @return true/false
	 */
	public boolean isMagic()
	{
		int index = 0;
		int rowSum = 0;
		int testRow = 0;
		int testCol = 0;
		int n = (int)Math.sqrt(total);
		
		//checks to see if total entries is a square
		if (n<Math.sqrt(total))
			return false;
		
		//checks to see if any numbers are repeated
		for(Integer num:numbers)
		{
			if (testNumbers.contains(num))
				return false;
			testNumbers.add(num);
		}
		
		//checks to make sure columns/rows sum equally
		grid = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j< n; j++)
			{
				grid[i][j] = numbers.get(index);
				index++;
			}
				
		for (int j = 0; j < n; j++)
			rowSum += grid[0][j];
		
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j< n; j++)
			{
				testRow += grid[i][j];
				testCol += grid[j][i];
			}
			if(testRow != rowSum || testCol != rowSum)
				return false;
			testRow = 0;
			testCol = 0;
		}
		return true;
	}
}
