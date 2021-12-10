package day01;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ticket {
    private String bandName;
    private LocalDate concertDate;
    private LocalTime concertTime;
    private int price;

    public Ticket(String bandName, LocalDate concertDate, LocalTime concertTime, int price) {
        this.bandName = bandName;
        this.concertDate = concertDate;
        this.concertTime = concertTime;
        this.price = price;
    }

    public LocalTime getConcertTime() {
        return concertTime;
    }

    public LocalTime entryTime() {
        return LocalTime.of(concertTime.getHour() - 1, concertTime.getMinute());
    }
}
