package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testSimpleTicket() {
        Person person = new Person(new Ticket("Edda", LocalDate.of(2021, 11, 5),
                LocalTime.of(20, 30), 10000));
        assertEquals(LocalTime.of(20, 30), person.getTicket().getConcertTime());
    }

    @Test
    void testFrontOfStageTicket() {
        Person person = new Person(new FrontOfStageTicket("Edda", LocalDate.of(2021, 11, 5),
                LocalTime.of(20, 30), 10000, "AEIKK20"));
        assertEquals(LocalTime.of(20, 30), person.getTicket().getConcertTime());
    }
}