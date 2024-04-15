package quizes.q3.luka_khelashvili_2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelManager {
    private List<Room> rooms = new ArrayList<>();

    public void assignRoom(Person person, Room room) {
        room.addGuest(person);
        
        boolean roomExists = false;
        for (Room existingRoom : rooms) {
            if (existingRoom.getRoomNumber() == room.getRoomNumber()) {
                roomExists = true;
                break;
            }
        }

        if (!roomExists) {
            rooms.add(room);
        }

        System.out.println(person.getName() + " " + person.getSurname() + " has been assigned to Room " + room.getRoomNumber());
    }

    public void displayInfo() {
        for (Room room : rooms) {
            System.out.println("Room Number: " + room.getRoomNumber());
            for (Person guest : room.getGuests()) {
                System.out.println("Guest ID: " + guest.getId() + ", Guest Name: " + guest.getName() + " " + guest.getSurname());
            }
        }
    }
}