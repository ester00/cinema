package uni.pu.fmi.BookTicket;

import uni.pu.fmi.controllers.BookTicketController;

import java.sql.Time;
import java.util.Date;

public class BookTicketModel {

    private String movieName;
    private Date date;
    private Time time;
    private String venue;
    private Character seat;
    private boolean bookingResult;


    // getters and setters

    public void bookTicket() {
        BookTicketController bookTicketController = new BookTicketController();
        this.bookingResult = bookTicketController.bookTicket(movieName, date, time, venue, seat);
    }public BookTicketModel() {
        // Initialize bookingResult to false
        this.bookingResult = false;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public void setSeat(Character seat) {
        this.seat = seat;
        // Logic for booking a seat and setting bookingResult should go here
    }

    public boolean isBookingResult() {
        return bookingResult;
    }

}
