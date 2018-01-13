package aco23.week1.day1.airport;

import aco23.week1.day1.passendgers.PassengerList;
import aco23.week1.day1.passendgers.User;

import java.util.ArrayList;

public class Flight {

    private int flightId;
    private String dateOfFlight;
    private String cityOfArrival;
    private ArrayList<User> flightPassengersList;

    public Flight(int flightId, String dateOfFlight, String cityOfArrival) {
        this.flightId = flightId;
        this.dateOfFlight = dateOfFlight;
        this.cityOfArrival = cityOfArrival;
    }


    public int getFlightId() {
        return flightId;
    }

    @Override
    public String toString() {
        return "Flight details: {" +
                "flightId: " + flightId +
                ", dateOfFlight: '" + dateOfFlight + '\'' +
                ", cityOfArrival: '" + cityOfArrival + '\'' +
                '}';
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public void checkIn(int checkInId, PassengerList passengerList) {
        for (User user : passengerList.getPassengerList()) {
            if (user.getUserId() == checkInId) {
                flightPassengersList.add(user);
            }
        }
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

    public ArrayList<User> getFlightPassengersList() {
        return flightPassengersList;
    }

    public void setFlightPassengersList(ArrayList<User> flightPassengersList) {
        this.flightPassengersList = flightPassengersList;
    }
}
