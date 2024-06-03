# Lab 4

1. It takes roughly 2580 minutes to drive from California to New York.
   Declare 2580 as an integer. Write a program that converts the
   minutes into hours. Find the remaining minutes as well. Display your
   results.

- Hint: How many minutes are in an hour?

```java
class MinutesToHours
{
    public static void main(String[] args)
    {
        int minutes = 2580;
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        System.out.println("It takes " + hours + " hours and " + remainingMinutes + " minutes to drive from California to New York");
    }
}
```

2. Write a program to convert the time in seconds to —
   days:hours:minutes:seconds

- Ex. Given 313297 seconds, output is 3:15:1:37
- Ex. given 2071403 seconds, output is 23:23:23:23
- Hint: Start by finding days and work down. Check your
  calculations by hand before you start the program. How many
  seconds are in a day, hour, and minute?

```java
class SecondsToTime
{
    public static void main(String[] args)
    {
        int seconds = 313297;
        int days = seconds / 86400;
        int remainingSeconds = seconds % 86400;
        int hours = remainingSeconds / 3600;
        remainingSeconds = remainingSeconds % 3600;
        int minutes = remainingSeconds / 60;
        remainingSeconds = remainingSeconds % 60;

        System.out.println(days + ":" + hours + ":" + minutes + ":" + remainingSeconds);
    }
}
```

3. Write a program that given at least a two digit integer, determines the
   tens place. Display the tens place.

- Ex. Given 123, tens place is 2 Ex. Given 56, tens place is 5

```java
class TensPlace
{
    public static void main(String[] args)
    {
        int number = 123;
        int tensPlace = (number / 10) % 10;

        System.out.println("The tens place of " + number + " is " + tensPlace);
    }
}
```

4. Suppose you have a variable amount, that represents dollars and
   cents in the standard form, for example, 128.85 You need to assign
   dollars to an int variable d, and cents to an int variable, c. Write a
   program to do this.

```java
class DollarsAndCents
{
    public static void main(String[] args)
    {
        double amount = 128.85;
        int dollars = (int) amount;
        int cents = (int) (amount * 100) % 100;

        System.out.println("Dollars: " + dollars + " Cents: " + cents);
    }
}
```

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

// Run the Code!

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

(a)There are three separate if statements. This means that each condition is evaluated independently of the others. If x is less than 5, it will print "x is less than 5". Then, regardless of whether the first condition was true, it checks if x is less than 10, and if so, it prints "x is less than 10". Finally, it does the same for x being less than 15.

(b) There is an if statement followed by else if statements. This structure means that as soon as one of the conditions is met, the corresponding block of code is executed, and the rest of the conditions are skipped. If x is less than 5, it will print "x is less than 5" and then skip the rest of the checks. If x is not less than 5 but is less than 10, it will print "x is less than 10" and skip the remaining checks, and so on.

7.  A car uses 1 gallon of gas for every 25 miles it travels. Write a program that calculates the number of gallons of gas needed for a trip and let's the user know if they can drive the distance. You should have variables for the distance of the trip and the amount of gas in the car. Your program should output the number of gallons needed and if the car can make the trip.

        int distance = 100;
        int gasInCar = 3;
        int gallonsNeeded = distance / 25;
        if (gallonsNeeded <= gasInCar)
        {
            System.out.println("You can make the trip.");
        }
        else
        {
            System.out.println("You cannot make the trip.");
        }

```java
class GasNeeded
{
    public static void main(String[] args)
    {
        int distance = 100;
        int gasInCar = 3;
        int gallonsNeeded = distance / 25;
        if (gallonsNeeded <= gasInCar)
        {
            System.out.println("You need:" + gallonsNeeded + " gallons of gas. You can make the trip.");
        }
        else
        {
            System.out.println("You need:" + gallonsNeeded + " gallons of gas. You cannot make the trip.");
        }
    }
}
```

8. Write a conditional statement that displays the English word for the integer value in the variable x for any value between 0 and 5. For other integer values, your if statement should display other. For example, if x is 2,then your if statement should display two. If x is -20, your if statement should display <b>other</b>.

```java
class NumberToWord
{
    public static void main(String[] args)
    {
        int x = 2;
        if (x == 0)
        {
            System.out.println("zero");
        }
        else if (x == 1)
        {
            System.out.println("one");
        }
        else if (x == 2)
        {
            System.out.println("two");
        }
        else if (x == 3)
        {
            System.out.println("three");
        }
        else if (x == 4)
        {
            System.out.println("four");
        }
        else if (x == 5)
        {
            System.out.println("five");
        }
        else
        {
            System.out.println("other");
        }
    }
}
```
