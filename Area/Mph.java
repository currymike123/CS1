class Mph {
    public static void main(String[] args) {
        double distance = 100.0;
        int time = 120;
        double mph = distance / (time/60);
        System.out.println("distance: " + distance);
        System.out.println("time: " + time);
        System.out.println("Average speed: " + mph);
    }
}