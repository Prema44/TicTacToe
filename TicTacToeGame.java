package tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	
	static char[] board;
	static char player, computer;

	/**
	 * UseCase 1
	 * Function createBoard creates a board 
	 * 
	 **/
	
	public static void createBoard(){
		board = new char[10] ;
		for(int index = 1; index <= 9; index++) {
			board[index] = ' ' ;
		}
	}
}	



