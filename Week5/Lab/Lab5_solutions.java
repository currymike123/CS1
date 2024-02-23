import java.util.Scanner;

public class Lab5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Question 1:
        System.out.println("\nQuestion 1:");
        System.out.print("Enter a time: ");
        double time = input.nextDouble();

        if(time < 6) {
            System.out.println("Drive.");
        } else if(time <= 8) {
            System.out.println("Take a train.");
        } else {
            System.out.println("Take a bus.");
        }


        //Question 2:
        System.out.println("\nQuestion 3:");
        System.out.print("Enter 3 edges for a triangle: ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();

        if((s1+s2>s3) && (s2+s3>s1) && (s3+s1>s2)) {
            System.out.println("Perimeter = " + (s1+s2+s3));
        } else {
            System.out.println("Triangle not valid.");
        }

        //Question 3:
        System.out.println("\nQuestion 4:");
        System.out.print("Enter weight and price for package 1: ");
        double w1 = input.nextDouble();
        double price1 = input.nextDouble();

        System.out.print("Enter weight and price for package 2: ");
        double w2 = input.nextDouble();
        double price2 = input.nextDouble();

        if((price1/w1) < (price2/w2)) {
            System.out.println("Package 1 has a better price.");
        } else {
            System.out.println("Package 2 has a better price.");
        }


        //Question 4
        System.out.println("\nQuestion 7:");
        System.out.print("Enter the month and year for the amount of days in a month: ");
        int month2 = input.nextInt();
        int year = input.nextInt();

        switch(month2) {
            case 1:
                System.out.println("31 Days");
                break;
            case 2:
                if((year%4==0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("29 days");
                } else {
                    System.out.println("28 days");
                }
                break;
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 Days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 Days");
                break;
            default:
                System.out.println("Month or year input is incorrect. Try again.");
        }


	//Question 5
        System.out.println("\nQuestion 8:");
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double rate = input.nextDouble();

        double gratuity = subtotal * (rate / 100);
        double total = subtotal + gratuity;
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    



        //Question 6:
        System.out.println("\nQuestion 6:");
        System.out.println("Please provide a valid month number:");
        int month = input.nextInt();

        switch (month) {
            case 1:
                System.out.println("January");
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("February");
                System.out.println("28 or 29 days");
                break;
            case 3:
                System.out.println("March");
                System.out.println("31 days");
                break;
            case 4:
                System.out.println("April");
                System.out.println("30 days");
                break;
            case 5:
                System.out.println("May");
                System.out.println("31 days");
                break;
            case 6:
                System.out.println("June");
                System.out.println("30 days");
                break;
            case 7:
                System.out.println("July");
                System.out.println("31 days");
                break;
            case 8:
                System.out.println("August");
                System.out.println("31 days");
                break;
            case 9:
                System.out.println("September");
                System.out.println("30 days");
                break;
            case 10:
                System.out.println("October");
                System.out.println("31 days");
                break;
            case 11:
                System.out.println("November");
                System.out.println("30 days");
                break;
            case 12:
                System.out.println("December");
                System.out.println("31 days");
                break;
            default:
                System.out.println(month + " is not a month");
                break;
        }
    

        //Question 7:

        // Prompt the user to enter the weight of the package
        System.out.println("Please enter the weight of the package:");
        double weight = input.nextDouble();

        // Check if the weight is greater than 20
        if (weight > 20) {
            System.out.println("The package cannot be shipped.");
        } else if (weight <= 0) {
            System.out.println("The package cannot have a zero or negative weight.");
        } else {
            // Calculate the shipping cost based on the weight
            double shippingCost = 0.0;
            if (weight <= 1) {
                shippingCost = 3.5;
            } else if (weight <= 3) {
                shippingCost = 5.5;
            } else if (weight <= 10) {
                shippingCost = 8.5;
            } else {
                shippingCost = 10.5;
            }

            // Display the shipping cost
            System.out.println("The shipping cost is: $" + shippingCost);
        }

        //Question 8:
        // Prompt the user to enter the value of t
        System.out.println("Please enter the value of t:");
        int t = input.nextInt();

        if (t <= 50) {
            System.out.println("Blue region");
        } else if (t <= 60) {
            System.out.println("Yellow region");
        } else if (t <= 70) {
            System.out.println("Cyan region");
        } else if (t <= 80) {
            System.out.println("Green region");
        } else {
            System.out.println("Red region");
        }
        
    }
}
        
        



 
