public class week11 {

    public static void main(String[] args) {
        int[][] numbers = {
            {0, 1, 2},
            {3, 4, 5},
            {6, 7, 8}
        };

        int[][] rotated = new int[3][3];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                rotated[j][2 - i] = numbers[i][j];
            }
        }

        System.out.println("Original array:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Rotated array:");
        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated[i].length; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }
}