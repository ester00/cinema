package uni.pu.fmi.models;

import java.sql.Time;

public class CancelTicket {

    public Character ticketNo;
    public Time time;

    public CancelTicket() {
        // Default constructor
    }

    public void UpdateSeatsAvailable() {
        this.ticketNo = null;
    }

    public void ReturnMoneyOnCancelation() {
        System.out.println("Money has been returned.");
    }
}
