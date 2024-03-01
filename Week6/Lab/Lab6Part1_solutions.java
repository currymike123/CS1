public class Lab6Part1 {
    public static void main(String[] args) {

        //Question 1:
        System.out.println("Question 1:");
        //for loop:
        for(int i = 50; i>=10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //while loop
        int i2 = 50;
        while(i2 >= 10) {
            System.out.print(i2 + " ");
            i2--;
        }

        //Question 2:
        System.out.println("\n\nQuestion 2:");
        //for loop
        for(int i = 0; i<=100; i++) {
            if(i % 10 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(i + " ");
        }
        System.out.println();

        //while loop
        i2 = 0;
        while(i2 <= 100) {
            if(i2 % 10 == 0 && i2 != 0) {
                System.out.println();
            }
            System.out.print(i2 + " ");
            i2++;
        }

        //Question 3:
        System.out.println("\n\nQuestion 3:");
        //for loop
        for(char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();

        //while loop
        char c2 = 'A';
        while(c2 <= 'Z') {
            System.out.print(c2 + " ");
            c2++;
        }

        //Question 4:
        System.out.println("\n\nQuestion 4:");
        //for loop
        for(char c = 'z'; c>='a'; c--) {
            System.out.print(c + " ");
        }
        System.out.println();

        //while loop
        c2 = 'z';
        while(c2 >= 'a') {
            System.out.print(c2 + " ");
            c2--;
        }

        //Question 5
        System.out.println("\n\nQuestion 5:");
        //for loop
        int sum = 0;
        for(int i = 0; i<50; i+=2) {
            sum+=i;
        }
        System.out.println("Sum of even = " + sum);

        //while loop
        int sumWhile = 0;
        i2 = 0;
        while(i2 < 50) {
            sumWhile+=i2;
            i2+=2;
        }
        System.out.println("Sum of even = " + sumWhile);

        //Question 6:
        System.out.println("\n\nQuestion 6:");
        //for loop
        int count = 0;
        for(int i = 20; i <= 300; i++) {
            if(i % 2 == 0 || i % 7 == 0) {
                count++;
            }
        }
        System.out.println("Count = " + count);

        //while loop
        int whileCount = 0;
        i2 = 20;
        while(i2 <= 300) {
            if(i2 % 2 == 0 || i2 % 7 == 0) {
                whileCount++;
            }
            i2++;
        }
        System.out.println("Count = " + whileCount);

        //Question 7:
        System.out.println("\n\nQuestion 7:");
        //for loop
        count = 0;
        for(int i = 15; i<=75; i++) {
            if(i % 2 != 0) {
                count++;
            }
        }
        System.out.println("Count = " + count);

        whileCount = 0;
        i2 = 15;
        while(i2 <= 75) {
            if(i2 % 2 != 0) {
                whileCount++;
            }
            i2++;
        }
        System.out.println("Count = " + count);

    }
}
