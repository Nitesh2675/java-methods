import java.util.*;

class QuotientReminder {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor; // Fixed variable name
        
        return new int[]{remainder, quotient}; // Fixed return values
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number and divisor: ");

        int number = sc.nextInt();
        int divisor = sc.nextInt();

        int[] result = findRemainderAndQuotient(number, divisor);

        System.out.println("Remainder: " + result[0]); // Fixed output format
        System.out.println("Quotient: " + result[1]);

        sc.close(); // Best practice
    }
}
