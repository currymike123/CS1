
import java.util.Scanner;

public class RPS {

public static void main(String[] args) {

        int[] wins = new int[3];

        for (int i = 0; i < 5; i++) {
            int player1 = getPlayerChoice("Player 1: ");
            int player2 = getPlayerChoice("Player 2: ");
            int result = determineWinner(player1, player2);
            updateWins(wins, result);
        }

        System.out.println("Player 1 wins: " + wins[1]);
        System.out.println("Player 2 wins: " + wins[2]);
        System.out.println("Ties: " + wins[0]);

    }

    public static void updateWins(int[] wins, int winner){
        wins[winner]++;
    }

    public static int determineWinner(int player1, int player2) {
        int rock = 0;
        int paper = 1;
        int scissors = 2;
        if (player1 == rock && player2 == scissors) {
            System.out.println("Player 1 wins!");
            return 1;
        } else if (player1 == scissors && player2 == paper) {
            System.out.println("Player 1 wins!");
            return 1;
        } else if (player1 == paper && player2 == rock) {
            System.out.println("Player 1 wins!");
            return 1;
        } else if (player1 == player2) {
            System.out.println("It's a tie!");
            return 0;
        } else {
            System.out.println("Player 2 wins!");
            return 2;
        }
    }

    public static int getPlayerChoice(String player) {
        Scanner input = new Scanner(System.in);
        System.out.print(player + ", enter your choice (0 = rock, 1 = paper, 2 = scissors): ");
        return input.nextInt();
    }
}