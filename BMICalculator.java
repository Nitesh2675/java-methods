import java.util.Scanner;

public class BMICalculator {
    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100; // Convert height to meters
        return weight / (heightM * heightM);
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3]; // 10 rows, 3 columns (Weight, Height, BMI)
        String[] statuses = new String[10];

        // Taking input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
            
            // Calculate BMI
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
            
            // Determine BMI status
            statuses[i] = getBMIStatus(data[i][2]);
        }

        // Display results
        System.out.println("\nWeight (kg) | Height (cm) | BMI | Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f         | %.2f        | %.2f | %s\n", data[i][0], data[i][1], data[i][2], statuses[i]);
        }

        scanner.close();
    }
}
