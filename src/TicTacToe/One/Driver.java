package TicTacToe.One;

import TicTacToe.One.Board;
import TicTacToe.One.User;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Board board = new Board();
        User userOne = new User("Swap","O");
        User userTwo = new User("RJ","X");
        int chance = 1;
       //take input
        // chack valid move
        //make move
        // check win
        //check isGameOver
        Scanner sc = new Scanner(System.in);
        while(true){
            if(board.isGameOver()){
                System.out.println("No more possible moves GameOver");
                board.printBoard();
                break;
            }
            User curr =chance==1? userOne:userTwo;
            System.out.println("input row and col "+ curr.getName());
            System.out.println("enter row");
            int r = sc.nextInt();
            System.out.println("enter col");
            int c = sc.nextInt();

            if(board.validMove(r,c)) {
                String [][] currBoard= board.getBoard();
                currBoard[r][c] = curr.getShape();
                if(board.checkWin(r,c,curr)){
                    System.out.println("Game OVER! Congratulations you win "+ curr.getName());
                    break;
                }


            }else{
                System.out.println("Please make another move : Invalid move");
                continue;
            }


            chance=2;
        }

    }

}
