import java.util.Scanner;

public class InClass {
    public static void main(String[] args) {
    
        int[][] board = {{0,0,0},{0,0,0},{0,0,0}};

        while(true){
            printBoard(board);
            int[] move = getMove();
            setElement(board,move[0],move[1],move[2]);
            if(gameOver(board)){
                printBoard(board);
                System.out.println("Game Over! Player " + move[2] + " has won!");
                break;
            }

        }   
    }

    public static boolean gameOver(int[][] board){

        //Check Rows
        for(int i = 0; i < board.length; i++){
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '*'){
                return true;
            }
        }
        //Check Columns
        for(int i = 0; i < board.length; i++){
            if(board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != 0){
                return true;
            }
        }
        //Check Diagonals
        //top-left to bottom-right
         if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != 0){
                return true;
            }
        //top-right to bottom-left
         if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != 0){
                return true;
            }

        return false;

    }

    public static int[] getMove(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the row, column, and value");
        int row = input.nextInt();
        int column = input.nextInt();
        int value = input.nextInt();
        int[] move = {row, column, value};
        return move;
    }

    public static void setElement(int[][] board, int row, int column, int value){
        board[row][column] = value;
    }

    public static void printBoard(int[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

    }

}