# CPS 210 - Final

Name:

---

You are working at a company that is developing a new software system to manage the inventory of a warehouse. You are are saving the inventory data in a csv file. The csv file is called `inv.csv` and has the following format:

Item,Quantity,Price

```
Apple,10,1.00
Banana,20,0.50
Orange,30,0.75
```

**Note:** The csv file can have any number of items.

You are asked to write a program that reads the csv file and saves the data in an ArrayList(s).

You can save the date in three different ArrayLists: one for the items, one for the quantities, and one for the prices. Or you can save the data in one ArrayList. The choice is yours. Make sure to use the correct data type for each ArrayList.

Write a method called `printInventory` that prints the contents of the ArrayList(s). The method should take the ArrayList(s) as a parameter(s) and return nothing.

You need to write a method called `findQuantity` that takes the name of an item as a parameter and returns the quantity of the item. If the item is not found, the method should return -1. Use Scanner to get the name of the item from the user. Pass it to the `findQuantity` method and print the result from the main method.

Then you need to calculate the total value of the inventory. The total value of the inventory is calculated by multiplying the quantity of each item by the price of the item and summing the results.

Write a method called `calcValue` that calculates the total value of the inventory. The method should take the ArrayList(s) as a parameter(s) and return the total value of the inventory.

Lastly, you need to write the total value of the inventory to a file called `total.txt`. The file should have the following format:

```
Total Value: 45.0
```

**Note:** The total value should not be hardcoded. It should be calculated using the `calcValue` method.

<div style="page-break-after: always;"></div>

Here is the structure of the Main Method:

Main Method:

1. Read the csv file and save the data in an ArrayList(s).
2. Print the contents of the ArrayList(s) with the `printInventory` method.
3. Get the name of an item from the user and pass it to the `findQuantity` method. Print the result.
4. Calculate the total value of the inventory with the `calcValue` method.
5. Write the total value of the inventory to a file called `total.txt`.

I have provided a blank template to for you to fill in. Your code must be written in the provided template. I have provided a separate page for each method. There is a line for your method declaration and a line for the parameters. Write small enough to fit your code in the template.

Do not change the template and only write your code in the designated areas. You have scrap paper to write your code on before you write it in the template. <b>I WILL NOT GRADE ANY CODE WRITTEN OUTSIDE THE TEMPLATE.</b>

<div style="page-break-after: always;"></div>

```java

import java.io.*;
import java.util.*;

public class Inventory {

______________________ main(_________________________)
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
__________________ findQuantity(__________________________________)
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
