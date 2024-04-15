package quizes.q3.luka_khelashvili_2;

import java.util.ArrayList;
import java.util.List;

import quizes.q3.luka_khelashvili_2.Person;

public class PersonManager {
    public static List<Person> getPersons() {
        List<Person> result = new ArrayList<>();

        String[] lines = Persons.Persons.split("\n");

        for (String line : lines) {
            String[] fields = line.split(",");

            String firstName = fields[0].trim();
            String lastName = fields[1].trim();
            String personalNumber = fields[2].trim();

            Person p = new Person();
            p.setId(personalNumber);
            p.setName(firstName);
            p.setSurname(lastName);

            result.add(p);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Person> persons = getPersons();

        HotelManager hotelManager = new HotelManager();

        Room room = new Room(101);

        if (!persons.isEmpty()) {
            Person luka = new Person();
            luka.setId("123"); 
            luka.setName("Luka");
            luka.setSurname("Khelashvili");

            Person liam = persons.get(0);

            hotelManager.assignRoom(luka, room);
            hotelManager.assignRoom(liam, room);
        } else {
            System.out.println("No persons available to check in.");
        }

        hotelManager.displayInfo();
    }
}