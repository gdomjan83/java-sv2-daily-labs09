package day01;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {
    private List<Person> attendees = new ArrayList<>();

    public List<Person> getAttendees() {
        return attendees;
    }

    public void addPerson(Person person, LocalTime entryTime) {
        if (person.getTicket().entryTime().isBefore(entryTime)) {
            attendees.add(person);
        } else {
            throw new IllegalArgumentException("Person cannot enter at that time.");
        }
    }
}
