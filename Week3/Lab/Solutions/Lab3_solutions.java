class Lab3_solutions {
    public static void main(String[] args) {

        // Question 1
        double radius = 4.5;
        double pi = 3.14159;
        double area = pi * radius * radius;
        System.out.println("The area of the circle is: " + area);

        // Question 2
        double circumference = 2 * pi * radius;
        System.out.println("The circumference of the circle is: " + circumference);

        // Question 3
        double feet = 10;
        double meters = feet * 0.305;
        System.out.println(feet + " feet is equal to " + meters + " meters.");
        
        // Question 4
        int num = 512;
        boolean b = num < 1000;
        System.out.println("Is " + num + " less than 1000? " + b);

        // Question 5
        char ch = 'A';
        int asciiValue = (int) ch;
        System.out.println("The ASCII value of " + ch + " is: " + asciiValue);
    
        //Question 6
        double num1 = 123.456;
        int num2 = (int) num1;
        System.out.println("The integer value of " + num1 + " is: " + num2);

        //Question 7
        //Run the code and see the output. Make sure to follow the logical steps.

        //Question 8
        double fahrenheit = 68;
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("The temperature in Celsius is: %.1f%n", celsius);
        
        //Question 9
        int dogWeightOunces = 264;
        int pounds = dogWeightOunces / 16;
        int remainingOunces = dogWeightOunces % 16;
        System.out.println("The dog weighs " + pounds + " pounds and " + remainingOunces + " ounces.");
        
        //Question 10

        int num3 = 512;
        boolean equalTo = false;
        boolean lessThan = false;
        boolean greaterThan = false;
        if (num3 == 100) {
            equalTo = true;
        } else if (num3 < 100) {
            lessThan = true;
        } else {
            greaterThan = true;
        }
        System.out.println("Is " + num3 + " equal to 100? " + equalTo);
        System.out.println("Is " + num3 + " less than 100? " + lessThan);
        System.out.println("Is " + num3 + " greater than 100? " + greaterThan);
        
    }
}
