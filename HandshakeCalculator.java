import java.util.Scanner;

class HandshakeCalculator {
    // Method to calculate maximum number of handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Validating input
        if (n < 2) {
            System.out.println("At least two students are required for a handshake.");
        } else {
            // Calculating handshakes
            int maxHandshakes = calculateHandshakes(n);
            
            // Displaying the result
            System.out.println("The maximum number of handshakes among " + n + " students is: " + maxHandshakes);
        }
        
        sc.close();
    }
}
