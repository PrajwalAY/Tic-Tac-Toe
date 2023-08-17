package TicTacToe_game;

public abstract class Player {
	//cp is human type and for AI p2 is AIPlayer type so we need to make parent type
	// which inherit property from parent type and we can assign child object to parent reference
	String player;
	char mark;
	abstract void makeMove();
	boolean isValidMove(int row,int col) {
		if(row>=1 && row<=3 &&
				col>=1 && col<=3) {
			if(TicTacToe.board[row-1][col-1]==' ') {
				return true;
			}
		}
		return false;
	}
}