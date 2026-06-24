package src.services;

import src.models.Room;
import java.util.*;

public class RoomService {

    private List<Room> rooms = new ArrayList<>();
    private int nextId = 1;

    public void addRoom(String roomNumber, String roomType, double price) {
        rooms.add(new Room(nextId++, roomNumber, roomType, price));
    }

    public Room findRoom(int id) {
        for (Room room : rooms) {
            if (room.getId() == id) {
                return room;
            }
        }

        return null;
    }

    public int totalRooms() {
        return rooms.size();
    }

    public int countByStatus(String status) {
        int count = 0;

        for (Room room : rooms) {
            if (room.getStatus().equals(status)) {
                count++;
            }
        }

        return count;
    }
}
