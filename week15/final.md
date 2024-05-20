# CPS 210 - Final

Name:

---

<b> READ ALL THE INSTRUCTIONS BEFORE YOU BEGIN. </b>

You are working at a company that is developing a new software system to manage the inventory of a warehouse. You are are saving the inventory data in a csv file. The csv file is called `inv.csv` and has the following format:

Item,Quantity,Price

```
Apple,10,1.00
Banana,20,0.50
Orange,30,0.75
```

**Note:** The csv file can have any number of items.

You are asked to write a program that reads the csv file and saves the data in an ArrayList(s).

You can store the data in three separate ArrayLists—one for items, one for quantities, and one for prices—or in a single ArrayList. The choice is yours. Make sure to use the appropriate data type for each ArrayList.

Write a method called `printInventory` that prints the contents of the ArrayList(s) in the format above. The method should take the ArrayList(s) as a parameter(s) and return nothing.

Next, you need to write a method called `findQuantity` that takes the name of an item along with ArrayList(s) as parameters. The method should return the quantity of the item or -1 if the item is not found.

In the main method, use `Scanner` to get the name of the item from the user. Pass it to the `findQuantity` method and print the returned value from the main method.

Your console should look like this:

```
Enter the name of the item: Apple
The quantity of Apple is 10
```

Next, you need to calculate the total value of the inventory. The total value of the inventory is calculated by multiplying the quantity of each item by the price of the item and summing the results.

Write a method called `calcValue` that calculates the total value of the inventory. The method should take the ArrayList(s) as a parameter(s) and return the total value of the inventory. Print the total value of the inventory from the main method.

<div style="page-break-after: always;"></div>

Lastly, you need to write the total value of the inventory to a file called `total.txt`. The file should have the following format:

```
Total Value: 42.50
```

**Note:** The total value should not be hardcoded. It should be calculated using the `calcValue` method.

Here is the structure of the Main Method:

Main Method:

1. Read the csv file and save the data in an ArrayList(s).
2. Print the contents of the ArrayList(s) with the `printInventory` method.
3. Prompt and get the name of an item from the user and pass it to the `findQuantity` method. Print the result.
4. Calculate the total value of the inventory with the `calcValue` method.
5. Write the total value of the inventory to a file called `total.txt`.

I have provided a blank template for you to fill in. Your code must be written in the provided template. There is a separate page for each method and a line for your method declaration along with a line for the parameters. Write small enough to fit your code in the template.

Do not change the template and only write your code in the designated areas. You have scrap paper to figure out your solution before you write it in the template.<p> <b>I WILL NOT GRADE ANY CODE WRITTEN OUTSIDE THE TEMPLATE.</b><p><b> THIS MEANS DO NOT SUBMIT ANSWERS ON SCRAP PAPER.</b><p><b>If you have questions about the exam, come to the front of the room and ask me.</b>

<div style="page-break-after: always;"></div>

```java

import java.io.*;
import java.util.*;

public class Inventory {

______________________ main(______________________________)
    {








































    }

```

<div style="page-break-after: always;"></div>

```java

_____________________ printInventory(____________________________________)
    {









































    }
```

<div style="page-break-after: always;"></div>

```java
_____________________ findQuantity(_____________________________________)
    {











































    }

```

<div style="page-break-after: always;"></div>

```java

____________________ calcValue(________________________________________)
    {










































    }
}

```
