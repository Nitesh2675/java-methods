import java.util.Scanner;

class ChocolateDistributor {
    // Method to find quotient and remainder when dividing chocolates among children
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();

        // Handling division by zero
        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero.");
        } else {
            // Calling method to find quotient and remainder
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Displaying results
            System.out.println("Each child gets: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        sc.close();
    }
}
