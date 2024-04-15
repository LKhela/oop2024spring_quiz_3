package quizes.q3.luka_khelashvili_2;

import java.util.ArrayList;
import java.util.List;

class Room {
    private int roomNumber;
    private List<Person> guests = new ArrayList<>();

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void addGuest(Person guest) {
        guests.add(guest);
    }

    public List<Person> getGuests() {
        return guests;
    }
}