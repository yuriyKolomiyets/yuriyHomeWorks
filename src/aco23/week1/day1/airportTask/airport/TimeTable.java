package aco23.week1.day1.airportTask.airport;

import java.util.ArrayList;
import java.util.List;

public class TimeTable {

    private List<Flight> flightList;

    public TimeTable() {
    }

    public TimeTable(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }

    public void addFlightToList(Flight flight) {
        flightList.add(flight);
    }

    public void showAll() {
        for (Flight flight: flightList) {
            System.out.println(flight.toString());
        }
    }

    public void showAll(String filterCity) {
        for (Flight flight: flightList) {
            if (flight.getCityOfArrival().equalsIgnoreCase(filterCity)){
                System.out.println(flight.toString());
            }
        }
    }

    public String showFlight(int flightNum) {
        for (Flight flight : flightList) {
            if (flight.getFlightId() == flightNum) {
                return flight.toString();
            }
        }
        return null;
    }
    public String showFlightStatus(int flightNum, String date) {

        // SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        // format.parse(flight.getDateOfFlight()

        for (Flight flight : flightList) {
            if (flight.getFlightId() == flightNum) {
                if ((flight.getDateOfFlight().compareTo(date) > 0)) {
                    return "future flight";
                } else {
                    return "flight in the past";
                }
            }
        }
        return null;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(List<Flight> flightList) {
        this.flightList = flightList;
    }
}
