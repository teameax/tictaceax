
package com.eax.tictactoe;

public class Grid {
	
	private int[] grid = new int[9];

	public Grid() {
		for(int i = 0; i < 9; i++)
			grid[i] = 0;
	}

	public int[] getGrid()
	{
		return grid;
	}
	public int gridInsert(int player, int coordinate) throws IllegalArgumentException
	{
		if(player != 1 && player != 2) //Invalid input, please try again
		{
			throw new IllegalArgumentException("Invalid player number");
		}
		else if(coordinate < 0 || coordinate > 8) //Out of bounds
		{
			throw new IllegalArgumentException("Invalid grid number");
		}
		else if(grid[coordinate] == 1 || grid[coordinate] == 2) //Used coordinate
		{
			return -1;
		}
		else
		{
			grid[coordinate] = player;
			return 0;
		}
	}
}

