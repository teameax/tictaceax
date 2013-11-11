package com.eax.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest {

	@Test
	public void testName() {
		assertEquals(2, TicTacToe.name());
	}
}