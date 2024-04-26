import java.io.*;
import java.util.*;

public class InClass {

    public static void main(String[] args) throws IOException {
        File file = new File("input.csv");
        Scanner scanner = new Scanner(file);
        ArrayList<String[]> data = new ArrayList<>();
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] values = line.split(",");
            data.add(values);
        }
        scanner.close();

        printData(data);
    }

    public static void printData(ArrayList<String[]> data) {
        for(int i = 0; i < data.size(); i++) {
            String[] values = data.get(i);
            for(int j = 0; j < values.length; j++) {
                System.out.print(values[j] + " ");
            }
            System.out.println();
        }
    }
}