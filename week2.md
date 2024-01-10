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
    
  }
---

# Week 2: Computer Science 1

## Variables & Constants

---

## Storing data

---

A computer's memory is like a giant filing cabinet. Each location in memory has a numbered address. The address is like a file folder in the filing cabinet. The address is used to reference the location in memory.

![bg right width:500px](https://cdn.theatlantic.com/thumbor/1hF3jvllnm3XC7YmmAR1279t06U=/0x0:3270x1839/1952x1098/media/img/mt/2021/06/filecomputer/original.jpg)

---

A computer's memory locations are sequential, meaning they are numbered in order. Our programs can reference these locations by their address. The address is like a file folder in the filing cabinet.

### Memory locations

| 1001 | 1002 | 1003 | 1004 | 1005 | ... | ... |
| ---- | ---- | ---- | ---- | ---- | --- | --- |

It would be cumbersome to remember the numbered addresses in memory. Instead, we use named <b>variable</b> to reference memory locations. A variable is like a label on a file folder. The label is used to reference the file folder in the filing cabinet.

---

<b>Variables</b> and <b>constants</b> are used to store information to be referenced by a computer program. They are named locations to reference a computer's memory locations.

- <b>Variables</b> are values that can change.
- <b>Constants</b> are values that do not change. (We will discuss later)

---

Each location in memory can only store a set number of bits usually a byte (8 bits). We can use these bits to represent different values. The number of bits determines the range of values that can be stored in a memory location.

These are the most common bit sizes:

| Bit Size | Range of Values                 | Range of Vales in powers of 2 |
| -------- | ------------------------------- | ----------------------------- |
| 8 bits   | 0 to 255                        | 0 to 2^8                      |
| 16 bits  | 0 to 65,535                     | 0 to 2^16                     |
| 32 bits  | 0 to 4,294,967,295              | 0 to 2^32                     |
| 64 bits  | 0 to 18,446,744,073,709,551,615 | 0 to 2^64                     |

---

Their are many types of information that we want to store in our computers memory. Numbers, letters, words, sentences, and more. Each <b>type</b> of information has a different size and range of values.

To store different <b>types</b> of information, we use different <b>types</b> of variables.

---

## Variable Types

<div class="small_table">

| Type    | Size (bits) | Range of Values                 |
| ------- | ----------- | ------------------------------- |
| byte    | 8 bits      | -128 to 127                     |
| short   | 16 bits     | -32,768 to 32,767               |
| int     | 32 bits     | -2,147,483,648 to 2,147,483,647 |
| float   | 32 bits     | -3.4E38 to 3.4E38               |
| double  | 64 bits     | -1.7E308 to 1.7E308             |
| char    | 8 bits      | 0 to 255                        |
| boolean | 8 bits      | true or false                   |

Note on E notation. 3.4E38 is 3.4 x 10^38

</div>

---

## Whole Numbers

A <b>short</b>, <b>int</b>, and <b>long</b> are all used to store integers.

### 0,1,2,3,4,5,6,7,8,9,10, . . .

<br>
The difference between them is the size of the number they can store. We will mainly use ints in this class.<p>

If you store a value outside the range of the variable type, you will <b>overflow</b> the variable. This means the value will wrap around to the other end of the range. Be careful when using variables near the limits of their range.

---

To create variables we follow the following steps: initialize, declare, and assign.

- <b>Declare</b>: Tell the computer the name and type of the variable.
- <b>Initialize</b>: The first time you assign a value to a variable.
- <b>Assign</b>: Give the variable a value.

```java
// Declare a variable named age of type int
int age;

// Initialize age to the value of 10.
age = 10;

// Assign the value of 20 to age.
age = 20;
```

---

## Decimal Numbers

<b>Float</b> and <b>double</b> are used to store decimal numbers. Just like integers, the difference between them is the size of the number they can store. A double is more precise than a float and we will mainly use doubles in this class.

### 0.0, 0.1, 0.2, 0.3, 0.4, 0.5, . . .

---

## Characters

A <b>char</b> is used to store a single character. A character is a letter, number, or symbol.

### 'A' to 'Z', 'a' to 'z', '0' to '9', '!', '@', '#', '$', '%', '^', '&', '\*', '(', ')', '-', '+', '=', ' '

Use single quotes (' ') to indicate a character.

Remember that computers only can store numbers. To store a character, the computer uses a number to represent the character. The number is called the <b>ASCII</b> code.

---

<b>ASCII</b> (American Standard Code for Information Interchange) is a character encoding standard. ASCII codes represent text in computers. Each character is assigned a number from 0 to 127. The ASCII table is a list of all the characters and their corresponding numbers.

https://www.ascii-code.com/

---

Let's check the numbers for the characters 'A' and 'a' in the ASCII table.

```java
// Let's create a char variable and assign it the value 'A'
char letter = 'A';
System.out.println(letter);
System.out.println((int) letter);

// Let's reassign the variable to the value 'a'
letter = 'a';
System.out.println(letter);
System.out.println((int) letter);
```

---

```java
System.out.println((int) 'A');
```

The (int) is called a <b>cast</b>. It converts the character 'A' to an integer. The output of the above code is 65. The ASCII code for 'A' is 65.

<b>Casting</b> is a way to convert one type of variable to another type. Each one of the variable types has a specific size of memory it uses so only certain types can be cast to other types.

---
