package day05;

public class ������ {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
	}
	public boolean checkWon(int[][] board) {
        // write code here
		if (
				(board[0][0] == 1 && board[0][1] == 1 && board[0][2] == 1) ||
				(board[1][0] == 1 && board[1][1] == 1 && board[1][2] == 1) ||
				(board[2][0] == 1 && board[2][1] == 1 && board[2][2] == 1) ||
				(board[0][0] == 1 && board[1][0] == 1 && board[2][0] == 1) ||
				(board[0][1] == 1 && board[1][1] == 1 && board[2][1] == 1) ||
				(board[0][2] == 1 && board[1][2] == 1 && board[2][2] == 1) ||
				(board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1) ||
				(board[0][2] == 1 && board[1][1] == 1 && board[2][0] == 1)
				) {
			return true;
		}
		return false;
    }

}
