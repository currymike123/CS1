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

# Week 2: Computer Science 1

## Review of Week 1

---

- Why does a computer use the binary number system?
- What is the first step in converting a decimal number to binary?
- What were the two main components of the Hello World program?
- If my file is named `Main.java`, what should the class name be?
- In Java what is the syntax for calling the main method?
- Each statement in Java must end with what?
- How do you compile a Java program?
- How do you run a Java program?

---

- What is the difference between `print` and `println`?
- If you are using `printf`, what does the %C format specifier do?
- Using printf, how do you print a floating point number with 2 decimal places?
- Using `printf`, how do you achieve the following output?

```
Recipe Measurements
-------------------
flour      1.5 cups
sugar     2.75 cups
butter     1.0 cups
```

Notes: The first column is left justified. The second column is right justified. There are 6 spaces between flour and cups.

---

Solution:

```java
System.out.println("Recipe Measurements");
System.out.println("-------------------");
System.out.printf("%-5s%9.1f%5s\n", "flour", 1.5, "cups");
System.out.printf("%-5s%9.2f%5s\n", "sugar", 2.75, "cups");
System.out.printf("%-6s%8.2f%5s\n", "butter", 1.0, "cups");
```
