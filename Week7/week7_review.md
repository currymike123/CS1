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

# Week 6: Computer Science 1

## Review

---

## Topics

- Modulus and division (integer & floating point) in Java.
- Conditional Statements. if, else if, and else statements.
- Understand how to use conditional statements for various conditions such as checking for divisibility and intervals. Combine multiple conditions using logical operators.
- Scanner class. Understand how to use to read in integers, doubles and Strings.
- for loops (using them for printing statements, finding sum, counts, etc.)
- while loops (using them for printing statements, finding sum, counts, etc.)
- Understand scope of a variable within for and while loops.
- Know how to utilize while loops for input validation.
- Create programs combining loops, conditional statements, and Scanner class.

---

## Modulus and Division

- Modulus is the remainder of a division operation.

```java
int a = 10;
int b = 3;
int c = a % b;
System.out.println(c); // prints 1
```

- Division can be done with integers or floating point numbers.

```java
int a = 10;
int b = 3;
int c = a / b;
System.out.println(c); // prints 3
```

```java
double a = 10;
double b = 3;
double c = a / b;
System.out.println(c); // prints 3.3333333333333335
```

---

## Conditional Statements

- if, else if, and else statements.
- Check various conditions such divisibility and intervals.

```java
int a = 10;
if (a % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

```java
int a = 10;
if (a > 0) {
    System.out.println("Positive");
} else if (a < 0) {
    System.out.println("Negative");
} else {
    System.out.println("Zero");
}
```

---

## Logical Operators

- Combine multiple conditions using logical operators.

```java
int a = 10;
if (a > 0 && a % 2 == 0) {
    System.out.println("Positive and Even");
}
```

```java
int a = 10;
if (a > 0 || a % 2 == 0) {
    System.out.println("Positive or Even");
}
```

---

## Scanner Class

- Read in integers, doubles and Strings.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        String c = scanner.nextLine();
    }
}
```

- Know the difference between `nextInt()`, `nextDouble()`,`next()`, `nextLine()`, and `next().charAt(0)` and when to use them.

- How to use the same scanner object to read in different types of data.

---

## For Loops

- Using them for printing statements, finding sum, counts, etc.

```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

```java
int sum = 0;
for (int i = 0; i < 10; i++) {
    sum += i;
}
System.out.println(sum);
```

- Know the parts of the for loop, when they are executed, and how to use them in a program.

---

## While Loops

- Using them for printing statements, finding sum, counts, etc.

```java
int i = 0;
while (i < 10) {
    System.out.println(i);
    i++;
}
```

```java
int sum = 0;
int i = 0;
while (i < 10) {
    sum += i;
    i++;
}
System.out.println(sum);
```

- Know the parts of the while loop, when they are executed, and how to use them in a program.

---

## Scope of a Variable

- Understand scope of a variable within for and while loops.

```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
System.out.println(i); // Error
```

- What is the scope of a variable declared in a for loop?

```java
int i = 0;
while (i < 10) {
    System.out.println(i);
    i++;
}
System.out.println(i); // prints 10
```

- What is the scope of the counting variable declared for a while loop?

---

## Input Validation

- Utilize while loops for input validation.

```java
Scanner scanner = new Scanner(System.in);
int a = scanner.nextInt();
while (a < 0) {
    System.out.println("Enter a positive number");
    a = scanner.nextInt();
}
```

- The user is prompted to enter a positive number until they do so.

---

## Combining Loops, Conditional Statements, and Scanner Class

- Create programs combining loops, conditional statements, and Scanner class.

```java
Scanner scanner = new Scanner(System.in);
int a = scanner.nextInt();
int sum = 0;
while (a != 0) {
    sum += a;
    a = scanner.nextInt();
}
System.out.println(sum);
```

- The user is prompted to enter numbers until they enter 0. The sum of the numbers is then printed.

---

## Test Specifics

- The test will be given with pen and paper.
- It will be a mixture of multiple choice, short answer, and coding problems. Similar to the first test.
- No computers are allowed during the test.
- You are allowed one piece of paper with handwritten notes on one side! I will be checking during the test.
- I will provide extra paper if needed. If any answers are written on the paper they must be attached to your exam and a note given in the place of the answer directing me to the attached paper.
