package TicTacToe.One;

public class Board {

    private String[][] board;
    private int remainingMoves = 9;

    public Board() {
        board = new String[3][3];
    }

    public int getRemainingMoves() {
        return remainingMoves;
    }

    public String[][] getBoard() {
        return board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }

    public boolean validMove(int row, int col) {

        if (board[row][col] != null) {
            return false;
        }

        return true;
    }

    ;
    //X -- -1
    //O -- 1
    public boolean checkWin(int row, int col, User user) {
        //check row
        boolean r = true, c = true , d1 = true , d2 = true;
        for( int i = 0  ; i< 3 ; i++){
            if(board[row][i]!=user.getShape()){
                r=false;
                break;
            }
        }
        //check col
        for( int i = 0  ; i< 3 ; i++){
            if(board[i][col]!=user.getShape()){
                c=false;
                break;
            }
        }
        //check diagOne
        for( int i = 0  ; i< 3 ; i++){
            if(board[i][i]!=user.getShape()){
                d1=false;
                break;
            }
        }
        //check diagTwo
        for( int i = 0  ; i< 3 ; i++){
            if(board[i][2-i]!=user.getShape()){
                d2=false;
                break;
            }
        }

        if(r||c||d1||d2){
            return true;
        }
        return false;
    };
    public boolean isGameOver(){
        if(remainingMoves==0){
            return true;
        }
        return false;
    }
    public void makeMove(int r , int c , User user){
        //
    }

    public void printBoard(){
        System.out.println(board.toString());
    }
}
