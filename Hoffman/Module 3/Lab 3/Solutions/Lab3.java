package com.kaitlinHoff;

public class Lab3 {

    public static void main(String[] args) {
	    // Question 1:
        System.out.println("Question 1:");
        double radius = 4.5;
        double pi = 3.1415;
        double area = radius * radius * pi;
        System.out.println("Area = " + area);

        //Question 2:
        System.out.println("\nQuestion 2:");
        double length = 12.75;
        double volume = area * length;
        System.out.println("Volume = " + volume);

        //Question 3:
        System.out.println("\nQuestion 3:");
        double c = 0;
        double f = (9.0 / 5) * c + 32;
        System.out.println("Fahrenheit = " + f);

        //Question 4:
        System.out.println("\nQuestion 4:");
        double feet = 12;
        double meters = feet * 0.305;
        System.out.println("Meters = " + meters);


        //Question 5:
        System.out.println("\nQuestion 5:");
        double kilo = 12;
        double pounds = kilo * 0.454;
        System.out.println("Pounds = " + pounds);

        //Question 6:
        System.out.println("\nQuestion 6:");
        double weight = 145;
        double height = 67.5;
        double bmi = (weight * 703) / (height * height);
        System.out.printf("%-6s%.2f", "BMI =", bmi);

        //Question 7:
        System.out.println("\n\nQuestion 7:");
        int i = 8560;
        int num = 100;
        boolean bool = i < num;
        System.out.println(i + " is less than " + num + ": " + bool);


        //Question 8:
        System.out.println("\nQuestion 8:");
        double v1 = 50.5;
        double v0 = 60.75;
        double t = 120.5;

        double acc = (v1 - v0) / t;

        System.out.println("Acceleration = " + acc);

        //Question 9:
        System.out.println("\nQuestion 9:");
        double fTemp = 75;
        double iTemp = 60;
        double m = 100;

        double q = m * (fTemp - iTemp) * 4184;
        System.out.println("Energy = " + q);


        //Question 10:
        System.out.println("\nQuestion 10:");
        int a = 1;
        int b = 2;
        System.out.printf("%-6s%-6s%s%n", "a", "b", "pow(a,b)");
        System.out.printf("%-6d%-6d%.0f%n", a, b, Math.pow(a,b));
        a = 2;
        b = 3;
        System.out.printf("%-6d%-6d%.0f%n", a, b, Math.pow(a,b));
        a = 3;
        b = 4;
        System.out.printf("%-6d%-6d%.0f%n", a, b, Math.pow(a,b));
        a = 4;
        b = 5;
        System.out.printf("%-6d%-6d%.0f%n", a, b, Math.pow(a,b));
        a = 5;
        b = 6;
        System.out.printf("%-6d%-6d%.0f%n", a, b, Math.pow(a,b));

        //Question 11
        System.out.println("\n\nQuestion 11:");
        int ounces = 264;
        int pounds = ounces / 16;
        int remainingPounds = ounces % 16;
        System.out.println("He is " + pounds + " pounds and " + remainingPounds + " ounces.");

    }
}
