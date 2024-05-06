## Lab 14

1. Write a method to check if a `String` is a palindrome or not. Use
   Scanner to ask the user for a `String` and call your method.

- **Hint** A palindrome is a word that is the same forwards and backwards. You’ll need two variables to go through your String to
  compare the characters. One variable will start at the beginning of the String and the other will start at the end of the String. You’ll need to use a loop to compare the characters at each position. If the characters are not the same, the word is not a palindrome. If you get through the entire word and all the characters are the same, the word is a palindrome.

2. Write a method that takes a `String` and returns a new `String` that is the reverse of the original `String`. Use Scanner to ask the user for a `String` and call your method.

3. Write a method that checks if a SSN is in a valid format. Use Scanner to ask the user for a SSN and call your method. A valid SSN is in the format `###-##-####` where each `#` is a digit. The SSN must be 11 characters long including the dashes. Remember

- **Hint** Remember that the `String` class has a method called `charAt` that will return the character at a specific index. You can use this method to check if the characters at the correct positions are digits or dashes.

4. Read in the data from the file `in.csv`. Store the ID, first name, last name, and account balance in separate ArrayLists. You should use the correct data type for each ArrayList depending on the data in the file.

```bash
1, John, Craft, 5561.1
2, Jane, Lane, 66002.55
3, Joan, Dion, 3123.45
4, Jack, Kent, 1541.56
5, Jenn, Kimble, 82145.32
6, Jina, Hagert, 73690.25
7, Jake, Smith, 9345.23
8, Jose, Diaz, 2323.23
9, Jade, Doe, 65890.39
```

- Create a print method that will print out the data in the ArrayLists in a formatted way. For example:

```bash
ID: 1
First Name: John
Last Name: Craft
Account Balance: 5561.1
```

- Create a method to find the person with the highest account balance and print out their information.

- Create a method to find the person with the lowest account balance and print out their information.

- Write to a file called `out.csv` the ID, first name, last name, and account balance of the person with the highest and lowest account balance.

- Add a method that will allow the user to search for a person by their last name. If the person is found, print out their information. If the person is not found, print out a message saying that the person was not found.

- **Hint** You can use the `equals` method to check if a `String` equals another `String`.
