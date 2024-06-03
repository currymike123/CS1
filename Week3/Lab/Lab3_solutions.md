# Lab 3

**Notes**

- Type all the programs from scratch. Do not copy and paste. It will help you to learn the syntax.
- If your program doesn't work on the first try don't worry. Debugging is a skill that you will develop over time.
- Remember to save and recompile every time you make a change to your program.
- If you get errors when you compile, go back and make sure you typed everything correctly. Proper capitalization, spelling, matching {}, etc.
- If you get stuck, ask your TA for help. That's what they are here for!

**Problems - All of your programs should use Variables!**

1. Write a program the finds the area of a circle. The radius is 4.5 inches. You can use the value of 3.14159 for π. Save all your values in variables and display your result using a print statement. The formula is:

- area = π \* radius \*radius

```java
class CircleArea
{
    public static void main(String[] args)
    {
        double radius = 4.5;
        double pi = 3.14159;
        double area = pi * radius * radius;

        System.out.println("The area of the circle is " + area);
    }
}
```

2. Modify the program to find the circumference of the circle. The formula is:

- circumference = 2 \* π \* radius

```java
class CircleCircumference
{
    public static void main(String[] args)
    {
        double radius = 4.5;
        double pi = 3.14159;
        double circumference = 2 * pi * radius;

        System.out.println("The circumference of the circle is " + circumference);
    }
}
```

3. Write a program that converts feet to meters. One foot is 0.305 meters. Save all your values in variables and display your result using a print statement.

```java
class FeetToMeters
{
    public static void main(String[] args)
    {
        double feet = 5;
        double meters = feet * 0.305;

        System.out.println(feet + " feet is equal to " + meters + " meters");
    }
}
```

4. Given the integer 512, write a program that finds if it is less than a number of your choosing. Save the result in a boolean variable and then print the result. Do not use if/else statements for this problem. Just print the result of the comparison.

```java

class CompareNumbers
{
    public static void main(String[] args)
    {
        int num = 512;
        boolean b = num < 1000;
        System.out.println("Is " + num + " less than 1000? " + b);
    }
}
```

5. Write a program that saves a character in a variable and then converts it to it's ascii value. Print the result.

```java
class CharToAscii
{
    public static void main(String[] args)
    {
        char c = 'A';
        int ascii = (int) c;

        System.out.println("The ASCII value of " + c + " is " + ascii);
    }
}
```

6. Practice converting between different data types. Write a program that saves a double in a variable and then casts it to an int. Print the result. Explore other data type conversions as well.

```java

class TypeConversion
{
    public static void main(String[] args)
    {
        double d = 3.14;
        int i = (int) d;

        System.out.println("The double value " + d + " cast to an int is " + i);
    }
}
```

7. What is printed by the following program? Work through the program step by step to determine the value of the variable d. Then run the code.

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

// true

8. Write a program that converts a temperature from Fahrenheit to Celsius and prints the result.

- The formula to convert Fahrenheit to Celsius is C = (F - 32) \* 5/9, where:

- C is the temperature in Celsius
- F is the temperature in Fahrenheit

- For example, if the temperature in Fahrenheit (F) is 68 degrees, the program should calculate the equivalent temperature in Celsius (C) and print it. Both values should be printed with one decimal place.

```java
class FahrenheitToCelsius
{
    public static void main(String[] args)
    {
        double fahrenheit = 68;
        double celsius = (fahrenheit - 32) * 5/9;

        System.out.printf("The temperature in Celsius is: %.1f%n", celsius);
    }
}
```

9. A dog is 264 ounces, save this value in a variable. Write a program that determines how many pounds and ounces the dog is. Save the results in variables and print the results.

- Hint: 1 pound = 16 ounces
- Modulus can be helpful.

```java
class OuncesToPounds
{
    public static void main(String[] args)
    {
        int ounces = 264;
        int pounds = ounces / 16;
        int remainingOunces = ounces % 16;

        System.out.println("The dog is " + pounds + " pounds and " + remainingOunces + " ounces");
    }
}
```

10. Write a program that checks if an integer value is equal to, less than, or greater than 100. Save the result in a boolean variable and then print. Use if/else/else if statements for this problem. Run your program a few times with different values to test it.

```java
class CompareNumbers
{
    public static void main(String[] args)
    {
        int num = 512;
        boolean equalTo = num == 100;
        boolean lessThan = num < 100;
        boolean greaterThan = num > 100;

        System.out.println("Is " + num + " equal to 100? " + equalTo);
        System.out.println("Is " + num + " less than 100? " + lessThan);
        System.out.println("Is " + num + " greater than 100? " + greaterThan);
    }
}
```

or

```java
class CompareNumbers
{
    public static void main(String[] args)
    {
        int num = 512;
        if (num == 100)
        {
            System.out.println("The number is equal to 100");
        }
        else if (num < 100)
        {
            System.out.println("The number is less than 100");
        }
        else
        {
            System.out.println("The number is greater than 100");
        }
    }
}
```
