package src.models;

public class Reservation {

    private int id;
    private String guestName;
    private int roomId;
    private String checkIn;
    private String checkOut;
    private String status;

    public Reservation(
            int id,
            String guestName,
            int roomId,
            String checkIn,
            String checkOut) {

        this.id = id;
        this.guestName = guestName;
        this.roomId = roomId;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.status = "ACTIVE";
    }

    public int getId() {
        return id;
    }

    public int getRoomId() {
        return roomId;
    }

    public String getStatus() {
        return status;
    }

    public void cancel() {
        status = "CANCELLED";
    }

    @Override
    public String toString() {
        return "Reservation #" + id
                + " | Guest: " + guestName
                + " | Room ID: " + roomId
                + " | Check-In: " + checkIn
                + " | Check-Out: " + checkOut
                + " | Status: " + status;
    }
}
