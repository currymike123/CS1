import java.io.*;
import java.util.*;

public class InClass {

    public static void main(String[] args) throws IOException {
    }

    public static boolean isValidSSN(String ssn){

        if(ssn.length() != 11){
            return false;
        }

        for(int i = 0; i < ssn.length(); i++){
            if (i == 3 || i == 6){
                if(ssn.charAt(i) != '-'){
                    return false;
                }
            }else{
                if(!Character.isDigit(ssn.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }

    public static String reverseString(String str){
        String reversed = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static boolean isPalidrome(String str){
        int i = 0;
        int j = str.length() - 1;

        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}