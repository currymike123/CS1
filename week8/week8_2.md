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

# Week 8: Computer Science 1

## Methods Continued

---

## Methods Continued

---

Let's review the components and structure of a method.

```java
public static returnType methodName(parameters) {
    // code
    return value;
}
```

- `public` is the access modifier
- `static` is the keyword that allows the method to be called without creating an object
- `returnType` is the data type of the value returned by the method
- `methodName` is the name of the method
- `parameters` is the list of parameters that the method accepts
- `return` is the keyword that returns a value from the method

---

Let's create a method that accepts two parameters or type `int` and `String` and returns both values concatenated together.

What return type should we use?

---

```java

public static String concatenate(int number, String word) {
    return number + word;
}

```

- Remember that the return type should match the type of the value that is returned. When we concatenate an `int` and a `String`, the result is a `String`. Therefore, the return type should be `String`.

---

Now create a method (or methods) that accept two numbers and a word. The method should return the sum of the two numbers and print the word the number of times specified by the second number.

What if the number is an `int`? What if the number is a `double`?

---

```java

public static void printWord(int num1, int num2, String word) {
    for (int i = 0; i < num2; i++) {
        System.out.println(word);
    }
    return num1 + num2;
}

public static void printWord(double num1, double num2, String word) {
    for (int i = 0; i < num2; i++) {
        System.out.println(word);
    }
    return num1 + num2;
}

```

This is a good example of <b>method overloading</b>. We have two methods with the same name, but different parameter lists. One method accepts two `int` values and the other accepts two `double` values.

---

You can also create one method that accepts two `double` values and casts `int` values to `double` values.

```java
public static void printWord(double num1, double num2, String word) {
    for (int i = 0; i < num2; i++) {
        System.out.println(word);
    }
    return num1 + num2;
}
```

---
