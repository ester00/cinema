package uni.pu.fmi.models;

import java.sql.Time;
import java.util.*;

public class BookTicket {

    public Character ticketsAvailable;
    public String movieName;
    public Integer showNo;
    public Date date;
    public Time time;
    public String venue;
    public Character seat;
    public Character ticketNo;

    public BookTicket() {
        // Default constructor
    }

    public void UpdateSeatsAvailable() {
        this.ticketsAvailable--;
    }
}
