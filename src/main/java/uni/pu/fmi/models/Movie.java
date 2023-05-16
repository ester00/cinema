package uni.pu.fmi.models;

import java.sql.Time;

public class Movie {

    public Character id;
    public Character movieName;
    public Time movieShow;
    public Character venue;

    public Movie() {
        // Default constructor
    }

    public void updateDetails() {
        System.out.println("Movie details updated.");
    }
}
