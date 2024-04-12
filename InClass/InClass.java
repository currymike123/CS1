import java.util.Scanner;

public class InClass {
    public static void main(String[] args) {
    
        int[][] board = {{0,0,0},{0,0,0},{0,0,0}};

        while(true){
            printBoard(board);
            int[] move = getMove();
            setElement(board,move[0],move[1],move[2]);
        }   
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