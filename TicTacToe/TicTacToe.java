package TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        for(int row=0;row<board.length;row++){
            for (int col = 0; col < board.length; col++) {
                board[row][col] = ' ';
            }
        }

        char player = 'X';
        boolean over = false;

        Scanner sc = new Scanner(System.in);
        while(!over){
            printBoard(board);
            System.out.print("Player "+ player+ " enter your move: ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if(validMove(board,row,col)){
                board[row][col] = player;
                over = win(board,player);

                if(over){
                    printBoard(board);
                    System.out.println("Player "+player+" has won! Congratulations");

                    System.out.print("Play Again? (Y or N) : ");
                    char playAgain = (sc.next().charAt(0));

                    if(Character.toLowerCase(playAgain)=='y'){
                        main(null);
                    }

                    else return;
                }
                else{
                    player = player=='X' ? 'O':'X';
                }
            }
            else{
                System.out.println("Invalid Move!!! Try Again");
            }
        }

    }

    public static boolean win(char[][] board, char player){

        // Row
        for(int row=0;row<board.length;row++){
            if(board[row][0]==player && board[row][1]==player && board[row][2]==player){
                return true;
            }
        }

        // Column
        for(int col=0;col<board.length;col++){
            if(board[0][col]==player && board[1][col]==player && board[2][col]==player){
                return true;
            }
        }

        //Diagonal
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }
        if(board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }

        return false;
    }

    public static boolean validMove(char[][] board, int row, int col){
        if(board[row][col]==' ' && row < board.length && col< board[0].length){
            return true;
        }

        return false;
    }

    public static void printBoard(char[][] board){
        System.out.println("    0   1   2");
        for(int row=0;row<board.length;row++){
            System.out.print(row);
            for (int col = 0; col < board.length; col++) {
                System.out.print(" | " + board[row][col]);
            }
            System.out.println(" |");

        }
    }


}
