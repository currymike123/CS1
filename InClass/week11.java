import java.util.Random;

public class week11 {

    public static void main(String[] args) {
        int[][] numbers = new int[5][5];


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = (int)(Math.random() * 10);
            }
        }

        int[] max = findMax(numbers);

        printArray(numbers);
        System.out.println("Max value: " + max[0]);
        System.out.println("Row: " + max[1]);
        System.out.println("Column: " + max[2]);
    }

    public static int[] findMax(int[][] arr) {
        int[] max = {arr[0][0], 0, 0};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max[0]) {
                    max[0] = arr[i][j];
                    max[1] = i;
                    max[2] = j;
                }
            }
        }

        return max;
    }

    public static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
    }
}
}