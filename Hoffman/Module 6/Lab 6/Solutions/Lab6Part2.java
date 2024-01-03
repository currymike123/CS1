import java.util.Scanner;

public class Lab6Part2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Question 8:
        System.out.println("Question 8:");
        System.out.printf("%-14s%s%n", "Kilograms", "Pounds");
        for(int k = 1; k<=199; k+=2) {
            System.out.printf("%-14d%.1f%n", k, (k*2.2));
        }


        //Question 9:
        System.out.println("\n\nQuestion 9:");
        System.out.print("Enter an integer: ");

        int num = sc.nextInt();
        int sumOfDigits = 0;
        while(num != 0) {
            sumOfDigits+=num%10;
            num/=10;
        }
        System.out.println("Sum of digits = " + sumOfDigits);


        //Question 10:
        System.out.println("\nQuestion 10:");
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact*=i;
        }
        System.out.println("Factorial of " + n + " = " + fact);


        //Question 11:
        System.out.println("\nQuestion 11:");
        double pi = 0;
        int denom = 1;
        for(int i = 0; i<20000; i++) {
            if(i % 2 == 0){
                pi+=(1.0/denom);
            } else {
                pi-=(1.0/denom);
            }
            denom+=2;
        }

        pi*=4;
        System.out.println("PI = " + pi);


        //Question 12:
        System.out.println("\nQuestion 12:");
        int pos = 0;
        int neg = 0;
        double total = 0;

        System.out.print("Enter an integer, the input ends if it is 0: ");
        int input = sc.nextInt();
        if(input == 0) {
            System.out.println("No numbers entered except 0.");
        } else {
            while(input != 0) {
                if(input > 0) {
                    pos++;
                } else {
                    neg++;
                }
                total+=input;
                input = sc.nextInt();
            }
            double average = total/(pos+neg);

            System.out.println("The number of positive is " + pos);
            System.out.println("The number of negatives is " + neg);
            System.out.println("The total is " + total);
            System.out.println("The average is " + average);
        }

    }
}
