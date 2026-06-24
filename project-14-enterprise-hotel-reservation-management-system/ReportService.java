package src.services;

public class ReportService {

    private GuestService guestService;
    private RoomService roomService;
    private ReservationService reservationService;

    public ReportService(
            GuestService guestService,
            RoomService roomService,
            ReservationService reservationService) {

        this.guestService = guestService;
        this.roomService = roomService;
        this.reservationService = reservationService;
    }

    public void showDashboard() {

        System.out.println("\n===== HOTEL DASHBOARD =====");
        System.out.println("Guests: " + guestService.totalGuests());
        System.out.println("Rooms: " + roomService.totalRooms());
        System.out.println("Reservations: " + reservationService.totalReservations());
        System.out.println("Active Reservations: " + reservationService.countByStatus("ACTIVE"));
        System.out.println("Cancelled Reservations: " + reservationService.countByStatus("CANCELLED"));
        System.out.println("Available Rooms: " + roomService.countByStatus("AVAILABLE"));
        System.out.println("Occupied Rooms: " + roomService.countByStatus("OCCUPIED"));
    }
}
