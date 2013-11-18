package com.eax.tictactoe;
import java.io.ByteArrayOutputStream;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;


public class GridTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
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
    	assertEquals("Invalid input", grid.gridInsert(3, 4));
    }

    @Test //Test input into grid
    public void testgridInsert1()
    {
        Grid grid = new Grid();
        assertEquals("Out of bounds", grid.gridInsert(1, 10));
    }

    @Test //Test input into grid
    public void testgridInsert1_a()
    {
        Grid grid = new Grid();
        assertEquals("Out of bounds", grid.gridInsert(1, -5));
    }
    
    @Test //Test input into grid
    public void testgridInsert2()
    {

        Grid grid = new Grid();
        grid.gridInsert(2,5);
        assertEquals("Used column", grid.gridInsert(1, 5));
    }

    @Test //Test input into grid
    public void testgridInsert3()
    {
        Grid grid = new Grid();
        assertEquals("Success", grid.gridInsert(1, 5));
    }

}


