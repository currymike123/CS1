import java.util.Scanner;

public class Lab6_solutions {
    public static void main(String[] args) {

        //Question 2: Count the number of even integers between 15 and an integer given by a user via Scanner. The integer given by the user must be greater than 15. 
        //If the user tries entering a number that is 15 or less, have the user try again until they enter a valid number. Display the count.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer greater than 15: ");
        int num = input.nextInt();
        while (num <= 15) {
            System.out.print("Enter an integer greater than 15: ");
            num = input.nextInt();
        }
        int count = 0;
        for (int i = 16; i <= num; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }

        //Question 3: The code will cause an error. i is not within the scope of the for loop. Control variables in for loops are only accessible within the for loop.

        //Question 4: Create a program prompts the user for a temperature in Celsius and converts it to Fahrenheit. The formula to convert Celsius to 
        //Fahrenheit is: F = (9/5)C + 32. The program should then display the temperature in Fahrenheit. The program should keep asking the user for a temperature 
        //in Celsius until the user enters a valid temperature. A valid temperature is a number that is greater than -273.15. If the user enters a number that is less 
        //than or equal to -273.15, the program should display an error message and ask the user to try again.

        System.out.print("Enter a temperature in Celsius: ");
        double celsius = input.nextDouble();
        while (celsius <= -273.15) {
            System.out.print("Enter a temperature in Celsius: ");
            celsius = input.nextDouble();
        }
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println("The temperature in Fahrenheit is " + fahrenheit);

        //Question 5: Declare and initialize a number to a double. Write a program that uses a while loop to print the number and then divide the number by 2. 
        //The loop should continue until the number is less than 1. Print the number at the end of the loop.

        double number = 10.0;
        while (number >= 1) {
            System.out.println(number);
            number /= 2;
        }

        //Question 6: 

        //int x = 11;
        //int j = 7;
        //int y = 3;
        //int z = j % y; // z = 1
        //int a = x % j; // a = 4
        //System.out.println(z/a); // 1/4 = 0 (integer division)

        //System.out.println(z/(double)a); // 1/4.0 = 0.25 (floating point division)
        
        
        //The code performs integer division and prints 0.  To get 0.25 you would need to case one of the variables to a double or use a double as your variable type for either z or a.  



    }
}