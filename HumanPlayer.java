package TicTacToe_game;

import java.util.Scanner;

public class HumanPlayer extends Player{
	public HumanPlayer(String player, char mark) {
		this.player=player;
		this.mark=mark;
	}
	void makeMove() {
		Scanner sc=new Scanner(System.in);
		int row;
		int col;
		do {
			System.out.println("Enter row: ");
			row=sc.nextInt();
			System.out.println("Enter column: ");
			col=sc.nextInt();
		}
		while(!isValidMove(row, col));
		TicTacToe.placeMark(row, col, mark);
	}
}