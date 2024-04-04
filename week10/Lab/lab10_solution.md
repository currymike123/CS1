```java

import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "date", "elderberry"};
        playGame(words);
    }

    public static void playGame(String[] words) {
        String word = words[(int) (Math.random() * words.length)];
        char[] guessedWord = new char[word.length()];
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '*';
        }

        Scanner scanner = new Scanner(System.in);
        int guesses = 0;
        while (hasStars(guessedWord) && guesses < 6) {
            System.out.println(guessedWord);
            System.out.println("Guess a letter:");
            char guess = scanner.next().charAt(0);
            boolean correctGuess = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    guessedWord[i] = guess;
                    correctGuess = true;
                }
            }
            if (!correctGuess) {
                guesses++;
            }
        }

        if (hasStars(guessedWord)) {
            System.out.println("Sorry, you didn't guess the word in 6 attempts.");
        } else {
            System.out.println(guessedWord);
            System.out.println("Congratulations, you guessed the word!");
        }
    }

    public static boolean hasStars(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '*') {
                return true;
            }
        }
        return false;
    }
}

```
