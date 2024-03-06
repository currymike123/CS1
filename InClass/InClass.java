import java.util.Scanner;

public class InClass {
    public static void main(String[] args) {

        int x = 5;
        int y = 6;
        int z = 15;
        double avg = average(x, y, z);
        System.out.println(avg);

    }

    public static double average(int x, int y, int z) {
        return (x + y + z) / 3.0; // Return the average of x, y, and z
    }
}