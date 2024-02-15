# Lab 4

1. It takes roughly 2580 minutes to drive from California to New York.
   Declare 2580 as an integer. Write a program that converts the
   minutes into hours. Find the remaining minutes as well. Display your
   results.

- Hint: How many minutes are in an hour?

2. Write a program to convert the time in seconds to —
   days:hours:minutes:seconds

- Ex. Given 313297 seconds, output is 3:15:1:37
- Ex. given 2071403 seconds, output is 23:23:23:23
- Hint: Start by finding days and work down. Check your
  calculations by hand before you start the program. How many
  seconds are in a day, hour, and minute?

3. Write a program that given at least a two digit integer, determines the
   tens place. Display the tens place.

- Ex. Given 123, tens place is 2 Ex. Given 56, tens place is 5

4. Suppose you have a variable amount, that represents dollars and
   cents in the standard form, for example, 128.85 You need to assign
   dollars to an int variable d, and cents to an int variable, c. Write a
   program to do this.

5. Which of the if statements below is legal? Run a test program to check your answers.

```java

if (count <= 10)
{
}
else
System.out.println("hello");
if (count <= 10)
else
System.out.println("hello");
if (count <= 10)
;
else
System.out.println("hello");

```

- A semicolon by itself is the null statement. It is a legal statement in Java. When executed, it does nothing. Braces that do not contain any statements act like a null statement.

  <div style="page-break-after: always;"></div>

6. Explain the difference between the two code snippets:

a)

```java
if(x<5)
{
    System.out.println("x is less than 5");
}
if(x<10)
{
    System.out.println("x is less than 10");
}
if(x<15)
{
    System.out.println("x is less than 15");
}
```

b)

```java
if(x<5)
{
    System.out.println("x is less than 5");
}
else if(x<10)
{
    System.out.println("x is less than 10");
}
else if(x<15)
{
    System.out.println("x is less than 15");
}
```

7. A car uses 1 gallon of gas for every 25 miles it travels. Write a program
   that calculates the number of gallons of gas needed for a trip and let's the user know if they can drive the distance. You should have variables for the distance of the trip and the amount of gas in the car. Your program should output the number of gallons needed and if the car can make the trip.

8. Write a conditional statement that displays the English word for the integer value in the variable x for any value between 0 and 5. For other integer values, your if statement should display other. For example, if x is 2,then your if statement should display two. If x is -20, your if statement should display <b>other</b>.
