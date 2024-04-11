# Lab 8

1. Create a program with a method that prints your name every time it is called. Hint: This method does not return any values.

```java
public static void printName() {
    System.out.println("Your Name");
}
```

2. Create a program with a method that takes a `String` parameter and prints it. Print the `String` 5 times.

```java
public static void printString(String str) {
    for (int i = 0; i < 5; i++) {
        System.out.println(str);
    }
}
```

3. Create a program that prompts the user for a word, and then passes it to the method in question 2.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        printString(word);
    }

    public static void printString(String str) {
        for (int i = 0; i < 5; i++) {
            System.out.println(str);
        }
    }
}
```

4. Create a program that prompts the user for an integer <b>n</b>, and then passes it to a method that calculates the sum of the first n numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        int sum = sumNumbers(n);
        System.out.println("The sum of the first " + n + " numbers is: " + sum);
    }

    public static int sumNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
```

5. Create a program with a method that calculates the BMI of a person. The method should take two parameters: weight and height.<

- BMI = (weight / (height \* height)) \* 703

- Weight should be in pounds. Height should be in inches.

- The program should prompt the user for weight and height, and then pass these numbers to the method. The program should then display the BMI.

```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight in pounds: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height in inches: ");
        double height = scanner.nextDouble();
        double bmi = calculateBMI(weight, height);
        System.out.println("Your BMI is: " + bmi);
    }

    public static double calculateBMI(double weight, double height) {
        return (weight / (height * height)) * 703;
    }
}
```

6. Create a program with a method that converts the time in seconds to
   days:hours:minutes:seconds.

- Example: input: 313297 seconds output: 3:15:1:37

- Have the return type be a `String` and print the result in the main method.

```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the time in seconds: ");
        int seconds = scanner.nextInt();
        String time = convertTime(seconds);
        System.out.println(time);
    }

    public static String convertTime(int seconds) {
        int days = seconds / 86400;
        int hours = (seconds % 86400) / 3600;
        int minutes = ((seconds % 86400) % 3600) / 60;
        int remainingSeconds = ((seconds % 86400) % 3600) % 60;
        return days + ":" + hours + ":" + minutes + ":" + remainingSeconds;
    }
}
```

7. Create a program with a method that takes the right and left side of a triangle and returns the hypotenuse.

- The pythagorean theorem is: a^2 + b^2 = c^2

- <i>a</i> and <i>b</i> are the sides of the triangle. <i>c</i> is the hypotenuse.

```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the right side of the triangle: ");
        double right = scanner.nextDouble();
        System.out.print("Enter the length of the left side of the triangle: ");
        double left = scanner.nextDouble();
        double hypotenuse = calculateHypotenuse(right, left);
        System.out.println("The hypotenuse of the triangle is: " + hypotenuse);
    }

    public static double calculateHypotenuse(double right, double left) {
        return Math.sqrt(Math.pow(right, 2) + Math.pow(left, 2));
    }
}
```

8. Create a program that asks the user for their first and last name and saves them to two separate variables. Then pass them to a method that combines them into one `String` and returns it. Print the result in the main method.

```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        String fullName = combineNames(firstName, lastName);
        System.out.println("Your full name is: " + fullName);
    }

    public static String combineNames(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
```

9. Create a program that asks the user for a number and then passes it to a method that calculates the factorial of that number.

- Factorial is the product of all positive integers less than or equal to n.

- Example factorial of 5 is 5! = 5 \* 4 \* 3 \* 2 \* 1 = 120

```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int factorial = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    public static int calculateFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
```

10. Create a program that asks the user for a number and then passes it to a method that checks if the number is prime. The method should return a `boolean` value. Print the result in the main method.

```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isPrime = checkPrime(number);
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean checkPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```
