import java.util.Scanner;

public class Lab11Q9 {

    public static void main(String[] args) {

        //header
        System.out.printf("%28s\n", "Exponents Table");
        System.out.print("    ");

        for(int i = 0; i<=5; i++) {
            System.out.printf("%5d", i);
        }
        System.out.println("\n-----------------------------------");

        //body
        for(int i = 0; i<=5; i++) {
            System.out.print(i + " | ");
            for(int j = 0; j<=5; j++) {
                System.out.printf("%5d", (int)Math.pow(i,j));
            }
            System.out.println();
        }

    }
}