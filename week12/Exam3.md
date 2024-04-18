# CPS 210 - Exam 3

Name:

---

<b>
1)(10 pts) Will the following code execute without an error? What are the errors?</b>

```java
int[] array = {1,2,3,4,5};

for(int i = 0; i <= 5; i++) {
    array[i] = i + 0.5;
}
```

A) True<br>
B) False<br>

<b>Explain:</b><br><br><br><br><br><br><br><br>

<b> 2)(10 pts) When passing parameters to a method, which of the following are true?
</b>

A) Integers are passed by reference. <br>
B) Doubles are passed by copy. <br>
C) Integer arrays are passed by reference.<br>
D) Double arrays are passed by copy.

<div style="page-break-after: always;"></div>

<b>3) (20 pts) In the `main` method create a double array size 10 and fill it with values. Pass the array as a parameter to a method that finds the minimum value in the array and returns it. </b>

```java

public class Exam3 {
    public static void main(String[] args) {













    }

   __________________________________________(                          ){


















   }
}
```

<div style="page-break-after: always;"></div>

<b>4) What is the output of the following program? </b>

```java
public class Exam3 {
    public static void main(String[] args) {
        int x = 6;
        int y = 2;
        int z = 5;
        double[] position = {x, y, z};

        System.out.println(manipulate(position));
        for(int i = 0; i < position.length; i++) {
            System.out.println(position[i]);
        }
    }

    public static int manipulate(int[] position) {
        position[0] = 5;
        position[1] = 10;
        position[2] = 15;
        return position[0] + position[1] + position[2];
    }

    public static double manipulate(double[] position) {
        position[0] = 10.0;
        position[1] = 20.0;
        position[2] = 30.0;
        return position[0] + position[1] + position[2];
    }
}
```

<b>A) Output (10 pts):</b>
<br><br><br><br>

<b>B) Explain why (10 pts):
<br><br><br><br>

<b>C) Create a method that will print the contents of the `position` array when it is passed as a parameter. (10 pts)</b>
<br><br><br><br><br><br>

<div style="page-break-after: always;"></div>

<b>5) Answer the following questions about the following code:</b>

```java
int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
```

|     |     |     |     |
| --- | --- | --- | --- |
| 1   | 2   | 3   | 4   |
| 5   | 6   | 7   | 8   |
| 9   | 10  | 11  | 12  |
|     |     |     |     |

<b>A) What is the array index of `7`? (10 pts)</b>
<br><br><br><br><br>
<b>B) Write the statements that will print all the values in the array along with their index. (10 pts) </b>

Expected output:

```bash
1: 0 0
2: 0 1
3: 0 2
and so on...
```

<br><br><br><br><br><br><br><br><br><br>
<b>C) Write a method that will return the sum of all the values in the array. (10 pts)</b>
