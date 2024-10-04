package assignment2;

class Distance {
    private double miles;

    public Distance(double miles) {
        this.miles = miles;
    }

    public void travelTime() {
        double speedMph = 60;  // speed in miles per hour
        double timeHours = miles / speedMph;
        System.out.println("Time to cover " + miles + " miles at " + speedMph + " mph: " + timeHours + " hours");
    }
}

class DistanceMKS extends Distance {
    private double kilometers;

    public DistanceMKS(double kilometers) {
        super(0);  // Call the parent constructor with a dummy value
        this.kilometers = kilometers;
    }

    @Override
    public void travelTime() {
        double speedKmps = 100;  // speed in kilometers per second
        double timeSeconds = kilometers / speedKmps;
        System.out.println("Time to cover " + kilometers + " kilometers at " + speedKmps + " km/s: " + timeSeconds + " seconds");
    }
}

// Demonstration
public class Main12 {
    public static void main(String[] args) {
        Distance distanceMiles = new Distance(120);
        distanceMiles.travelTime();

        DistanceMKS distanceKilometers = new DistanceMKS(300);
        distanceKilometers.travelTime();
    }
}



