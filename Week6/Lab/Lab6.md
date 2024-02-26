# Lab 6

For 1 through 7, use <b>both</b> a for loop and a while loop. For the rest of the questions, choose whether to use a for or while loop.

1. Print 50 to 10.

2. Print 0 to 100.
   The output is kind of hard to read because it’s so long. Even if you printed one per line or all on one line. Try to print 0 to 100 with 10 numbers per line. Hint: try using
   modulus %

3. Print the alphabet ‘A’ to ‘Z’.

- Hint: You can use char instead of int in your initialization statement.

4. Print the alphabet backwards ‘z’ to ‘a’.

5. Print the sum of the even, positive integers less than 50.

6. Count the numbers divisible by 2 or 7 between 20 to 300 inclusive.

- Remember: OR in Java is ||, AND is &&

7. Count the number of odd numbers between 15 and 75 inclusive.

8. Write a program that displays the following table. Kilograms should
   start from 1 to 199 and be odd.

- 1 kilogram is 2.2 pounds

```bash
Kilograms   Pounds
1              2.2
3              6.6
...
197          433.4
199          437.8
```

9. Write a program to compute the sum of digits of any length integer.
   Use Scanner to obtain the integer from the user.

10. Remember our factorial question from lab 2?<br>
    Factorial represented in mathematics by the symbol ! is the product of 1
    to n. For example:<p><p>
    5! = 1 x 2 x 3 x 4 x 5 = 5 x 4 x 3 x 2 x 1 = 120<p>
    Use a loop to make a program compute n! = 1*2*3\*…n. Use Scanner to
    obtain n from a user.

11. One way pi can be approximated is by the following summation:<p><p>
    Pi = 4∗(1−1/3+1/5−1/7+1/9–1/11+...)<p>
    Write a program to approximate pi using the first 20 terms of the summation above.<p>
    Test your program with 20 terms, 200 terms, 2000 terms, 20000 terms. <p>
    Pi= 3.14159265359<p>
    Notice that the more terms you sum the more accurate the value estimates pi. This is a tricky question. Think about how you can goabout going back and forth to adding and subtraction every loop.
