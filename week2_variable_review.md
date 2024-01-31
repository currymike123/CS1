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

# Week 2: Computer Science 1

## Programming with variables & casting.

---

Write a program called 'Area.java' which will save the width and height of a rectangle and calculate the area. The width and height will be saved in variables.

Your output should look like this:

```
width: 4.2
height: 5.5
Area of the rectangle is: 23.1
```

---

## Solution

```java
public class Area {
    public static void main(String[] args) {
        double width = 4.2;
        double height = 5.5;
        double area = width * height;
        System.out.println("width: " + width);
        System.out.println("height: " + height);
        System.out.println("Area of the rectangle is: " + area);
    }
}
```

---

Write a program called 'Mph.java' which will save the distance and time of a trip and calculate the average speed. The distance and time will be saved in variables. Time should be saved in minutes and as type integer. Distance should be saved in miles and as type double. Your output should look like this:

```
distance: 100.0
time: 120
Average speed: 50.0
```

---

## Solution

```java
class Mph {
    public static void main(String[] args) {
        double distance = 100.0;
        int time = 120;
        double mph = distance / (time/60);
        System.out.println("distance: " + distance);
        System.out.println("time: " + time);
        System.out.println("Average speed: " + mph);
    }
}
```

---

## Casting Practice

<div class="columns">
<div>
<div class="small_table">

| Type   | Size (bits) |
| ------ | ----------- |
| byte   | 8 bits      |
| short  | 16 bits     |
| int    | 32 bits     |
| float  | 32 bits     |
| double | 64 bits     |

</div>
</div>
<div>

```java
byte b = 20;
short s = 10;
int i = 100;
float f = 10.0f;
double d = 10.0;
```

Which of the following are legal in Java?

```java
i = b;
s = b;
f = b;
d = b;
b = i;
s = i;
f = i;
f = d;
```

</div>

---

## Casting Practice

<div class="columns">
<div>
<div class="small_table">

| Type   | Size (bits) |
| ------ | ----------- |
| byte   | 8 bits      |
| short  | 16 bits     |
| int    | 32 bits     |
| float  | 32 bits     |
| double | 64 bits     |

</div>
</div>
<div>

```java
byte b = 20;
short s = 10;
int i = 100;
float f = 10.0f;
double d = 10.0;
```

Which of the following are legal in Java?

```java
i = b; // legal
s = b; // legal
f = b; // legal
d = b; // legal
b = i; // illegal
s = i; // illegal
f = i; // legal
f = d; // illegal
```

</div>

---

If you are going to assign a larger type to a smaller type, you must use a cast. For example:

```java
int i = 100;
byte b = (byte) i;
println(b); // prints 100.
```

Remember, byte has a range of -128 to 127. So no information is lost in this case.

But if you try to assign a larger number to a smaller type, you will lose information. For example:

```java
int i = 257;
byte b = (byte) i;
println(b); // prints 1
```

---

Why 1? Remember, byte has a range of -128 to 127. So 257 is out of range. The byte will only store the last 8 bits of the number, which is 1.

- 257 in binary is 100000001.
- The last 8 bits are 00000001, which is 1 in decimal.
