public class calci2 {
    public static void main(String[] args) {
        // Check if there are 3 command-line arguments
        if (args.length != 3) {
            System.out.println("Please provide 3 arguments: task (addition or subtraction), first number, second number.");
            return;
        }

        // Extract the arguments
        String task = args[0];
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);

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
