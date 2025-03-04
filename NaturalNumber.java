import java.util.Scanner;

class NaturalNumber {

    public static int calculation(int num) { // Fixed method declaration
        int sum = 0;
        for (int i = 1; i <= num; i++) { // Start from 1
            sum += i;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt(); // Fixed assignment

        int result = calculation(number);
        System.out.println("Sum of natural numbers: " + result); // Fixed output format

        sc.close(); // Close scanner to prevent resource leak
    }
}
