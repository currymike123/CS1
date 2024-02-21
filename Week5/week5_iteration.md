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

## Iteration

---

# Iteration

---

## What is Iteration?

<b>Iteration</b> is the process of repeating a set of instructions a specified number of times or until a specific condition is met. A computer loves to loop! It's one of the things it does best.

---

Let's say you want to print your name 10 times in a row. You could write 10 print statements, but that would be a lot of work. Instead, you could use a loop to repeat the print statement 10 times.

```java
System.out.println("Michael");
System.out.println("Michael");
System.out.println("Michael");
System.out.println("Michael");
System.out.println("Michael");
System.out.println("Michael");
System.out.println("Michael");
System.out.println("Michael");
System.out.println("Michael");
System.out.println("Michael");
```

Or you could write the print statement once and tell the computer to repeat it 5 times.

```java
for (int i = 0; i < 10; i++) {
    System.out.println("Michael");
}
```

---

## The For Loop

---

The <b>for loop</b> is a control structure that allows you to repeat a set of instructions a specified number of times. The for loop has three parts:

```java
for(initialization; condition; update){
    //Code block
}
```

1. The <b>initialization</b> statement: This is where you initialize the loop control variable. The loop control variable is used to keep track of the number of times the loop has executed.

2. The <b>condition</b> statement: This is where you specify the condition that must be true for the loop to continue executing.

3. The <b>update</b> statement: This is where you update the loop control variable. This statement is executed after each iteration of the loop.

---

![width:800px](for_loop.png)

1. <b>Initialization:</b> The loop control variable `i` is initialized to 0.

2. <b>Condition:</b> The condition `i < 10` is checked. If the condition is true, the loop continues executing. If the condition is false, the loop stops executing.

3. <b>Update:</b> The loop control variable `i` is incremented by 1.

---

### Initialization

Loops control variables are often named `i`, `j`, or `k`, but you can name them anything you want. 0 or 1 are common starting values. The initialization statement is only executed once, at the beginning of the loop.

**int i = 0** initializes the loop control variable `i` to 0.

```java
for (int i = 0; i < 10; i++) {
    //Code block
}
```

---

### Condition

The condition statement is evaluated before each iteration of the loop. If the condition is true, the loop continues executing. If the condition is false, the loop stops executing.

**i < 10** is the condition that must be true for the loop to continue executing.

```java
for (int i = 0; i < 10; i++) {
    //Code block
}
```

---

### Update

The update statement is executed after each iteration of the loop. It is used to update the loop control variable. You can increment, decrement, or update the loop control variable in any way you want.

**i++** is shorthand for **i = i + 1**.

```java
for (int i = 0; i < 10; i++) {
    //Code block
}
```

---

What does the following for loop output?

```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

---

Each time the loop iterates, the value of `i` is printed to the console. The loop control variable `i` is initialized to 0. The condition `i < 10` is checked. If the condition is true, the loop continues executing. If the condition is false, the loop stops executing. The loop control variable `i` is incremented by 1 after each iteration of the loop.

We start at `i = 0` until `i = 9`. After `i = 9`, the condition `i < 10` is false, so the loop stops executing.

```bash
0
1
2
3
4
5
6
7
8
9
```

---

Let's at the combination of the for loop and if statement.

```java
for (int num = 0; num < 10; num++) {
    if (num % 2 == 0) {
        System.out.println(num + " is even");
    } else {
        System.out.println(num + " is odd");
    }
}
```

What is the output?

---

```bash
0 is even
1 is odd
2 is even
3 is odd
4 is even
5 is odd
6 is even
7 is odd
8 is even
9 is odd
```

---

Notice you can use any variable name you want as the loop control variable. `num` is used in this example. The loop control variable `num` is initialized to 0. The condition `num < 10` is checked. If the condition is true, the loop continues executing. If the condition is false, the loop stops executing. The loop control variable `num` is incremented by 1 after each iteration of the loop.

```java
for (int i = 0; i < 10; i++) {
    if (i % 2 == 0) {
        System.out.println(i + " is even");
    } else {
        System.out.println(i + " is odd");
    }
}
```
