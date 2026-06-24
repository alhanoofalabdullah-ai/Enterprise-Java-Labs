package src.models;

public class Room {

    private int id;
    private String roomNumber;
    private String roomType;
    private double pricePerNight;
    private String status;

    public Room(int id, String roomNumber, String roomType, double pricePerNight) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.status = "AVAILABLE";
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void reserve() {
        status = "OCCUPIED";
    }

    public void release() {
        status = "AVAILABLE";
    }

    @Override
    public String toString() {
        return "Room #" + id
                + " | Number: " + roomNumber
                + " | Type: " + roomType
                + " | Price: " + pricePerNight
                + " | Status: " + status;
    }
}
