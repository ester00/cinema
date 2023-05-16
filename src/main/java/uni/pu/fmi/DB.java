package uni.pu.fmi;

import uni.pu.fmi.models.*;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DB {
    public static List<User> users;
    public static List<Movie> movies;
    public static List<BookTicket> bookedTickets;
    public static List<MakePayment> payments;
    public static List<CancelTicket> cancelledTickets;

    static {
        users = new ArrayList<>();
        User user = new User();
        user.id = '1';
        user.firstName = "John";
        user.lastName = "Doe";
        user.gsm = "1234567890";
        users.add(user);

        movies = new ArrayList<>();
        Movie movie = new Movie();
        movie.id = '1';
        movie.movieName = 'A';
        movie.movieShow = new Time(System.currentTimeMillis());
        movie.venue = 'A';
        movies.add(movie);

        bookedTickets = new ArrayList<>();
        BookTicket bookTicket = new BookTicket();
        bookTicket.ticketsAvailable = 'A';
        bookTicket.movieName = "Movie 1";
        bookTicket.showNo = 1;
        bookTicket.date = new Date(System.currentTimeMillis());
        bookTicket.time = new Time(System.currentTimeMillis());
        bookTicket.venue = "Venue 1";
        bookTicket.seat = 'A';
        bookTicket.ticketNo = 'A';
        bookedTickets.add(bookTicket);

        payments = new ArrayList<>();
        MakePayment payment = new MakePayment();
        payment.id = '1';
        payment.amount = 100.0f;
        payment.transactionId = 1;
        payment.userId = '1';
        payments.add(payment);

        cancelledTickets = new ArrayList<>();
        CancelTicket cancelTicket = new CancelTicket();
        cancelTicket.ticketNo = 'A';
        cancelTicket.time = new Time(System.currentTimeMillis());
        cancelledTickets.add(cancelTicket);
    }

}
