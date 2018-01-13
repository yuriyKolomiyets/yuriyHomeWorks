package aco23.week1.day1.Airport;

public class Flight {

    private int flightId;
    private String dateOfFlight;
    private String cityOfArrival;

    public Flight(int flightId, String dateOfFlight, String cityOfArrival) {
        this.flightId = flightId;
        this.dateOfFlight = dateOfFlight;
        this.cityOfArrival = cityOfArrival;
    }


    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getDateOfFlight() {
        return dateOfFlight;
    }

    public void setDateOfFlight(String dateOfFlight) {
        this.dateOfFlight = dateOfFlight;
    }

    public String getCityOfArrival() {
        return cityOfArrival;
    }

    public void setCityOfArrival(String cityOfArrival) {
        this.cityOfArrival = cityOfArrival;
    }
}
