import java.util.Scanner;

public class InClass {
    public static void main(String[] args) {
      //Scanner object
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a String: ");
      String str = input.next();
      System.out.print("Enter a positive integer: ");
      int num = input.nextInt();
      //Method Call
      printString(str, num);
      
    }

    public static void printString(String str, int num){
      if (num <= 0){
        System.out.println("Invalid Input");
      }else{
        for(int i = 0; i < num; i++){
          System.out.println(str);
        }
      }

    }
      
}

 
