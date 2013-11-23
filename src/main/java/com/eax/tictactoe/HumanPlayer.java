package com.eax.tictactoe;

public class HumanPlayer implements Player {

	private int playerNumber;
	private boolean isWinner;
	
	//Initializes player
	public HumanPlayer(int number) {
		this.playerNumber = number;
		this.isWinner = false;
	}

	//Stores the number of the player
	public int getPlayerNumber() {
		return playerNumber;
	}
	
	//Stores whether player has won
	public boolean isWinner() {
		return isWinner;
	}

	//toggles winner
	public void setWinner() {
		isWinner = !isWinner;
	}

}
