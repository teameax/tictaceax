
package com.eax.tictactoe;
import java.lang.String;
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
	public String gridInsert(int player, int coordinate)
	{
		if(player != 1 && player != 2) //Invalid input, please try again
		{
			return "Invalid input";
		}
		else if(coordinate < 0 || coordinate > 8) //Out of bounch
		{
			return "Out of bounds";
		}
		else if(grid[coordinate] == 1 || grid[coordinate] == 2) //Used coordinate
		{
			return "Used column";
		}
		else
		{
			grid[coordinate] = player;
			return "Success";
		}
	}
}

