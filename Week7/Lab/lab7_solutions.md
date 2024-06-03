# Lab 7

1. If you had trouble with any problems from Lab 6 review them now. If you have any questions, ask them your TA.

2. Count the number of even integers between 15 and an integer given by a user via Scanner. The integer given by the user must be greater than 15. If the user tries entering a number that is 15 or less, have the user try again until they enter a valid number. Display the count.

```java

import java.util.Scanner;

class EvenIntegers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer greater than 15: ");
        int num = input.nextInt();
        while (num <= 15) {
            System.out.print("Enter an integer greater than 15: ");
            num = input.nextInt();
        }
        int count = 0;
        for (int i = 16; i <= num; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Count = " + count);
    }
}
```

3. Consider the following code:

```java
int count = 0;
int sum = 0;
for(int i = 1; i <= 10; i++) {
    sum += i;
    count++;
}
for(int n = 1; n <= 10; n++) {
    System.out.println(i);
    sum += n;
    count++;
}

```

- Does the code run? If not, why are there errors? If it does run, what is the output? Explain why.

Answer: The code will cause an error. i is not within the scope of the for loop. Control variables in for loops are only accessible within the for loop.

4. Create a program prompts the user for a temperature in Celsius and converts it to Fahrenheit. The formula to convert Celsius to Fahrenheit is: F = (9/5)C + 32. The program should then display the temperature in Fahrenheit. The program should keep asking the user for a temperature in Celsius until the user enters a valid temperature. A valid temperature is a number that is greater than -273.15. If the user enters a number that is less than or equal to -273.15, the program should display an error message and ask the user to try again. Below is a sample run:

```bash
Enter a temperature in Celsius: -300
Error: Temperature must be greater than -273.15
Enter a temperature in Celsius: -273.15
Error: Temperature must be greater than -273.15
Enter a temperature in Celsius: 0
The temperature in Fahrenheit is: 32.0
```

```java

import java.util.Scanner;

class Temperature
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature in Celsius: ");
        double celsius = input.nextDouble();
        while (celsius <= -273.15) {
            System.out.print("Enter a temperature in Celsius: ");
            celsius = input.nextDouble();
        }
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println("The temperature in Fahrenheit is " + fahrenheit);
    }
}
```

5. Declare and initialize a number to a double. Write a program that uses a while loop to print the number and then divide the number by 2. The loop should continue until the number is less than 1. Print the number at the end of the loop.

```java

class DivideByTwo
{
    public static void main(String[] args)
    {
        double number = 10.0;
        while (number >= 1) {
            System.out.println(number);
            number /= 2;
        }
    }
}
```

6. Consider the following code:

```java
int x = 11;
int j = 7;
int y = 3;
int z = j % y;
int a = x % j;
System.out.println(z/a);
```

- This code outputs 0. Why? Change the code so it outputs 0.25.

The code performs integer division and prints 0. To get 0.25 you would need to case one of the variables to a double or use a double as your variable type for either z or a.

7. Study for the exam. Review the previous labs and lecture slides. Look over Lecture 6 and the problems we completed in class. Work on the last problem from week6_problems. Don't look at the answer until you have tried to solve it yourself.

If you have any questions, ask them your TA!
