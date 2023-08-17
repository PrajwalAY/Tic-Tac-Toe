package TicTacToe_game;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int count=0;
		TicTacToe t=new TicTacToe();
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter player 1 name: ");
		String name1=sc.next();
//		comment name2 input for AI player
//		System.out.print("Enter player 2 name: ");
//		String name2=sc.next();
		TicTacToe.displayBoard();
		
		HumanPlayer p1=new HumanPlayer(name1, 'X');
//		HumanPlayer p2=new HumanPlayer(name2, 'O');
		AIPlayer p2=new AIPlayer();
		
		Player cp;
		cp=p1;
		
		while(true) {
			if(count<9) {
				System.out.println(cp.player +" turn");
				cp.makeMove();
				TicTacToe.displayBoard();
				if(TicTacToe.rowWin() || TicTacToe.colWin() || TicTacToe.diagWin()) {
					System.out.println(cp.player+" has won");
					break;
				}
				else {
					if(cp==p1) {
						//cp is human type and for AI p2 is AIPlayer type so we need to make parent type
						// which inherit property from parent type and we can assign child object to parent reference
						cp=p2;
						count++;
					}
					else {
						cp=p1;
						count++;
					}
				}
			}
			else {
				System.out.println("Match draw");
				break;
			}
		}
	}
}