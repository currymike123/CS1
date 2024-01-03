import java.util.Scanner;

public class Lab8Part2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Call for Question 7
        System.out.println("Question 7:");
        System.out.print("Enter seconds: ");
        int seconds = sc.nextInt();
        String time = getConversion(seconds);
        System.out.println(time);

        //Call for Question 8
        System.out.println("\nQuestion 8:");
        System.out.print("Enter integer: ");
        int num = sc.nextInt();
        boolean isPalindrome = checkPalindrome(num);
        System.out.println(isPalindrome);

        //Call for Question 9
        System.out.println("\nQuestion 9:");
        System.out.print("Enter a and b: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double hypotenuse = getHypotenuse(a, b);
        System.out.printf("%s%.2f", "hypotenuse = ", hypotenuse);

        //Call for Question 10
        System.out.println("\n\nQuestion 10:");
        System.out.print("Enter integer: ");
        int n = sc.nextInt();
        int count = countDivisibility(n);
        System.out.println("count = " + count);

        //Call for Question 11
        System.out.println("\nQuestion 11:");
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int sumOfDigits = getSumOfDigits(number);
        System.out.println("Sum of digits = " + sumOfDigits);

        //Call for Question 12
        System.out.println("\nQuestion 12:");
        System.out.print("Enter integer for factorial: ");
        int i = sc.nextInt();
        int factorial = getFactorial(i);
        System.out.println("Factorial = " + factorial);

    }
    //Method for Question 7
    public static String getConversion(int seconds) {
        int days = seconds/(24*60*60);
        seconds = seconds % (24*60*60);
        int hours = seconds/(60*60);
        seconds = seconds%(60*60);
        int minutes = seconds/60;
        seconds =  seconds%60;

        return days + ":" + hours + ":" + minutes + ":" + seconds;
    }

    //Method for Question 8
    public static boolean checkPalindrome(int num) {
        int ones = num % 10;
        int hundreds = num / 100;
        return ones == hundreds;
    }

    //Method for Question 9
    public static double getHypotenuse(double a, double b) {
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }

    //Method for Question 10
    public static int countDivisibility(int n) {
        if(n<1) {
            System.out.println("Number must be at least 1");
            return -1;
        }
        int count = 0;
        for(int i = 1; i<=n; i++) {
            if((i % 2 == 0) || (i % 7 == 0)) {
                count++;
            }
        }
        return count;
    }

    //Method for Question 11
    public static int getSumOfDigits(int n) {
        int sum = 0;
        while(n != 0) {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

    //Method for Question 12
    public static int getFactorial(int n) {
        int fact = 1;
        for(int i = n; i>=1; i--) {
            fact*=i;
        }
        return fact;
    }
}
