package quizes.q3.luka_khelashvili_2;

public class Person {
    String id;
    String name, surname;
    private boolean checkedIn; 
    private boolean checkedOut;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void checkIn() {
        if (!checkedIn) { 
            this.checkedIn = true;
            System.out.println(name + " " + surname + " checked in.");
        } else {
            System.out.println(name + " " + surname + " is already checked in.");
        }
    }

    public void checkOut() {
        if (checkedIn && !checkedOut) { 
            this.checkedOut = true;
            System.out.println(name + " " + surname + " checked out.");
        } else if (!checkedIn) {
            System.out.println(name + " " + surname + " cannot check out without checking in first.");
        } else {
            System.out.println(name + " " + surname + " is already checked out.");
        }
    }
}
