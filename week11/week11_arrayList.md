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

# Week 10: Computer Science 1

## ArrayLists

---

## ArrayLists

---

We have been using arrays to store data in our programs. Arrays are a fixed size, which means that once you create an array, you cannot change its size.

In your lab you created an array and then had to add one more item to it. You had to create a new array and copy all the items from the old array to the new array. This is clumbersome and error prone.

Java has a class called `ArrayList` that is part of the `java.util` package. An `ArrayList` is a dynamic array that can grow or shrink in size.

---

Let's review the syntax of an `Array`:

```java
int[] numbers = new int[10];
```

This creates an array of 10 integers. You can access the elements of the array using the index:

```java
numbers[0] = 5;
numbers[1] = 10;
```

---

What if you want to add another element to the array? You would have to create a new array and copy all the elements from the old array to the new array.

```java
int[] newNumbers = new int[11];
for (int i = 0; i < numbers.length; i++) {
    newNumbers[i] = numbers[i];
}
newNumbers[10] = 15;
numbers = newNumbers;
```

This is a lot of code to add one element to an array. There has to be a better way.

---

An `ArrayList` is a dynamic array that can grow or shrink in size. You can add elements to an `ArrayList` without having to create a new array and copy all the elements.

To use an `ArrayList`, you must import the `java.util.ArrayList` class:

```java
import java.util.ArrayList;
```

Now you can create an `ArrayList`:

```java
ArrayList<Integer> numbers = new ArrayList<Integer>();
```

This creates an `ArrayList` of integers.

---
