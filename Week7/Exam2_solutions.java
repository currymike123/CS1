import java.util.Scanner;

public class Exam2_solutions {
    public static void main(String[] args) {

        //**Question 1**
        //False - i is out of scope in the print statement.

        //**Question 2**
        //B - Integer Division so the decimal is truncated. 5/2 = 2.5 but it's truncated to 2. 

        //**Question 3**
        // Scanner input = new Scanner(System.in);
        
        // System.out.print("Enter an integer:");
        // int userInt = input.nextInt();
        
        // System.out.print("Enter a double:");
        // double userDouble = input.nextDouble();
        
        // System.out.print("Enter a word:");
        // String userWord = input.next(); //One word
        
        // System.out.println("The integer is: " + userInt);
        // System.out.println("The double is: " + userDouble);
        // System.out.println("The word is: " + userWord);

        //**Question 4**
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter a number that is divisible by 5: ");
        // int number = input.nextInt();

        // while (number % 5 != 0) {
        //     System.out.print("Enter a number that is divisible by 5: ");
        //     number = input.nextInt();
        // }

        // System.out.println(number);
 
        //**Question 5** 
        // Scanner input = new Scanner(System.in);

        //One way
        // double total = 0.0;
        // System.out.print("Enter a number: ");
        // double number = input.nextDouble();
        // if (number > 0) {
        //     total += number;
        // }

        // while (number >= 0 && total < 100) {
        //     System.out.print("Enter a number: ");
        //     number = input.nextDouble();
        //     if (number > 0) {
        //         total += number;
        //     }
        // }


         //Another way

        // double total = 0.0;
        // double number = 1; 
        // while (total < 100 && number >= 0) {
        //     System.out.print("Enter a number: ");
        //     number = input.nextDouble();
        //     if(number < 0){
        //       break;
        //     }
        //     total += number;
        // }

        //Another way

        //double total = 0.0;
        //double number = 0.0; 
        // do{
        //     total += number;
        //     System.out.print("Enter a number: ");
        //     number = input.nextDouble();
        // }while(total < 100 && number >= 0);

        // System.out.println("The total is: " + total);

        //**Question 6**

        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int number = input.nextInt();
        // int digits = 0;

        // while (number > 0) {
        //     number /= 10; // Divide number by 10
        //     digits++; // Increment count
        // }

        // System.out.println("The number of digits is: " + digits);


    }
}
