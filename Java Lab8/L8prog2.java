/* Write a complete program to accept N integer numbers from the command line. Raise and handle exceptions 
for following cases : 
 - when a number is –ve 
- when a number is evenly divisible by 10  
- when a number is greater than 1000 and less than 2000 
- when a number is greater than 7000 
Skip the number if an exception is raised for it, otherwise add it to find total sum. 
 */
public class L8prog2 {

    public static void main(String[] args) {
        // Check if there are command line arguments
        if (args.length < 1) {
            System.out.println("Usage: java NumberValidator <number1> <number2> ...");
            return;
        }

        int sum = 0; // Variable to store the total sum of valid numbers

        // Process each command line argument
        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg); // Parse the argument as an integer

                // Check for negative number
                if (num < 0) {
                    throw new IllegalArgumentException("Negative number: " + num);
                }

                // Check for number divisible by 10
                if (num % 10 == 0) {
                    throw new IllegalArgumentException("Number divisible by 10: " + num);
                }

                // Check for number between 1000 and 2000
                if (num > 1000 && num < 2000) {
                    throw new IllegalArgumentException("Number between 1000 and 2000: " + num);
                }

                // Check for number greater than 7000
                if (num > 7000) {
                    throw new IllegalArgumentException("Number greater than 7000: " + num);
                }

                // If no exception is raised, add the number to the sum
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + arg + " is not a valid integer.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + ". Skipping the number.");
            }
        }

        // Print the total sum of valid numbers
        System.out.println("Total sum of valid numbers: " + sum);
    }
}
