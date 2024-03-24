### CPS 210 - Lab Quiz 5

Name:

---

1. (3 points) You are given the following method:

```java
public static void printWord(int n, String word) {
    for (int i = 0; i < n; i++) {
        System.out.print(word);
    }
    System.out.println();
}
```

- Write a line of code that will call the method to print the word "hello" 5 times.
  <br><br><br><br><br><br><br>

2. (5 points) Write a method called `average` that takes two integers as parameters and returns the average of the two numbers.
   <br><br><br><br><br><br><br><br><br>
   <div style="page-break-after: always;"></div>

3. (2 points) Will Java allow you to have both of these methods in my program?

```java
public static void printWord(int n, String word) {
    for (int i = 0; i < n; i++) {
        System.out.print(word);
    }
    System.out.println();
}

public static String printWord(int n, String word, String word2) {
    for (int i = 0; i < n; i++) {
        System.out.print(word);
    }
    System.out.println();
    return word2;
}
```

- True
- False
