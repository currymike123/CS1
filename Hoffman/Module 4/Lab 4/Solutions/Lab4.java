public class Lab4 {

    public static void main(String[] args) {

        //Question 1
        System.out.println("Question 1:");
        int ounces = 264;
        int pounds = ounces / 16;
        int remainingPounds = ounces % 16;
        System.out.println("He is " + pounds + " pounds and " + remainingPounds + " ounces.");

        //Question 2
        System.out.println("\nQuestion 2:");
        int m = 2580;
        int h = m / 60;
        int remainingM = m % 60;
        System.out.println(h + " hours and " + remainingM + " minutes");

        //Question 3
        System.out.println("\nQuestion 3:");
        int seconds = 313297;
        //1. get the days first:
        int days = seconds / (60 * 60 * 24); //60 secs in a minute -> 60 minutes in an hour -> 24 hours in a day
        seconds %= (60 * 60 * 24); //get remaining seconds

        //2. get the hours next:
        int hours = seconds / (60 * 60); //60 secs in a minute -> 60 minutes in an hour
        seconds %= (60 * 60); //get remaining seconds

        //3. get the minutes next
        int minutes = seconds / 60; //60 seconds in a minute
        seconds %= 60; // get remaining seconds -- last step!

        System.out.println(days + ":" + hours + ":" + minutes + ":" + seconds);

        //Question 4:
        System.out.println("\nQuestion 4:");
        int num = 123;
        num /= 10; //chop off ones place since question doesn't need this, left with 12
        int tens = num % 10; // 2
        System.out.println("Tens digit = " + tens);

        //Question 5:
        System.out.println("\nQuestion 5:");
        int n = 123;
        int sum = 0;

        sum += n % 10; //get the ones digit, add 3 to sum
        n/=10; //chop off the ones place, left with 12
        sum += n % 10; //get the tens digit, add 2 to sum
        n/=10; //chop off the tens place, left with 1
        sum += n % 10; //get the hundreds digit, add 1 to sum

        System.out.println("Sum = " + sum);

        //Question 6
        System.out.println("\nQuestion 6:");
        double balance = 128.85;
        int dollars = (int)balance;
        int cents = (int)(balance * 100) % 100;
        System.out.println("dollars: " + dollars);
        System.out.println("cents: " + cents);

        /*
        Question 7:
        In a, since there are 3 separate if statements, each condition has a chance of
        being met and being executed. Ex: If x = 1, each condition will be met and the if
        body of each statement will execute.

        In b, only one of the conditions will be executed even if x meets each condition.
        Ex: If x = 1, the first condition is met and the body of the if statement will
        execute. This causes the rest of the statements to be ignored.
         */

        //Question 8:
        System.out.println("\nQuestion 8:");
        int number = 123;
        boolean palindrome;

        int ones = number % 10;
        int hundreds = number / 100;

        if(ones == hundreds) {
            palindrome = true;
        } else {
            palindrome = false;
        }
        System.out.println(num + " is a palindrome: " + palindrome);

       
        //Question 9:
        System.out.println("\nQuestion 9:");
        double t = 75;
        String region;

        if(t < 50) {
            region = "blue";
        } else if(t < 60) {
            region = "yellow";
        } else if(t < 70) {
            region = "cyan";
        } else if(t < 80) {
            region = "green";
        } else {
            region = "red";
        }

        System.out.println("You are in the " + region + " region.");
        

    }
}
