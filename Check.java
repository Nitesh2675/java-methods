import java.util.Scanner;

class Check {
    // Method to check if the number is positive, negative, or zero
    public static int checker(int num) {
        if (num > 0) {
            return 1;
        } else if (num < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        
        int num = sc.nextInt();
        int ans = checker(num);

        System.out.println("Result: " + ans);
        
        sc.close(); // Closing the scanner
    }
}
