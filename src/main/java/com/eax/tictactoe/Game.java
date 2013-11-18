package com.eax.tictactoe;

public class Game {

	private static Grid grid;
	private static Player player1;
	private static Player player2;
	private static int currentPlayer;

	public Game() {
		this.grid = new Grid();
		this.player1 = new HumanPlayer(1);
		this.player2 = new HumanPlayer(2);
		this.currentPlayer = 1;
	}

	public static int addMarker(int gridNumber) {
		grid.gridInsert(currentPlayer, gridNumber);

		if(checkWinner(grid.getGrid()) != 0) {
			return checkWinner(grid.getGrid());
		}
		else if(isTie(grid.getGrid()))
		{
			return 3;
		}
		changeCurrentPlayer();
		return 0;
	}

	private static int checkWinner(int[] arr) {
		for(int i = 0; i < 3; i++){
			if ((arr[i * 3] != 0 && arr[(i * 3)] == arr[(i * 3) + 1] && 
				arr[(i * 3)] == arr[(i * 3) + 2]) ||
			   (arr[i] != 0 && arr[i] == arr[i + 3] &&
				arr[i] == arr[i + 6])) {

				return currentPlayer;
			}
			if((arr[0] != 0 && arr[0] == arr[4] && arr[0] == arr[8]) ||
				(arr[2] != 0 && arr[2] == arr[4] && arr[2] == arr[6])) {

				return currentPlayer;
			}
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

	private static boolean isTie(int[] arr) {
		for(int i = 0; i < 9; i++) {
			if(arr[i] == 0) {
				return false;
			}
		}
		return true;
	}

}