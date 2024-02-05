class Test {
    public static void main(String[] args) {

        // Question 1:
	// Students might have a slightly different printf statement. 
        System.out.printf("%-6s%-11s%-8s%n%-6d%-11s%-6s", "ID", "Username", "Password", 125, "bobby", "xxxxxx");
    
        //Skip line
        System.out.println();
        
        //Question 2:
        int base = 10;
        int height = 25;
        double area = 0.5 * base * height;
        System.out.println("Area of a triangle: " + area);
        
        //Question 3:
        int number = 5;
        double convert = number;
        System.out.println("Convert int to double: " + convert);
        //Yes, it is legal. 
    }
}
