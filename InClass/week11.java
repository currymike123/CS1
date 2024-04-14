import java.util.Random;

public class week11 {

    public static void main(String[] args) {
        int x = 6;
        int y = 2;
        int z = 5;

        double[] position = {x, y, z};

        System.out.println(manipulate(position));

        for(int i = 0; i < position.length; i++) {
            System.out.println(position[i]);
        }
    }

    public static int manipulate(int[] position) {
        position[0] = 5;
        position[1] = 10;
        position[2] = 15;
        return position[0] + position[1] + position[2];
    }

    public static double manipulate(double[] position) {
        position[0] = 10.0;
        position[1] = 20.0;
        position[2] = 30.0;
        return position[0] + position[1] + position[2];
    }

}