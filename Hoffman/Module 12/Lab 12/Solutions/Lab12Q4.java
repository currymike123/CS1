import java.util.*;

public class Lab12Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Password: ");
        String password = sc.next();
        boolean valid = checkPassword(password);

        while(!valid) {
            System.out.println("Password must be at least 8 characters long, contain at least 1 uppercase character, "
                    + "1 symbol, and 2 numbers.");
            System.out.print("Try again: ");
            password = sc.next();
            valid = checkPassword(password);
        }
        System.out.println(password + " is valid.");

    }
    public static boolean checkPassword(String psw) {
        if(psw.length() < 8) {
            return false;
        } else {
            int upper = 0;
            int number = 0;
            int symbol = 0;

            for(int i = 0; i<psw.length(); i++) {
                char c = psw.charAt(i);
                if(Character.isDigit(c)) {
                    number++;
                } else if (Character.isUpperCase(c)) {
                    upper++;
                } else if(!Character.isLetterOrDigit(c)) {
                    symbol++;
                }
            }
            if(upper>=1 && number>=2 && symbol>=1) {
                return true;
            }
            return false;
        }
    }
}