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

## Week 2: Computer Science 1

### Review Problems

---

1. What is wrong with the following command:

```
javac Program1
```

and the following Java statement:

```
System.out.println[2 + 2]
```

2. What is wrong with the following statement:

```java
Class Problem2
{
    public static void Main(String args)
    {
        system.out.println("C1h9"); }
    }
}
```

---

4. Compile the following program to verify it has four syntax errors. For each error, what is the error message produced by the compiler?

```java
clas s C1h10
{
    public static void main(String[] args)
    {
        System.out.println("Good
        bye");
        System.out.println("Go od by e"); System.out.println("all done);"
    )
}
```

5. Write the Java statements that declares int variables i, j, k and initializes j to 50. Give an assignment statement that decreases the value in j by 10, regardless of its current value.

---

6. Run a program that contains the following two statements:

```java
System.out.println("2" + 3 + 4);
System.out.println("2" + (3 + 4));
```

Why do these statements display different strings?

7. Run the following program. What it displayed?

```java
class Test
{
    public static void main(String[] args)
    {
        System.out.println("1"); /*
        System.out.println("2");
        System.out.println("3"); */
        System.out.println("4");
    }
}
```

---

8. Write a program that assigns 1.5, 22.4, -44.8, 0.333, and 1.123 to the variables a, b, c, d, and e, respectively. Next, compute their sum. Assign the result to a variable named sum. Next, compute the average of the values in these variables. Assign the result to a variable named average. Display the values in sum and average with appropriate labels.

9. What happens when you compile the following program:

```java
class Test
{
    public static void main(String[] args)
    {
        int switch;
        switch = 3;
    }
}
```

What is wrong with the variable switch?

---

10. What is printed by the following program? Work through the program step by step to determine the value of the variable d. Then run the code.

```java
class Test
{
    public static void main(String[] args)
    {
        int x = 1;
        double y = 2.5;
        boolean b;

        b = (x > y);
        b = !b;

        boolean c = b && (x < y);

        boolean d = c || (x > y);

        System.out.println(d);
    }
}
```

---

11. Write a program that converts a temperature from Fahrenheit to Celsius and prints the result.

The formula to convert Fahrenheit to Celsius is C = (F - 32) \* 5/9, where:

- C is the temperature in Celsius
- F is the temperature in Fahrenheit

For example, if the temperature in Fahrenheit (F) is 68 degrees, the program should calculate the equivalent temperature in Celsius (C) and print it. Both values should be printed with one decimal place.
