import java.util.Scanner;

class InClass {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer greater than 1: ");
        int n = input.nextInt(); 
        while (n <= 1)
        {
            System.out.print("Invalid value: Try again: ");
            n = input.nextInt(); //This will re-assign n to the new value.
        }

        int sum = 0;
        //Notice the control variable starts at 1.
        for (int i = 1; i <= n; i++)
        {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}