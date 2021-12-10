package day01;

import java.time.LocalDate;
import java.time.LocalTime;

public class FrontOfStageTicket extends Ticket {
    private String extraCode;

    public FrontOfStageTicket(String bandName, LocalDate concertDate, LocalTime concertTime, int price, String extraCode) {
        super(bandName, concertDate, concertTime, price);
        this.extraCode = extraCode;
    }

    @Override
    public LocalTime entryTime() {
        return LocalTime.of(getConcertTime().getHour() - 2, getConcertTime().getMinute());
    }
}
