package com.eax.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;


public class GridTest {
    
    @Test //test for the 3*3 Grid
     public void testGrid() 
    {
    	int[] testgrid = new int[9]; 
    	for(int i = 0; i < 9; i++)
			testgrid[i] = 0;
		Grid grid = new Grid();
        assertArrayEquals(testgrid, grid.getGrid());
    }    


    @Test //Test input into grid
    public void testgridInsert()
    {
    	Grid grid = new Grid();
        try {
            grid.gridInsert(3, 4);
            fail("Should thow an exception");

        }
        catch(IllegalArgumentException e) {
        	assertEquals("Invalid player number", e.getMessage());
        }
    }

    @Test //Test input into grid
    public void testgridInsert1()
    {
        Grid grid = new Grid();
        try {
            grid.gridInsert(1, 10);
            fail("Should thow an exception");

        }
        catch(IllegalArgumentException e) {
            assertEquals("Invalid grid number", e.getMessage());
        }
    }

    @Test //Test input into grid
    public void testgridInsert1_a()
    {
        Grid grid = new Grid();
        try {
            grid.gridInsert(1, -5);
            fail("Should thow an exception");

        }
        catch(IllegalArgumentException e) {
            assertEquals("Invalid grid number", e.getMessage());
        }
    }
    
    @Test //Test input into grid
    public void testgridInsert2()
    {

        Grid grid = new Grid();
        grid.gridInsert(2,5);
        int[] arr = grid.getGrid();
        assertEquals(2, arr[5]);
    }

    @Test //Test input into grid
    public void testgridInsert3()
    {
        Grid grid = new Grid();
        grid.gridInsert(1,5);
        int[] arr = grid.getGrid();
        assertEquals(1, arr[5]);
    }

}


