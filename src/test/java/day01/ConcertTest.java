package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class ConcertTest {

    Concert concert = new Concert();

    @Test
    void testWrongTicket() {
        Person person = new Person(new Ticket("Edda", LocalDate.of(2020, 12, 10),
                LocalTime.of(20, 20), 10000));
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> concert.addPerson(person, LocalTime.of(18, 20)));
        assertEquals("Person cannot enter at that time.", iae.getMessage());
    }

    @Test
    void testSimpleTicket() {
        Person person = new Person(new Ticket("Edda", LocalDate.of(2020, 12, 10),
                LocalTime.of(20, 20), 10000));
        concert.addPerson(person, LocalTime.of(19, 21));
        assertEquals(1, concert.getAttendees().size());
    }
    @Test
    void testFrontStageTicket() {
        Person person = new Person(new FrontOfStageTicket("Edda", LocalDate.of(2020, 12, 10),
                LocalTime.of(20, 20), 10000, "EIII010"));
        concert.addPerson(person, LocalTime.of(18, 21));
        assertEquals(1, concert.getAttendees().size());
    }



}