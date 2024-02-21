import java.util.Scanner;

class InClass {
       public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first and last name: ");

        String first = input.next();
        String last = input.next();

        System.out.println("Your initials are: " + first.charAt(0) + last.charAt(0));
        
       
    }
}
