# Lab 9

1.  Write a program that prompts the user to enter the bill total and the gratuity rate, and then calculates the gratuity and total. The program should then display the gratuity and total. For example:

    ```
    Enter the bill total: 100
    Enter the gratuity rate: 15
    Gratuity: $15.0
    Total: $115.0
    ```

    The program should include a method that takes the bill total and gratuity rate as parameters and returns the gratuity. The program should also include a method that takes the bill total and gratuity rate as parameters and returns the total.

2.  Write a program that prompts a user for 5 integers and saves them to an array. Then pass the array to a method that sums the integers. The program should then display the sum. The method should take an int array as a parameter and return the sum of the numbers.

- Hint: You can use a for loop to iterate through the array and sum the numbers.

3.  Now create another method with the same name as the previous method, but this time it should take a double array as a parameter and return the sum of the numbers. (method overloading)

4.  Create an array of 10 numbers and pass the array as a parameter to a method. In the method use the `Math` class and the `max` method to find the largest number in the array. The method should return the largest number. The program should then print the number from the main method. The method should take both int and double arrays as parameters. (method overloading)

5.  Create an array of characters that represents all the vowels in the alphabet. Then write a program that prompts the user for a word and then passes it to a method that counts the number of vowels in the word. The program should then display the number of vowels. The program should include a method that takes a `String` parameter and returns the number of vowels in the `String`. What should the return type of the method be?

- Hint you can find the character at specific position in a String with .charAt() method. For example:

```java
String word = "hello";
char letter = word.charAt(0);
System.out.println(letter); // h
```

<div style="page-break-after: always;"></div>

- Also, you can use the `length` method to find the length of a `String`. For example:

```java
String word = "hello";
int length = word.length();
System.out.println(length); // 5
```

6. Write a program that prompts the use for a word and then passes it to a method that reverses the word. The program should then display the reversed word. The program should include a method that takes a `String` parameter and returns the reversed `String`. What should the return type of the method be?

- Hint: Use a for loop to iterate through the word and build a new `String` in reverse order. Where should your loop start and end? You'll need to use the hints from the last question.
