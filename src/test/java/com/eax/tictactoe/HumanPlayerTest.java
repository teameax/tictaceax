package com.eax.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HumanPlayerTest {

	@Test
	public void testPlayerNumber() {
		Player p = new HumanPlayer(2);
		assertEquals(2, p.getPlayerNumber());
	}

	@Test
	public void testWinner() {
		Player p = new HumanPlayer(2);
		assertEquals(false, p.isWinner());
	}

	@Test 
	public void testSetWinner() {
		Player p = new HumanPlayer(2);
		p.setWinner();
		assertEquals(true,p.isWinner());
	}
}