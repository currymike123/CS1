import java.io.*;
import java.util.*;

public class InClass {

    public static void main(String[] args) throws IOException {
    
        File file = new File("input.csv");
        Scanner input = new Scanner(file);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> ages = new ArrayList<>();
        while(input.hasNextLine()){
            String line = input.nextLine();
            String[] values = line.split(",");
            names.add(values[0]);
            double age = Double.parseDouble(values[1]);
            ages.add(age);
        }
        input.close();

        int youngestIndex = findYoungest(ages);
        System.out.println(names.get(youngestIndex) + " is" + ages.get(youngestIndex) + " years old");
    }

    public static int findYoungest(ArrayList<Double> ages){
        int youngestIndex = 0;
        double youngest = ages.get(0);
        for(int i = 1; i < ages.size(); i++){
            if(ages.get(i) < youngest){
                youngest = ages.get(i);
                youngestIndex = i;
            }
        }

        return youngestIndex;
    }
    

}