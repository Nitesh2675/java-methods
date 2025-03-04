import java.util.Scanner;

class AthleteRun {
    // Method to calculate the number of rounds needed to complete 5 km
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return 5000 / perimeter; // 5 km = 5000 meters
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking user input for three sides of the triangular park
        System.out.print("Enter the first side of the park (meters): ");
        double side1 = sc.nextDouble();
        
        System.out.print("Enter the second side of the park (meters): ");
        double side2 = sc.nextDouble();
        
        System.out.print("Enter the third side of the park (meters): ");
        double side3 = sc.nextDouble();
        
        // Validating input
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 || (side1 + side2 <= side3) || (side2 + side3 <= side1) || (side1 + side3 <= side2)) {
            System.out.println("Invalid triangle sides. Please enter valid positive values that form a triangle.");
        } else {
            // Calculating rounds needed
            double rounds = calculateRounds(side1, side2, side3);
            
            // Displaying the result
            System.out.println("The athlete needs to complete approximately " + Math.ceil(rounds) + " rounds to complete a 5 km run.");
        }
        
        sc.close();
    }
}
