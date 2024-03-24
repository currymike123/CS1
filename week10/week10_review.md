---
marp: true
author: Michael Curry
style: |
  .columns {
      display: grid;
      grid-template-columns: repeat(2, minmax(0, 1fr));
      gap: 1rem;
  }

  .small_table {

    transform: scaleY(0.9);

  }

  .boxed {
        color: black;
        border: 1px solid black;
        margin: 0px auto;
        padding: 5px;
        border-radius: 5px;
      }
---

# Week 10: Computer Science 1

## Loops, Methods, Arrays Review and Problems

---

Let's work through a few examples to review loops and arrays.

---

One of the best ways to get comfortable with these tools is to walk through the logic of a problem. Or even better a game.

You can break down the rules (or logic) of a game into a series of steps. Each step can be a method or a loop which can create and manipulate data.

---

Let's create the classic game of <b>Rock, Paper, Scissors.</b>

---

The first step is to break down the rules of the game.

1. Two players choose either rock, paper, or scissors.
2. Rock beats scissors.
3. Scissors beats paper.
4. Paper beats rock.

---

Let's convert the rules into code.

First, let's encode the choices into numbers. The computer natively works with numbers so it's easier to compare numbers than strings.

- Rock = 0
- Paper = 1
- Scissors = 2

```java
int rock = 0;
int paper = 1;
int scissors = 2;
```

---

Now, how do we decide who wins?

1. Rock beats scissors.
2. Scissors beats paper.
3. Paper beats rock.

We can use a series of if statements to determine the winner.

---

```java
if (player1 == rock && player2 == scissors) {
    System.out.println("Player 1 wins!");
} else if (player1 == scissors && player2 == paper) {
    System.out.println("Player 1 wins!");
} else if (player1 == paper && player2 == rock) {
    System.out.println("Player 1 wins!");
} else if (player1 == player2) {
    System.out.println("It's a tie!");
} else {
    System.out.println("Player 2 wins!");
}
```

---

Let's convert or code into a method.

```java
public static void determineWinner(int player1, int player2) {
    if (player1 == rock && player2 == scissors) {
        System.out.println("Player 1 wins!");
    } else if (player1 == scissors && player2 == paper) {
        System.out.println("Player 1 wins!");
    } else if (player1 == paper && player2 == rock) {
        System.out.println("Player 1 wins!");
    } else if (player1 == player2) {
        System.out.println("It's a tie!");
    } else {
        System.out.println("Player 2 wins!");
    }
}
```

---

Let's create our main method to test our determineWinner method and prompt two players to enter their choices.

````java

```bash
Player 1, enter your choice (0 = rock, 1 = paper, 2 = scissors): 0
Player 2, enter your choice (0 = rock, 1 = paper, 2 = scissors): 1
Player 2 wins!
````

---

Finally, let's put the full program together.

```java
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        int rounds = 5;

        for (int i = 0; i < rounds; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Player 1, enter your choice (0 = rock, 1 = paper, 2 = scissors): ");
            int player1 = input.nextInt();
            System.out.print("Player 2, enter your choice (0 = rock, 1 = paper, 2 = scissors): ");
            int player2 = input.nextInt();
            determineWinner(player1, player2);
        }
    }

    public static void determineWinner(int player1, int player2) {
        int rock = 0;
        int paper = 1;
        int scissors = 2;
        if (player1 == rock && player2 == scissors) {
            System.out.println("Player 1 wins!");
        } else if (player1 == scissors && player2 == paper) {
            System.out.println("Player 1 wins!");
        } else if (player1 == paper && player2 == rock) {
            System.out.println("Player 1 wins!");
        } else if (player1 == player2) {
            System.out.println("It's a tie!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }
}
```

---

What if we wanted to count how many rounds each player has won?

How can we save the number of wins for each player and then print them after the rounds are over.

---

```java

import java.util.Scanner;

public class InClass {

    public static void main(String[] args) {
        int rounds = 5;
        int player1Wins = 0;
        int player2Wins = 0;

        for (int i = 0; i < rounds; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Player 1, enter your choice (0 = rock, 1 = paper, 2 = scissors): ");
            int player1 = input.nextInt();
            System.out.print("Player 2, enter your choice (0 = rock, 1 = paper, 2 = scissors): ");
            int player2 = input.nextInt();
            int winner = determineWinner(player1, player2);
            if (winner == 1) {
                player1Wins++;
            } else if (winner == 2) {
                player2Wins++;
            }
        }

        System.out.println("Player 1 won " + player1Wins + " rounds.");
        System.out.println("Player 2 won " + player2Wins + " rounds.");
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

}
```

---

Let's create a new game, Hangman.

What are the rules of hangman?

1. A word is chosen at random.
2. The player guesses a letter.
3. If the letter is in the word, the letter is revealed.
4. If the letter is not in the word, the player loses a life.
5. The player has 6 lives to guess the word.

---

How do we get a random number?

Remember the Math.random() method?

```java
int random = (int) (Math.random() * 5);
```

This code generates a random number between 0 and 4.

Let's use this to choose a random word from an array of words.

```java
String[] words = {"apple", "banana", "cherry", "date", "elderberry"};

String word = words[(int) (Math.random() * words.length)];
```

---

Now let's break down the other parts of the code we need.

1. We need to create a char array to store the guessed word.
2. We need to get the player's guess.
3. We need to create a loop to check if the guessed word is correct.
4. If the guessed word is correct, we need to reveal the letter.
5. If the guessed word is incorrect, we need to decrement the number of lives.

Work out the logic in comments first.

Then create a method to play the game. You should start with two methods, your main method and a method to play the game.

I'll get you started and then you can finish the code.

---

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
---
```
