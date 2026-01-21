class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378; // Radius of Earth in km
        double pi = Math.PI;

        // Volume in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Convert km^3 to miles^3 (1 mile = 1.6 km)
        double volumeMiles3 = volumeKm3 / Math.pow(1.6, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
                           " and cubic miles is " + volumeMiles3);
    }
}
