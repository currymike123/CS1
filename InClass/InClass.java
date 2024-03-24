public class InClass {
    public static void main(String[] args) {
        // int[] numbers = new int[10];
        // numbers[0] = 10;
        // numbers[1] = 20;
        // numbers[2] = 30;
        // numbers[3] = 40;
        // numbers[4] = 50;
        // numbers[5] = 60;
        // numbers[6] = 70;
        // numbers[7] = 80;
        // numbers[8] = 90;
        // numbers[9] = 100;

        int[] numbers = {33, 10, 75, 41, 27};
        //int value = sumArray(numbers);
        System.out.println(maxArray(numbers));
    }

    public static int maxArray(int[] array){
        //Max value
        int max = array[0];
        //Check it against all other values
        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                //If it's larger swap
                max = array[i];
            }
        }
        
        return max;
    }

    public static int sumArray(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i]; // sum = sum + array[i];
        }
        return sum;

    }

    public static double averageArray(int[] array){
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i]; // sum = sum + array[i];
        }
        return sum / array.length;

    }




    public static void printVariable(int num) {
        System.out.print(num + " ");
        num++;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
            array[i]++;
        }
    }

    public static void printArray(double[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }


    public static void printArray(String[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }


}