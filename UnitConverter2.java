public class UnitConverter2 {
    private static final double KM_TO_MILES = 0.621371;
    private static final double MILES_TO_KM = 1.60934;
    private static final double METERS_TO_FEET = 3.28084;
    private static final double FEET_TO_METERS = 0.3048;
    private static final double YARDS_TO_FEET = 3;
    private static final double FEET_TO_YARDS = 0.333333;
    private static final double METERS_TO_INCHES = 39.3701;
    private static final double INCHES_TO_METERS = 0.0254;
    private static final double INCHES_TO_CM = 2.54;

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        return km * KM_TO_MILES;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        return meters * METERS_TO_FEET;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        return feet * FEET_TO_METERS;
    }

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        return yards * YARDS_TO_FEET;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        return feet * FEET_TO_YARDS;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        return meters * METERS_TO_INCHES;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        return inches * INCHES_TO_METERS;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        return inches * INCHES_TO_CM;
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println("10 km to miles: " + convertKmToMiles(10));
        System.out.println("5 miles to km: " + convertMilesToKm(5));
        System.out.println("20 meters to feet: " + convertMetersToFeet(20));
        System.out.println("50 feet to meters: " + convertFeetToMeters(50));
        System.out.println("10 yards to feet: " + convertYardsToFeet(10));
        System.out.println("30 feet to yards: " + convertFeetToYards(30));
        System.out.println("5 meters to inches: " + convertMetersToInches(5));
        System.out.println("100 inches to meters: " + convertInchesToMeters(100));
        System.out.println("12 inches to cm: " + convertInchesToCm(12));
    }
}
