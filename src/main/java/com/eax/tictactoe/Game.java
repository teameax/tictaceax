package com.eax.tictactoe;

public class Game {

	private static Grid grid;
	private static Player player1;
	private static Player player2;
	private static int currentPlayer;
	
	//Initialize the game
	public Game() {
		this.grid = new Grid();
		this.player1 = new HumanPlayer(1);
		this.player2 = new HumanPlayer(2);
		this.currentPlayer = 1;
	}
	
	//Return wich player is playing
	public static int getCurrentPlayer() {
		return currentPlayer;
	}

	//adds marker where the player has clicked
	public static int addMarker(Integer gridNumber) {
		int status = grid.gridInsert(currentPlayer, gridNumber);
		if(status == -1) {
			return 0;
		}
		if(checkWinner(grid.getGrid()) != 0) {
			return checkWinner(grid.getGrid());
		}
		else if(isTie(grid.getGrid()))
		{
			return 3;
		}
		//changes current player if marker is placed
		changeCurrentPlayer();
		return 0;
	}
	
	private static int checkWinner(int[] arr) {
		//checks horizontal and vertical wins
		for(int i = 0; i < 3; i++){
			if ((arr[i * 3] != 0 && arr[(i * 3)] == arr[(i * 3) + 1] && 
				arr[(i * 3)] == arr[(i * 3) + 2]) ||
			   (arr[i] != 0 && arr[i] == arr[i + 3] &&
				arr[i] == arr[i + 6])) {

				return currentPlayer;
			}
		}
		//checks diagonal win
		if((arr[0] != 0 && arr[0] == arr[4] && arr[0] == arr[8]) ||
		   (arr[2] != 0 && arr[2] == arr[4] && arr[2] == arr[6])) {
			return currentPlayer;
		}
		return 0;
	}

	private static void changeCurrentPlayer() {
		if(currentPlayer == 1) {
			currentPlayer = 2;
		}
		else {
			currentPlayer = 1;
		}
	}

     	//checks for ties
	private static boolean isTie(int[] arr) {
		for(int i = 0; i < 9; i++) {
			if(arr[i] == 0) {
				return false;
			}
		}
		return true;
	}

}
