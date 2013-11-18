package com.eax.tictactoe;

public class HumanPlayer implements Player {

	private int playerNumber;
	private boolean isWinner;

	public HumanPlayer(int number) {
		this.playerNumber = number;
		this.isWinner = false;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}

	public boolean isWinner() {
		return isWinner;
	}

	public void setWinner() {
		isWinner = !isWinner;
	}

}