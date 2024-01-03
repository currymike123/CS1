public class Lab2 {

    public static void main(String[] args) {

        //Question 1:
        System.out.println("Question 1:");
        System.out.println("Kaitlin");
        System.out.println("Kaitlin");

        //Question 2:
        System.out.println("\nQuestion 2:");
        System.out.print("Kaitlin ");
        System.out.println("Kaitlin");
        /*
        or:
        System.out.println("Kaitlin Kaitlin");
        or:
        System.out.println("Kaitlin " + "Kaitlin");
         */

        //Question 3:
        System.out.println("\nQuestion 3:");
        System.out.println("+------------------+");
        System.out.println("|                  |");
        System.out.println("|     Kaitlin      |");
        System.out.println("|                  |");
        System.out.println("+------------------+");

        //Question 4:
        System.out.println("\nQuestion 4:");
        System.out.println("Welcome to Java!");
        System.out.println("Welcome to Java!");
        System.out.println("Welcome to Java!");

        //Question 5:
        System.out.println("\nQuestion 5:");
        System.out.println((9.5*4.5-2.5*3)/45.4-3.5);

        //Question 6:
        System.out.println("\nQuestion 6:");
        System.out.println(1+2+3+4+5+6+7+8+9);

        //Question 7:
        System.out.println("\nQuestion 7:");
        System.out.println(1*2*3*4*5*6*7);

        //Question 8:
        System.out.println("\nQuestion 8:");
        /* a. */ System.out.println(2+3);
        /* b. */ System.out.println("2"+3);
        /* c. */ System.out.println("2"+"3");
        /* d. */ System.out.println(1+2+3+"4"+5+6);
        /* e. */ System.out.println("2"+3+4);
        /* f. */ System.out.println("2"+(3+4));
        /*
        e and f are different because e is using concatenation
        (merging of two Strings), while in f, 3+4 is being solved
        first as an addition problem since it's in the parentheses.
        Remember, Java follows PEMDAS, 3+4 will be solved first
        THEN 2 and the result will concatenate.
         */
        /* g. */ System.out.println('a'+1);
        /* h. */ System.out.println('a'+"1"+'P');

        //Question 9
        System.out.println("\nQuestion 9:");
        System.out.printf("%-15s%-9s%s%n", "Employee:", "ID:", "Hourly Rate:");
        System.out.printf("%-15s%-9d%.2f%n", "Sally", 12345, 24.5);
        System.out.printf("%-15s%-9d%.2f%n", "John", 55555, 19.32);
        System.out.printf("%-15s%-9d%.2f%n", "Billy", 34109, 31.21);

        //Question 10
        System.out.println("\nQuestion 10:");
        System.out.println("Random Facts");
        System.out.printf("%-9s%-13s%s%n", "Friend","Fav Letter", "Fav Number");
        System.out.printf("%-9s%-13c%d%n", "Jas", 'K', 8);
        System.out.printf("%-9s%-13c%d%n", "Gina", 'G', 15);
        System.out.printf("%-9s%-13c%d%n", "Cathy", 'B', 25);


    }
}
