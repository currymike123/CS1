import java.util.Scanner;

public class Lab11Q2and3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int num = sc.nextInt();
        double[] grades = new double[num];

        System.out.print("Enter the " + num + " scores: ");
        for(int i = 0; i<grades.length; i++) {
            grades[i] = sc.nextDouble();
        }

        double maxGrade = maxValue(grades);

        for(int i = 0; i<grades.length; i++) {
            char grade;
            if(grades[i] >= (maxGrade - 10)) {
                grade = 'A';
            } else if(grades[i] >= (maxGrade - 20)) {
                grade = 'B';
            } else if(grades[i] >= (maxGrade - 30)) {
                grade = 'C';
            } else if(grades[i] >= (maxGrade - 40)) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("Student " + i + " score is " + grades[i]
                    + " and grade is " + grade);
        }



    }
//    question 2 - get max value. We'll use this for finding
//    best grade for question 3!
    public static double maxValue(double[] arr) {
        double max = arr[0];
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

//    question 2 part a
    public static int maxIndex(double[] arr) {
        int max = 0;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}