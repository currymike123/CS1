# Lab 9

1.  Write a program that prompts the user to enter the bill total and the gratuity rate, and then calculates the gratuity and total. The program should then display the gratuity and total. For example:

    ```
    Enter the bill total: 100
    Enter the gratuity rate: 15
    Gratuity: $15.0
    Total: $115.0
    ```

    The program should include a method that takes the bill total and gratuity rate as parameters and returns the gratuity. The program should also include a method that takes the bill total and gratuity rate as parameters and returns the total.

```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the bill total: ");
        double total = scanner.nextDouble();
        System.out.print("Enter the gratuity rate: ");
        double rate = scanner.nextDouble();

        double gratuity = calculateGratuity(total, rate);
        double totalWithGratuity = calculateTotal(total, gratuity);

        System.out.println("Gratuity: $" + gratuity);
        System.out.println("Total: $" + totalWithGratuity);
    }

    public static double calculateGratuity(double total, double rate) {
        return total * rate / 100;
    }

    public static double calculateTotal(double total, double gratuity) {
        return total + gratuity;
    }
}
```

2.  Write a program that prompts a user for 5 integers and saves them to an array. Then pass the array to a method that sums the integers. The program should then display the sum. The method should take an int array as a parameter and return the sum of the numbers.

- Hint: You can use a for loop to iterate through the array and sum the numbers.

```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter an integer: ");
            numbers[i] = scanner.nextInt();
        }

        int sum = sumArray(numbers);
        System.out.println("The sum is: " + sum);
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
```

3.  Now create another method with the same name as the previous method, but this time it should take a double array as a parameter and return the sum of the numbers. (method overloading)

```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a double: ");
            numbers[i] = scanner.nextDouble();
        }

        double sum = sumArray(numbers);
        System.out.println("The sum is: " + sum);
    }

    public static double sumArray(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
```

4.  Create an array of 10 numbers and pass the array as a parameter to a method. In the method use the `Math` class and the `max` method to find the largest number in the array. The method should return the largest number. The program should then print the number from the main method. The method should take both int and double arrays as parameters. (method overloading)

```java

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1};

        int maxInt = findMax(numbers);
        double maxDouble = findMax(doubles);

        System.out.println("The largest number in the int array is: " + maxInt);
        System.out.println("The largest number in the double array is: " + maxDouble);
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double findMax(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
```

5.  Create an array of characters that represents all the vowels in the alphabet. Then write a program that prompts the user for a word and then passes it to a method that counts the number of vowels in the word. The program should then display the number of vowels. The program should include a method that takes a `String` parameter and returns the number of vowels in the `String`. What should the return type of the method be?

- Hint you can find the character at specific position in a String with .charAt() method. For example:

```java
String word = "hello";
char letter = word.charAt(0);
System.out.println(letter); // h
```

- Also, you can use the `length` method to find the length of a `String`. For example:

```java
String word = "hello";
int length = word.length();
System.out.println(length); // 5
```

```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next();

        int count = countVowels(word, vowels);
        System.out.println("The number of vowels in the word is: " + count);
    }

    public static int countVowels(String word, char[] vowels) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            for (int j = 0; j < vowels.length; j++) {
                if (letter == vowels[j]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
```

6. Write a program that prompts the use for a word and then passes it to a method that reverses the word. The program should then display the reversed word. The program should include a method that takes a `String` parameter and returns the reversed `String`. What should the return type of the method be?

- Hint: Use a for loop to iterate through the word and build a new `String` in reverse order. Where should your loop start and end? You'll need to use the hints from the last question.

```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next();

        String reversed = reverseWord(word);
        System.out.println("The reversed word is: " + reversed);
    }

    public static String reverseWord(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }
}
```
