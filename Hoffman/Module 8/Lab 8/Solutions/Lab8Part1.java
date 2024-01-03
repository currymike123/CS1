import java.util.Scanner;

public class Lab8Part1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Call for Question 1
        System.out.println("Question 1:");
        printHelloWorld();

        //Call for Question 2:
        System.out.println("\nQuestion 2:");
        System.out.print("Enter a word: ");
        String word = sc.next();
        printString(word);

        //Call for Question 3:
        System.out.println("\nQuestion 3:");
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int sum = getSum(n);
        System.out.println("Sum = " + sum);

        //Call for Question 4:
        System.out.println("\nQuestion 4:");
        double avg = getAverage(n);
        System.out.println("Average = " + avg);

        //Call for Question 5:
        System.out.println("\nQuestion 5:");
        System.out.print("Enter weight and height: ");
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double bmi = getBMI(w, h);
        System.out.println("BMI " + bmi);

        //Call for Question 6:
        System.out.println("\nQuestion 6:");
        System.out.print("Enter a Celsius degree: ");
        double c = sc.nextDouble();
        double fahrenheit = getFahrenheit(c);
        System.out.println("fahrenheit = " + fahrenheit);

    }
    //Method for Question 1:
    public static void printHelloWorld() {
        System.out.println("Hello World!");
    }

    //Method for Question 2:
    public static void printString(String s) {
        System.out.println(s);
    }

    //Method for Question 3:
    public static int getSum(int n) {
        int sum = 0;
        for(int i = 0; i<=n; i++) {
            sum+=i;
        }
        return sum;
    }

    //Method for Question 4:
    public static double getAverage(int n) {
        double sum = (double)getSum(n);
        double average = sum/n;
        return average;
    }

    //Method for Question 5:
    public static double getBMI(double weight, double height) {
        return (weight * 703) / Math.pow(height, 2);
    }

    //Method for Question 6:
    public static double getFahrenheit(double celsius) {
        return (9/5.0) * celsius + 32;
    }
}
