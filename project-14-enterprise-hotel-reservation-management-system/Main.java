# Main.java

```java
package src;

import src.controllers.HotelController;
import src.services.*;

public class Main {

    public static void main(String[] args) {

        GuestService guestService = new GuestService();
        RoomService roomService = new RoomService();
        ReservationService reservationService = new ReservationService(roomService);

        ReportService reportService =
                new ReportService(
                        guestService,
                        roomService,
                        reservationService
                );

        HotelController controller =
                new HotelController(
                        guestService,
                        roomService,
                        reservationService,
                        reportService
                );

        controller.addGuest("Alhanoof", "0550000001");
        controller.addGuest("Ahmed", "0550000002");
        controller.addGuest("Sara", "0550000003");

        controller.addRoom("101", "Single", 350);
        controller.addRoom("102", "Double", 550);
        controller.addRoom("201", "Suite", 1200);
        controller.addRoom("202", "Executive", 1600);

        controller.bookRoom("Alhanoof", 1, "2026-07-01", "2026-07-05");
        controller.bookRoom("Ahmed", 2, "2026-07-02", "2026-07-04");
        controller.bookRoom("Sara", 3, "2026-07-03", "2026-07-06");

        controller.cancelReservation(2);

        controller.showReservations();
        controller.showDashboard();
    }
}
