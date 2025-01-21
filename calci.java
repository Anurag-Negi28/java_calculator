public class calci {
    public static void main(String[] args) {
        // Pre-defined values for the operation and numbers
        int choice = 1;           // Operation: 1 = Addition
        double num1 = 10;         // First number
        double num2 = 20;         // Second number

        // Display chosen operation and values
        System.out.println("Basic Calculator");
        System.out.println("-----------------");
        System.out.println("Operation: " + choice);
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);

        // Perform the operation
        switch (choice) {
            case 1:
                System.out.println("Result: " + (num1 + num2));  // Addition
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2));  // Subtraction
                break;
            case 3:
                System.out.println("Result: " + (num1 * num2));  // Multiplication
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));  // Division
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation. Use 1 for Addition, 2 for Subtraction, 3 for Multiplication, and 4 for Division.");
        }
    }
}
