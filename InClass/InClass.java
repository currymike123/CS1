import java.util.Scanner;

public class InClass {
    public static void main(String[] args) {

        //Array of words
        String[] words = {"apple", "banana", "cherry", "date", "elderberry"};
        //Call the playGame method
        playGame(words);
    }
    public static void playGame(String[] words) {
        //Choose a random word
        String word = words[(int) (Math.random() * words.length)];

        //Create a char array to store the guessed word
        char[] guessedWord = new char[word.length()];

        //Fill the guessed word with stars
        for(int i = 0; i < guessedWord.length; i++){
            guessedWord[i] = '*';
        }

        //Start a scanner for the users input
        Scanner input = new Scanner(System.in);

        //Create a variable to store the number of guesses
        int guesses = 0;

        //Create a loop to play the game
        while(guesses < 6 && hasStars(guessedWord)){
            //Print the guessed word (initially all stars)
            System.out.println(guessedWord);
            //Prompt the user to guess a letter
            System.out.println("Guess a letter:");
            //Get the users guess
            char guess = input.next().charAt(0);
            //Create a boolean to check if the guess is correct
            boolean correctGuess = false;
            //Loop through the word to check if the guess is correct
            for(int i = 0; i < word.length(); i++){
                //If the guess is correct, reveal the letter
                if(word.charAt(i) == guess){
                    guessedWord[i] = guess;
                    //Set correctGuess to true
                    correctGuess = true;
                }
            }
            //If the guess is incorrect, increment the number of guesses
            if(!correctGuess){
                guesses++;
            }
        }
        
        //Check if the user has guessed the word or run out of guesses
        if(hasStars(guessedWord)){
            System.out.println("Sorry you didn't get the word correct");
        }else{
            System.out.println(guessedWord);
            System.out.println("Congrats you guessed the word!");
        }

    }

    //Create a method to check if the guessed word has any stars left
    public static boolean hasStars(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '*') {
                return true;
            }
        }
        return false;
        }
    }