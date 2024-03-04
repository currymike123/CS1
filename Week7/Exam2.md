# CPS 210 - Exam 2

Name:

---

<b>
1) (10 pts) The following program will execute without an error.</b>

```java
int sum = 0;
double count = 0;
for(int i = 0; i < 10; i++) {
    sum += i;
    count++;
}
System.out.print("Count:" + count + "Sum:" + sum + "i: " + i);
```

<ol type='a'>

<li> True </li>
<li> False </li>

<hr>

<b>Explain why:</b><br><br>

<hr>

</ol>

<b>2) (10 pts) What is the output of the following program? </b>

```java
double x = 6.0;
int y = 2;
int z = 5;
if(z < 5 && x >= 4) {
    System.out.println("A");
} else if(z/y == 2) {
    System.out.println("B");
} else if(z/y == 2.5){
    System.out.println("C");
} else {
    System.out.println("D");
}
```

<ul>

<li> A </li>
<li> B </li>
<li> C </li>
<li> D </li>

</ul>

<hr>

<b>Explain why:</b><br><br>

<hr>

<b>3) (20 pts) Write a program that asks the user to enter an integer, double, and a word (one word, a space should stop the input). The program should then print out the integer, double, and word in the following format: </b>

```
The integer is: 5
The double is: 3.14
The word is: Hello
```

<br><br><br><br><br><br><br><br><br><br><br><br><br><br>

<b>4) (20 pts) Write a program that asks a user for an integer that is divisible by 5. If the user enters a number that is not divisible by 5, you should keep asking the user for a valid number until they enter one. Once
they enter the valid number, print out the number they entered. Below is a sample run: </b>

```bash
Enter a number that is divisible by 5: 3
Enter a number that is divisible by 5: 7
Enter a number that is divisible by 5: 10
10
```

<div style="page-break-after: always;"></div>

<b>5) (20 pts) Write a program that asks a user for a floating point number. Each time the user enters a number, the program should add the number to a running total. The program should keep asking the user for a number until the user enters a negative number or the total reaches 100. Once the user enters a negative number or the total reaches 100, the program should print out the running total. Below is a sample run: </b>

```bash
//Negative number
Enter a number: 5.4
Enter a number: 10.2
Enter a number: 15.3
Enter a number: -5.4
The total is: 30.9

//Total reaches 100
Enter a number: 5.4
Enter a number: 10.2
Enter a number: 16.1
Enter a number: 68.3
The total is: 100.0
```

<div style="page-break-after: always;"></div>

<b>6) (20 pts) Write a program that asks a user for a positive integer. The program should then print out the number of digits in the number. Below is a sample run: </b>

```bash
Enter a number: 123
The number of digits is: 3

Enter a number: 123456
The number of digits is: 6
```

<b>Hint:
<br> 1) 100/10 = 10
<br> 2) 10/10 = 1
<br> 3) 1/10 = 0(integer division)
<br> 100 has 3 digits
</b>
