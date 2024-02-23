
class InClass {
       public static void main(String[] args) {
        
        int first = 0;
        int second = 1;
        int next;

        for(int i = 0; i < 10; i++){
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
            
        }

        
       
    }
}
