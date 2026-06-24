package src.controllers;

import src.models.Reservation;
import src.services.*;

public class HotelController {

    private GuestService guestService;
    private RoomService roomService;
    private ReservationService reservationService;
    private ReportService reportService;

    public HotelController(
            GuestService guestService,
            RoomService roomService,
            ReservationService reservationService,
            ReportService reportService) {

        this.guestService = guestService;
        this.roomService = roomService;
        this.reservationService = reservationService;
        this.reportService = reportService;
    }

    public void addGuest(String name, String phone) {
        guestService.addGuest(name, phone);
    }

    public void addRoom(String roomNumber, String roomType, double price) {
        roomService.addRoom(roomNumber, roomType, price);
    }

    public void bookRoom(
            String guestName,
            int roomId,
            String checkIn,
            String checkOut) {

        reservationService.bookRoom(
                guestName,
                roomId,
                checkIn,
                checkOut
        );
    }

    public void cancelReservation(int reservationId) {
        reservationService.cancelReservation(reservationId);
    }

    public void showReservations() {
        System.out.println("\n===== RESERVATIONS =====");

        for (Reservation reservation : reservationService.getReservations()) {
            System.out.println(reservation);
        }
    }

    public void showDashboard() {
        reportService.showDashboard();
    }
}
