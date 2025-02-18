public class calci2 {
    public static void main(String[] args) {
        // Ensure there are 3 arguments passed
        if (args.length != 3) {
            System.out.println("Please provide 3 arguments: task (addition or subtraction), first number, second number.");
            return;
        }

        // Extract the arguments
        String task = args[0];  // Operation (addition or subtraction)
        int num1 = Integer.parseInt(args[1]);  // First number
        int num2 = Integer.parseInt(args[2]);  // Second number

        // Perform the task (addition or subtraction)
        if (task.equalsIgnoreCase("addition")) {
            System.out.println("Result (Addition): " + (num1 + num2));
        } else if (task.equalsIgnoreCase("subtraction")) {
            System.out.println("Result (Subtraction): " + (num1 - num2));
        } else {
            System.out.println("Invalid task. Please specify 'addition' or 'subtraction'.");
        }
    }
}
