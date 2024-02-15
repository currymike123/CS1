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

# Week 4: Computer Science 1

## Input / Output

---

# Input / Output

---

So far, we have been hard coding our data into our programs. While this is useful for learning, it is not practical for real world applications. We need to be able to read data from the user and then process that data.

Java has a <b>class</b> called <b>Scanner</b> that allows us to read data from the user.

---

### Class

Before we examine the Scanner let's look at what a class is broadly.

A <b>class</b> is a container for methods and variables. Two structures we have already seen. From this container, we can create objects. An <b>object</b> is an instance of a class. An object functions similar to a variable but has the added functionality of being able to call methods.

Every program we have written so far has been a class and contained classes.

---

Java has core classes that are part of the language. These classes are part of the <b>java.lang</b> package. We have been using the <b>String</b> class and the <b>System</b> class. The <b>Scanner</b> class is part of the <b>java.util</b> package. We need to import the <b>Scanner</b> class to use it.

```java
import java.util.Scanner;
```

---

Once we have imported the <b>Scanner</b> class we can create an object of the <b>Scanner</b> class. We can then use the object to read data from the user.

```java
Scanner input = new Scanner(System.in);
```

Notice the capital S in Scanner, remember classes start with a capital letter.

Just like a variable your object name starts with a lower case letter. In this case I used the name <b>input</b> but you can use any name you want.

---

```java
Scanner input = new Scanner(System.in);
```

- <b>Scanner</b> is the class name
- <b>input</b> is the object name
- <b>new</b> is the keyword that creates the object
- <b>Scanner(System.in)</b> is the constructor that creates or initializes the object.
- <b>System.in</b> is the input stream that the Scanner will read from. It tells the compiler to read from the keyboard.

The creation of an object is also called <b>instantiation</b>.

---

Now that we have created a <b>Scanner</b> object we can use it to read data from the user. The <b>Scanner</b> class has methods that allow us to read different types of data. Here is a list of some of the methods:

- <b>next()</b> - reads a "word"
- <b>nextInt()</b> - reads the next integer
- <b>nextDouble()</b> - reads the next double
- <b>nextLine()</b> - reads the next line of text
- <b>next().charAt(0)</b> - reads a character or the first character of a word.

---

```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Read an integer from the user
        int number = input.nextInt();

    }
}
```

In this example we create a <b>Scanner</b> object called <b>input</b>. We then use the <b>nextInt()</b> method to read an integer from the user. We store the integer in the variable <b>i</b>. Notice the `.` operator. We use the `.` operator to call a method on an object.

---

This example is missing something. Can you guess what it is?

We need to prompt the user to enter a number. We can do this by using the <b>print()</b> or <b>println()</b> method from the <b>System</b> class.

We are always missing our output. Once we read in the number we should output some data to the user. In this case we will just output the number they entered.

```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println("You entered " + number);
    }
}
```

---

We can also use the <b>nextDouble()</b> method.

```java
import java.util.Scanner;

plublic class InputExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = input.nextDouble();
        System.out.println("You entered " + number);
    }
}
```

---

Along with reading numbers we can also read text. We can use the <b>next()</b> method to read a word, the <b>nextLine()</b> method to read a line of text, and the <b>next().charAt(0)</b> method to read a character.

---

Here is an example of how to use the <b>Scanner</b> class to prompt the user, read data, and then output the data.

```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String name = input.next();
        System.out.println("Hello " + name);
    }
}
```

The <b>next()</b> method reads a word. It reads until it encounters a space. So if the user enters "John Smith" the <b>next()</b> method will only read "John".

---

The <b>nextLine()</b> method reads a line of text. It reads until it encounters a newline character.

```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first and last name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name);
    }
}
```

---

The <b>next().charAt(0)</b> method reads a character. It reads the first character of the word.

```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first initial: ");
        char initial = input.next().charAt(0);
        System.out.println("Your initial is " + initial);
    }
}
```

Notice that we call the <b>next()</b> method and then call the <b>charAt(0)</b> method on the result of the <b>next()</b> method. There is no nextChar() method. We will talk more about charAt(0) in the arrays section of the course.

---

Here is an example of how to use the <b>Scanner</b> class to prompt the user, read multiple types of data, and then output the data.

```java

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {

 // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their first name
        System.out.print("Enter an integer, double, and a word: ");

        // Read an integer, double, and a word from the user
        int i = input.nextInt();
        double d = input.nextDouble();
        String s = input.next();

        // Output the data
        System.out.println("You entered: " + i + " " + d + " " + s);

        // Use the Scanner again to read another integer
        System.out.print("Enter another integer: ");
        int i2 = input.nextInt();
        System.out.println("You entered: " + i2);
    }
}
```

---

## Examples

---

Write a program that prompts the user to enter 5 integers. The program should then output the sum and average of the integers.

---

```java
import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter 5 integers
        System.out.print("Enter 5 integers: ");

        // Read 5 integers from the user
        int i1 = input.nextInt();
        int i2 = input.nextInt();
        int i3 = input.nextInt();
        int i4 = input.nextInt();
        int i5 = input.nextInt();

        // Calculate the sum and average
        int sum = i1 + i2 + i3 + i4 + i5;
        double average = sum / 5.0;

        // Output the sum and average
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
    }
}
```

---

Write a program that prompts the user to enter their grade on a test. The program should then output the letter grade. Use the following grading scale:

- 90 - 100: A
- 80 - 89: B
- 70 - 79: C
- 60 - 69: D
- 0 - 59: F

---

```java
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their grade
        System.out.print("Enter your grade: ");

        // Read the grade from the user
        int grade = input.nextInt();

        // Output the letter grade
        if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else if (grade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
```

---

Write a program that prompts the user to enter their first and last name. The program should then output the initials of the first and last name.

---

```java
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their first and last name
        System.out.print("Enter your first and last name: ");

        // Read the first and last name from the user
        String first = input.next();
        String last = input.next();

        // Output the initials
        System.out.println("Your initials are " + first.charAt(0) + last.charAt(0));
    }
}
```

Notice how you can use `charAt(0)` to get the first character of a string. It works the same way as `next().charAt(0)`. Except we are calling `charAt(0)` on a stored string instead of the result of `next()`.
