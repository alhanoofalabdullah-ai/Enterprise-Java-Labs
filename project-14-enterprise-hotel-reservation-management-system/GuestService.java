package src.services;

import src.models.Guest;
import java.util.*;

public class GuestService {

    private List<Guest> guests = new ArrayList<>();
    private int nextId = 1;

    public void addGuest(String name, String phone) {
        guests.add(new Guest(nextId++, name, phone));
    }

    public int totalGuests() {
        return guests.size();
    }
}
