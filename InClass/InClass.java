import java.util.Scanner;

public class InClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count = 0;
        while(num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("The number of digits is: " + count);
    }
}