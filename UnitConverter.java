public class UnitConverter {
    private static final double KM_TO_MILES = 0.621371;
    private static final double MILES_TO_KM = 1.60934;
    private static final double METERS_TO_FEET = 3.28084;
    private static final double FEET_TO_METERS = 0.3048;

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

    public static void main(String[] args) {
        // Example usage
        System.out.println("10 km to miles: " + convertKmToMiles(10));
        System.out.println("5 miles to km: " + convertMilesToKm(5));
        System.out.println("20 meters to feet: " + convertMetersToFeet(20));
        System.out.println("50 feet to meters: " + convertFeetToMeters(50));
    }
}
