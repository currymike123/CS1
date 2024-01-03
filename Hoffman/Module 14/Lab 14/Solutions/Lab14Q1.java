import java.util.*;
import java.io.*;

public class Lab14Q1 {

    public static void main(String[] args) throws IOException {
        Scanner in=new Scanner(new File("in.csv"));
        ArrayList<String> name=new ArrayList<>();
        ArrayList<Double> gpa=new ArrayList<>();
        ArrayList<String> id=new ArrayList<>();

        while(in.hasNextLine()) {
            String line = in.nextLine();
            String[] data = line.split(",");
            id.add(data[0]);
            String n=data[2] + " " + data[1];
            name.add(n);
            double g = Double.parseDouble(data[3]);
            gpa.add(g);
        }
        System.out.println(id);
        System.out.println(name);
        System.out.println(gpa);

        int index = maxIndex(gpa);
        System.out.println(name.get(index)+" has the highest gpa.");
        in.close();

    }
    public static int maxIndex(ArrayList<Double> a) {
        int maxI=0;
        for(int i=1;i<a.size();i++) {
            if(a.get(i)>a.get(maxI)) {
                maxI=i;
            }
        }
        return maxI;
    }
}
