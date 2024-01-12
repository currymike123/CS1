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
    scale: 0.8;
  }

  .boxed {
        color: black;
        border: 1px solid black;
        margin: 0px auto;
        padding: 5px;
        border-radius: 5px;
      }
---

# Week 3: Computer Science 1

## Control Structures

---

## Program Flow

---

Even the simplest programs need to make decisions. <b>Control structures</b> allow us to control the flow of a program and determine which statements are executed and when.

Java uses <b>if statements</b> to control the flow of a program. Their are two versions, the simple <b>if statement</b> and the <b>if-else statement</b>.

Let's review the simple <b>if statement</b> first.

```java
if (condition)
  // statement

if (condition) {
  // statements
}
```

We can read this as "if the condition is true, then execute the statements". The statement is formatted in two ways. The first is for a single statement. The second is for multiple statements (compound statements).

---

```java
if(count <= 10)
  System.out.println("Count is less than or equal to 10");
```

When the statement is executed, the condition is evaluated. If the condition is true, the statements are executed. If the condition is false, the statements are skipped. So as long as count is less than or equal to 10, the statement will be executed.

---

```java
if(count <= 10)
  System.out.println("Count is less than or equal to 10");
System.out.println("End");
```

In this example, the first statement is executed if count is less than or equal to 10. The second statement is executed regardless of the value of count. This is because the second statement is not part of the if statement. It is not indented and is not enclosed in curly braces.

If count is less than or equal to 10 the condition is true, the output will be:

```java
Count is less than or equal to 10
End
```

If count is greater than 10, the condition is false, the output will be:

```java
End
```

---

An <b>if-else statement</b> allows us to execute one set of statements if the condition is true and another set of statements if the condition is false.

```java
if (condition)
  // statements
else
  // statements
```

---

```java
if(count <= 10)
  System.out.println("Count is less than or equal to 10");
else
  System.out.println("Count is greater than 10");
System.out.println("End");
```

If count is less than or equal to 10 the condition is true, the output will be:

```java
Count is less than or equal to 10
End
```

If count is greater than 10, the condition is false, the output will be:

```java
Count is greater than 10
End
```

---

The <b>if</b> and <b>if-else</b> statements do not have to be single statements. They can be <b>compound statements</b> represented by a block of statements enclosed in curly braces.

```java
if (condition) {
  // statements
  // ...
  // ...
}
```

---

```java
if (count <= 10)
{
    System.out.println("incrementing count");
    count++;
}
else
{
    System.out.println("decrementing count");
    count--;
}
System.out.println("End");
```

If count is less than or equal to 10 the condition is true, the output will be:

```java
incrementing count
End
```

If count is greater than 10, the condition is false, the output will be:

```java
decrementing count
End
```

---

Notice the format of the <b>if-else</b> statement. The <b>if</b> and <b>else</b> are aligned. The <b>if</b> and <b>else</b> are indented. The <b>if</b> and <b>else</b> are enclosed in curly braces. The statements in the <b>if</b> and <b>else</b> are indented.

You can use braces to enclose a single statement, but it is not required. It is a good idea to use braces to enclose a single statement. It makes the code easier to read and less prone to errors.

---
