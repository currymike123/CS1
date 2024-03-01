import java.util.Scanner;

class InClass {

    public static void main(String[] args) 
    {
      //Variables
      int correct = 0;
      int incorrect = 0;

      //Create input object
      Scanner input = new Scanner(System.in);

      //Ask 5 questions. Loop
      for(int i = 0; i < 5; i++){
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        System.out.print("What is " + number1 + " + " + number2 + "?");
        int answer = input.nextInt();
        if(answer == number1 + number2){
            System.out.println("You are correct");
            correct++;
        }else{
            System.out.println("You are wrong");
            incorrect++;
        }
      }
      //Output # of correct and incorrect
     System.out.println("You got " + correct + " correct answers.");
     System.out.println("You got " + incorrect + " incorrect answers.");
      
    }
}
