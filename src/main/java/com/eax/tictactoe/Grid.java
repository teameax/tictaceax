
package com.eax.tictactoe;

public class Grid {
	
	private int[] grid = new int[9];
	
	//Initialize game board
	public Grid() {
		for(int i = 0; i < 9; i++)
			grid[i] = 0;
	}

	public int[] getGrid()
	{
		return grid;
	}

	//Mark a space in the grid
	public int gridInsert(int player, int coordinate) throws IllegalArgumentException
	{
		if(player != 1 && player != 2)
		{
			throw new IllegalArgumentException("Invalid player number");
		}
		else if(coordinate < 0 || coordinate > 8) 
		{
			throw new IllegalArgumentException("Invalid grid number");
		}
		else if(grid[coordinate] == 1 || grid[coordinate] == 2)
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

