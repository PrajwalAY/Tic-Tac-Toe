package TicTacToe_game;

public class TicTacToe{
	static char [][]board;
	public TicTacToe() {
		board =new char[3][3];
		iniltializeBoard();
	}
	void iniltializeBoard() {
		for(int row =0;row<board.length;row++) {
			for(int col=0;col<board[row].length;col++) {
				board[row][col]=' ';
			}
		}
	}
	static void displayBoard() {
		System.out.println("-------------");
		for(int row =0;row<board.length;row++) {
			System.out.print("| ");
			for(int col=0;col<board[row].length;col++) {
				System.out.print(board[row][col]+" | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}
	static void placeMark(int row,int col,char mark) {
		if(row>=1 && row<=3 && col>=1 && col<=3) {
			board[row-1][col-1]=mark;
		}
		else {
			System.out.println("Invalid move");
		}
	}
	static boolean rowWin() {
		for(int i=0;i<=2;i++) {
			if(board[i][0]!=' ' && board[i][0]==board[i][1] && board[i][1]==board[i][2]) {
				return true;
			}
		}
		return false;
	}
	static boolean colWin() {
		for(int j=0;j<=2;j++) {
			if(board[0][j]!=' ' && board[0][j]==board[1][j] && board[1][j]==board[2][j]) {
				return true;
			}
		}
		return false;
	}
	static boolean diagWin() {
		if(board[0][0]!=' ' && board[0][0]==board[1][1] && board[1][1]==board[2][2] || 
				board[0][2]!=' ' && board[0][2]==board[1][1] && board[1][1]==board[2][0]) {
			return true;
		}
		return false;
	}
}