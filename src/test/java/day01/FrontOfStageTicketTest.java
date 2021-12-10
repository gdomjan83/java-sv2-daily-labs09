package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.LocalTime;

class FrontOfStageTicketTest {

    FrontOfStageTicket ticket = new FrontOfStageTicket("Edda", LocalDate.of(2020, 6, 25),
            LocalTime.of(18, 15), 12000, "SEI454");

    @Test
    void testEntry() {
        LocalTime entry = LocalTime.of(16, 15);
        assertEquals(entry, ticket.entryTime());
    }
}