import java.util.Scanner;

public class InClass {
       public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter their first and last name
        System.out.print("Enter your first and last name: ");
        // Read the first and last name from the user
        String first = input.next();
        String last = input.next();
        // Output the initials
        System.out.println("Your initials are " + first.charAt(0) + last.charAt(0));
    }
}
