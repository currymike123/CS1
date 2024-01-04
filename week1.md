---
marp: true
author: Michael Curry
style: |
  .columns {
    display: grid;
    grid-template-columns: repeat(2, minmax(0, 1fr));
    gap: 1rem;
  }
---

# Week 1

## Introduction to Computer Science

---

## What is a computer?

---

A <b>computer</b> is a machine that can be programmed to carry out sequences of arithmetic or logical operations (computation) automatically. (Wikipedia)

---

## What are the components of a computer?

---

- Central Processing Unit (CPU)
  - Arithmetic Logic Unit (ALU): Add, Subtract, Multiply, Divide, Compare
  - Control Unit (CU): Fetch, Decode, Execute
- Memory
  - Random Access Memory (RAM). Main memory of the computer. Where the program and data are stored to be executed by the CPU. Volatile.
  - Hard disk. Secondary memory of the computer. Where the program and data are stored to be executed by the CPU. Non-volatile.
- Input/Output
  - Input: Keyboard, Mouse, Touchscreen, Microphone, Camera, etc.
  - Output: Monitor, Printer, Speakers, etc.

---

![bg right width:600px](https://upload.wikimedia.org/wikipedia/commons/thumb/e/e5/Von_Neumann_Architecture.svg/1920px-Von_Neumann_Architecture.svg.png)

# Von Neumann Architecture

---

## What language does a computer speak?

---

Computers speak in <b>Binary</b> which is a <b>base 2</b> number system. It uses only <b>0 and 1</b> to represent numbers which is easy to represent with electrical circuits, 0 is off and 1 is on.

---

<div class="columns">
<div>

<b>Decimal</b>: Base 10

| Position      | Weight |
| ------------- | ------ |
| Ones          | 10^0   |
| Tens          | 10^1   |
| Hundreds      | 10^2   |
| Thousands     | 10^3   |
| Ten-thousands | 10^4   |

235 = (2 _ 10^2) + (3 _ 10^1) + (5 \* 10^0)
235 = 200 + 30 + 5

</div>
<div>

<b>Binary</b>: Base 2

| Position | Weight |
| -------- | ------ |
| Ones     | 2^0    |
| Twos     | 2^1    |
| Fours    | 2^2    |
| Eights   | 2^3    |
| Sixteens | 2^4    |

7 = (1 _ 2^2) + (1 _ 2^1) + (1 \* 2^0)
7 = 4 + 2 + 1

</div>
</div>

---

# What is Programming?

---

<b>Programming</b> (coding) is the process of creating a set of instructions that tell a computer how to perform a task.

There are multiple programming languages that can be used to create these instructions. Such as Java, Python, JavaScript, C++, C, Assembly, etc.

In this course we are going to use the <b>Java language</b>, a <b>high-level</b> programming language.

---

Different types of programming languages:

- <b>Low-level</b> programming languages are closer to machine language. They are harder to read and write than high-level languages. Examples are Assembly and C.
- <b>High-level</b> programming languages are closer to human language. They are easier to read and write than low-level languages. Examples are Java, Python, C++, JavaScript, etc.

---

### Write out first line of code!

When programming you have to follow a set of rules called <b>syntax</b>. If you don't follow the syntax rules the program will not run.

Our first Java program will print "Hello World!" to the screen. The most famous program in the world!

```java
System.out.println("Hello World!");
```

There you go, you just wrote your first line of code!

Java is case sensitive, so <b>System.out.println</b> is not the same as <b>system.out.println</b>.

Notice the semicolon at the end of the line. This is required at the end of every statement in Java.

---

Java code needs to be formatted in a specific way. For example, you can insert any number of spaces between two <b>tokens</b> (words, numbers, symbols) and the program will still run.

```java
System.out.println(20+3);
System.out.println(20 + 3);
System.out.println(20 +3);
System.out.println(20+ 3);
```

Each one of these will print 23 to the screen.

You may not insert spaces in the middle of a token.

```java
System.ou t.pri ntln(2 0+3);
```

System, out, println, 20, and 3 are all separate tokens.

---

### Structure of a Java Program

---

Let's combine what we have learned so far to write a program that prints "Hello World!" to the screen.

Java programs are made up of <b>classes</b>. A class is a template for creating objects and the basic unit in a Java Program. We will learn more about objects later in the course.

```java
class class name
{
    .
    .
    .
}
```

---

Within the class we have <b>methods</b>. A method is a named sequence of Java statements.

```java
method header
{
    statements
    .
    .
}
```

The <b>header</b> of a method contains the method name and any parameters that are passed to the method. We will learn more about parameters later in the course.

The <b>body</b> of a method contains the statements that are executed when the method is called.

Each line of code we have written so far is a statement. All statements must end with a semicolon.

---

The simplest Java program is a single class with a single method.

```java
class clase name
{
    method header
    {
        statements
        .
        .
    }
}
```

---

Let's use this structure to write our first Java program.

```java
class HelloWorld
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
    }
}

```

Let's break down each part of this program.

---

```java
class HelloWorld
```

<b>class</b>: Indicates the beginning of a class.

<b>HelloWord</b>: This is the class name. The class name must match the file name. In this case the file name is HelloWorld.java.

---

```java
{
    public static void main(String[] args)

}
```

<b>{ }</b>: Indicates the beginning and end of the class body.

<b>public</b>: This is the start of the header for the main method. Public means that the method can be accessed from outside the class and is unrestricted.

<b>static</b>: Indicates the we can excute the method without creating an object of the class.
<b>void</b>: Indicates that the method does not return a value.

<b>main</b>: This is the name of the method. The main method is the entry point for all Java programs. The main method is where the program starts executing.

<b>( )</b>: Indicates the beginning and end of the method header.

<b>String[]</b>: This is data type. The square brackets indicate that this is an array of Strings.

<b>args</b>: This is the name of the parameter.

---

```java
{
    System.out.println("Hello World!");
}
```

<b>{ }</b>: Indicates the beginning and end of the method body.

<b>System.out.println</b>: This is a method call. It calls the println method of the out object of the System class.

<b>("Hello World!")</b>: This is the parameter that is passed to the println method. It is a String. We will

---

```java
class HelloWorld
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
    }
}

```

---
