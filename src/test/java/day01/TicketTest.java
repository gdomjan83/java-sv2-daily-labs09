package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    Ticket ticket = new Ticket("Edda", LocalDate.of(2021, 11, 5), LocalTime.of(20, 30), 10000);

    @Test
    void testCreate() {
        LocalTime time = LocalTime.of(20, 30);
        assertEquals(time, ticket.getConcertTime());
    }

    @Test
    void testEntry() {
        LocalTime time = LocalTime.of(19, 30);
        assertEquals(time, ticket.entryTime());
    }
}