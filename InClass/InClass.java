import java.util.ArrayList;
import java.util.Scanner;

public class InClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       //Prompt & Input grades
        ArrayList<Integer> grades = inputGrades(input);
      
       //Print Grades

       //Average Grades

       //Max Grade   
    }

    public static ArrayList<Integer> inputGrades(Scanner input){
        ArrayList<Integer> grades = new ArrayList<Integer>();
        System.out.println("Enter grades: (enter -1 to finish)");

        //Loop all entered grades
        while(true){
            int grade = input.nextInt();
            if(grade == -1){
                break;
            }

            grades.add(grade);

        }

        return grades;
    }

 
}