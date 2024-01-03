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

### Let's create our first Java program!

When programming you have to follow a set of rules called <b>syntax</b>. If you don't follow the syntax rules the program will not run.

Our first Java program will print "Hello World!" to the screen. The most famous program in the world!

```java
System.out.println("Hello World!");
```

Java is case sensitive, so <b>System.out.println</b> is not the same as <b>system.out.println</b>.

---

Java programs need to be formatted in a specific way. For example, you can insert any number of spaces between two <b>tokens</b> (words, numbers, symbols) and the program will still run.

```java
System.out.println(20+3);
System.out.println(20 + 3);
System.out.println(20 +3);
System.out.println(20+ 3);
```

Each one of these will print 23 to the screen.

---
