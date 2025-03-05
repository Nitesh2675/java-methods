import java.util.Scanner;

public class SumNaturalNumbers {
    // Recursive method to find sum of n natural numbers
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

    // Method to find sum using formula n*(n+1)/2
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        // Check if input is a natural number
        if (n <= 0) {
            System.out.println("Invalid input! Please enter a natural number (greater than 0). Exiting...");
            return;
        }
        
        int sumRec = sumRecursive(n);
        int sumForm = sumFormula(n);
        
        System.out.println("Sum using Recursion: " + sumRec);
        System.out.println("Sum using Formula: " + sumForm);
        
        // Compare results
        if (sumRec == sumForm) {
            System.out.println("Both computations match! The result is correct.");
        } else {
            System.out.println("Mismatch in results! There might be an error.");
        }
        
        scanner.close();
    }
}
