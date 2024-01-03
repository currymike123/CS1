class Lab14Qs {
    public static void main(String[] args) {

        //q2
        double sum = summation(2, 3);
        System.out.println("Summation: " + sum);

        //q3
        displaySummation(2, 3);

        //q4
        System.out.println();
        int amount = getCharAmount("lhellol", 'l');
        System.out.println("Amount = " + amount);

        //q5
        boolean b = isPalindrome("racecar");
        System.out.println("Palindrome: " + b);

        //q6
        int sumD = sumOfDigits(123);
        System.out.println("Sum of Digits: " + sumD);

    }
    //q2
    public static double summation(double x, double n) {
        if(n == 0) {
            return 1;
        }
        return Math.pow(x, n) + summation(x, n-1);
    }

    //q3
    public static void displaySummation(double x, double n) {
        if(n == 0) {
            System.out.print((int)Math.pow(x, n));
            return;
        }
        displaySummation(x, n-1);
        System.out.print(" + " + (int)Math.pow(x, n));
    }

    //q4
    public static int getCharAmount(String s, char c) {
        if(s.length() == 0) {
            return 0;
        }
        char currentC = s.charAt(s.length()-1);
        if(currentC == c) {
            return 1 + getCharAmount(s.substring(0, s.length()-1), c);
        }
        return getCharAmount(s.substring(0, s.length()-1), c);
    }
    //q5
    public static boolean isPalindrome(String s) {
        if(s.length()==0 || s.length()==1) {
            return true;
        }
        if(s.charAt(0)==s.charAt(s.length()-1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }
    //q6
    public static int sumOfDigits(int num) {
        if(num == 0) {
            return 0;
        }
        return num%10 + sumOfDigits(num/10);
    }
}