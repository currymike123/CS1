import java.util.Scanner;

public class Lab9Part1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//Question 1:
        System.out.println("Question 1:");
        System.out.print("Enter a value for feet: ");
        double feet = sc.nextDouble();

        double meters = feetToMeters(feet);
        System.out.println(feet + " feet is " + meters + " meters");

//Question 2:
        System.out.println("\nQuestion 2:");
        System.out.print("Enter the subtotoal and a gratuity rate: ");
        double subtotal = sc.nextDouble(), rate = sc.nextDouble();

        gratuityAndTotal(subtotal, rate);

 //Question 3:
        System.out.println("\nQuestion 3:");
        System.out.print("Enter the amount of water in kilograms: ");
        double kilo = sc.nextDouble();

        System.out.print("Enter the initial temperature: ");
        double temp = sc.nextDouble();

        System.out.print("Enter the final temperature: ");
        double finalTemp = sc.nextDouble();

        double energy = calculateEnergy(kilo, temp, finalTemp);
        System.out.println("The energy need is " + energy);

//      Question 4
        System.out.println("\nQuestion 4:");
        System.out.print("Enter a, b, and c: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

        calculateDiscriminate(a, b, c);

//      Question 5
        System.out.println("\nQuestion 5:");
        System.out.print("Enter a month and year: ");
        int month = sc.nextInt(), year = sc.nextInt();

        int days = daysInMonth(month, year);
        System.out.println("There are/were " + days + " days");

    }
/*========================================================
------------------------- METHODS ------------------------
=========================================================*/
    //Question 1
    public static double feetToMeters(double feet) {
        return feet * 0.305;
    }

    //Question 2
    public static void gratuityAndTotal(double subtotal, double rate) {
        double gratuity = subtotal * (rate / 100);
        double total = subtotal + gratuity;
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }

    //Question 3
    public static double calculateEnergy(double kilo, double temp, double finalF) {
        return kilo * (finalF - temp) * 4184;
    }

    //Question 4
    public static void calculateDiscriminate(double a, double b, double c) {
        double r1 = (-b + Math.sqrt(b*b - 4 * a * c)) / (2 * a);
        double r2 = (-b - Math.sqrt(b*b - 4 * a * c)) / (2 * a);
        double disc = (b*2) - (4*a*c);

        if(disc == 0) {
            System.out.println("The equation has one root " + r1);
        } else if (disc > 0) {
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        } else {
            System.out.println("The equation has no real roots");
        }
    }

    //Question 5
    public static int daysInMonth(int month, int year) {
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    return 29;
                }
                return 28;
            default:
                System.out.println("Month or year not valid.");
                return -1;
        }
    }
}