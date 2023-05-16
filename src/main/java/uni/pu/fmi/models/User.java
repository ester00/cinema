package uni.pu.fmi.models;

public class User {

    public Character id;
    public String firstName;
    public String lastName;
    public String gsm;

    public User() {
        // Default constructor
    }

    public void ViewMovies() {
        System.out.println(firstName + " is viewing movies.");
    }

    public void BookTicket() {
        System.out.println(firstName + " booked a ticket.");
    }

    public void MakePayment() {
        System.out.println(firstName + " made a payment.");
    }

    public void CancelTicket() {
        System.out.println(firstName + " cancelled a ticket.");
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
