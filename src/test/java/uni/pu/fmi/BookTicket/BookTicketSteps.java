package uni.pu.fmi.BookTicket;

import uni.pu.fmi.models.BookTicket;
import java.sql.Time;
import java.util.Date;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class BookTicketSteps {

    private BookTicketModel model = new BookTicketModel();

    @Given("a movie {string} at {string} venue on {string} date at {string} time")
    public void givenMovieDetails(String movieName, String venue, Date date, Time time) {
        model.setMovieName(movieName);
        model.setDate(date);
        model.setTime(time);
        model.setVenue(venue);
    }

    @When("a user tries to book a seat {char}")
    public void whenUserTriesToBookASeat(char seat) {
        model.setSeat(seat);
        model.bookTicket();
    }

    @Then("the booking should be {string}")
    public void thenTheBookingShouldBe(String expected) {
        boolean expectedBookingResult = Boolean.parseBoolean(expected);
        assertEquals(expectedBookingResult, model.isBookingResult());
    }
}
