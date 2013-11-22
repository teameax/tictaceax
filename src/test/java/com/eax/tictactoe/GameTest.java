package com.eax.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GameTest {

	@Test
	public void testWinner() {
		Game g = new Game();

		int a = g.addMarker(0);
		a = g.addMarker(1);
		a = g.addMarker(3);
		a = g.addMarker(7);
		a = g.addMarker(6);

		assertEquals(1, a);
	}

	@Test
	public void testLoser() {
		Game g = new Game();

		int a = g.addMarker(0);
		a = g.addMarker(1);
		a = g.addMarker(4);
		a = g.addMarker(7);
		a = g.addMarker(6);

		assertEquals(0, a);
	}

	@Test
	public void testWinnerAcross() {
		Game g = new Game();

		int a = g.addMarker(5);
		a = g.addMarker(0);
		a = g.addMarker(6);
		a = g.addMarker(4);
		a = g.addMarker(7);
		a = g.addMarker(8);

		assertEquals(2, a);
	}

	@Test
	public void testWinnerAcross2() {
		Game g = new Game();

		int a = g.addMarker(2);
		a = g.addMarker(0);
		a = g.addMarker(4);
		a = g.addMarker(3);
		a = g.addMarker(6);

		assertEquals(1, a);
	}

	@Test 
	public void testTie() {
		Game g = new Game();

		int a = g.addMarker(0);
		a = g.addMarker(1);
		a = g.addMarker(2);
		a = g.addMarker(3);
		a = g.addMarker(5);
		a = g.addMarker(4);
		a = g.addMarker(6);
		a = g.addMarker(8);
		a = g.addMarker(7);

		assertEquals(3, a);

	}

	@Test
	public void testIsTie() {
		Game g = new Game();
		assertEquals(0, g.addMarker(0));
	}

	@Test
	public void testGetCurrentPlayer() {
		Game g = new Game();
		assertEquals(1, g.getCurrentPlayer());
	}


}