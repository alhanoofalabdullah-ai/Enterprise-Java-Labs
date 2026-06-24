package src.models;

public class Trip {

    private int id;
    private int vehicleId;
    private String driverName;
    private String origin;
    private String destination;
    private double distance;
    private String status;

    public Trip(
            int id,
            int vehicleId,
            String driverName,
            String origin,
            String destination,
            double distance) {

        this.id = id;
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.origin = origin;
        this.destination = destination;
        this.distance = distance;
        this.status = "ACTIVE";
    }

    public int getId() {
        return id;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public double getDistance() {
        return distance;
    }

    public String getStatus() {
        return status;
    }

    public void complete() {
        status = "COMPLETED";
    }

    @Override
    public String toString() {
        return "Trip #" + id
                + " | Vehicle: " + vehicleId
                + " | Driver: " + driverName
                + " | From: " + origin
                + " | To: " + destination
                + " | Distance: " + distance
                + " KM | Status: " + status;
    }
}
