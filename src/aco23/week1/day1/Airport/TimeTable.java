package aco23.week1.day1.Airport;

import java.util.ArrayList;

public class TimeTable {

    private ArrayList<Flight> flightList;

    public TimeTable() {
    }

    public void addFlightToList(Flight flight) {
        flightList.add(flight);
    }

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }
}
