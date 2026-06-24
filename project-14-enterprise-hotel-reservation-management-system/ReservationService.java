package src.services;

import src.models.Reservation;
import src.models.Room;
import java.util.*;

public class ReservationService {

    private RoomService roomService;
    private List<Reservation> reservations = new ArrayList<>();
    private int nextId = 1;

    public ReservationService(RoomService roomService) {
        this.roomService = roomService;
    }

    public void bookRoom(
            String guestName,
            int roomId,
            String checkIn,
            String checkOut) {

        Room room = roomService.findRoom(roomId);

        if (room != null && room.getStatus().equals("AVAILABLE")) {
            room.reserve();

            reservations.add(
                    new Reservation(
                            nextId++,
                            guestName,
                            roomId,
                            checkIn,
                            checkOut
                    )
            );
        }
    }

    public Reservation findReservation(int id) {
        for (Reservation reservation : reservations) {
            if (reservation.getId() == id) {
                return reservation;
            }
        }

        return null;
    }

    public void cancelReservation(int id) {
        Reservation reservation = findReservation(id);

        if (reservation != null) {
            reservation.cancel();

            Room room = roomService.findRoom(reservation.getRoomId());

            if (room != null) {
                room.release();
            }
        }
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public int totalReservations() {
        return reservations.size();
    }

    public int countByStatus(String status) {
        int count = 0;

        for (Reservation reservation : reservations) {
            if (reservation.getStatus().equals(status)) {
                count++;
            }
        }

        return count;
    }
}
