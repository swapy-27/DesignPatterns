package TicTacToe;

public class Game {

    private String[][] matrix;
    Player playerOne;
    Player playerTwo;

    Game(String  playerOne,String playerTwo ){
        this.matrix=new String[3][3];
        this.playerOne= new Player(playerOne,"X");
        this.playerTwo= new Player(playerTwo,"O");
        }
    public void printCurrentState() {

        for(int i =0 ; i<3 ; i++){
            for(int j =0 ; j<3 ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public boolean validMove(String val , int r , int c ){

    }



    }




