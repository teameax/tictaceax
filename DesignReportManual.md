##Design Report

The goal of the programming part of the project is to make additional independent classes to develop loosely coupled code.

Game.java:
+ The java class Game.java handles the game and the players.
+ Mark the column selected by the player
+ Checks if invalid arguments are inputted
- Checks if there is a winner of the game
- Checks if there is a tie
+ Keeps track of players move
+ Switch players after players turn

Grid.java

* Initializes the board and keeps track of it
* Mark column by player move

Player.java
* Keeps track of each player
* Keeps track of:
	* The symbol of each player
	* Checks if there is a winner
	* Marks player as winner if he has won

Humanplayer.java

* Implements the player, each player has identical version of the class
* Stores the identical symbol of each player
* Stores if the player has won
* Set player as winner if he has won

			 ..............
			|			   |
			|  TicTacToe   |
			|  Controller  |
			|..............|
					|
					|
			 ..............
			|			   |
			|   Game.java  |
			|              |
			|..............|
					|
		 ...........|............
		|						|
		|						|
 ..............			 ...............			
|			   |		|				|
|   Game.java  |		|	Player.java |
|              |		|               |
|..............|		|...............|
								|
								|
						 ..................
						|			       |
						| HumanPlayer.java |
						|              	   |
						|..................|