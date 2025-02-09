import java.util.Scanner;  // Step 1: Import the Scanner class

public class CircleCalculator {  // Step 2: Define the class
    public static void main(String[] args) {  // Step 3: Main method

        // Step 4: Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Step 5: Prompt the user for the radius
        System.out.print("Enter the radius of the circle: ");

        // Step 6: Read the radius input
        double radius = input.nextDouble();

        // Step 7: Calculate the area of the circle
        double area = Math.PI * Math.pow(radius, 2);

        // Step 8: Calculate the circumference of the circle
        double circumference = 2 * Math.PI * radius;

        // Step 9: Output the results (formatted)
        System.out.printf("Radius: %.2f%n", radius);  // Display the radius
        System.out.printf("Area: %.2f%n", area);      // Display the area
        System.out.printf("Circumference: %.2f%n", circumference);  // Display the circumference

        // Step 10: Close the Scanner object to release resources
        input.close();
    }
}
