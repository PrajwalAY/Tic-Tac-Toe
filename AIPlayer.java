package TicTacToe_game;

import java.util.Random;
import java.util.Scanner;

public class AIPlayer extends Player{
	public AIPlayer() {
		this.player="Computer";
		this.mark='O';
	}
	void makeMove() {
		int row;
		int col;
		do {
			Random r=new Random();
			row=r.nextInt(3)+1;
			col=r.nextInt(3)+1;
		}
		while(!isValidMove(row, col));
		TicTacToe.placeMark(row, col, mark);
	}
}