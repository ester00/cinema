package uni.pu.fmi.controllers;

import uni.pu.fmi.models.BookTicket;
import uni.pu.fmi.DB;
import java.sql.Time;
import java.util.Date;

public class BookTicketController {

    public boolean bookTicket(String movieName, Date date, Time time, String venue, char seat) {
        // Check if there are any tickets available
        for (BookTicket bookTicket : DB.bookedTickets) {
            if (bookTicket.movieName.equals(movieName) && bookTicket.date.equals(date)
                    && bookTicket.time.equals(time) && bookTicket.venue.equals(venue)
                    && bookTicket.seat == seat) {
                return false; // Seat already booked
            }
        }

        // If the seat is available, book the ticket
        BookTicket newTicket = new BookTicket();
        newTicket.movieName = movieName;
        newTicket.date = date;
        newTicket.time = time;
        newTicket.venue = venue;
        newTicket.seat = seat;
        newTicket.ticketNo = (char)(DB.bookedTickets.size() + 65); // Generate a new ticket number based on the size of the list
        DB.bookedTickets.add(newTicket);

        return true; // Ticket successfully booked
    }
}
