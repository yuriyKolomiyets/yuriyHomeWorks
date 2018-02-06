package aco23.week1.day1.airportTask.test;

import aco23.week1.day1.airportTask.airport.Flight;
import aco23.week1.day1.airportTask.airport.TimeTable;
import aco23.week1.day1.airportTask.passendgers.PassengerList;
import aco23.week1.day1.airportTask.passendgers.Passport;
import aco23.week1.day1.airportTask.passendgers.User;

import java.util.ArrayList;
import java.util.Scanner;

public class TestAirport {
    public static void main(String[] args) {

        //  Date date = new Date();

        String date = "13.01.2018";

        User user1 = new User(1, "Andrey", new Passport("ME010101", "23.07.1988", "23.07.2019"));
        User user2 = new User(2, "Ivan", new Passport("ME010102", "24.01.1988", "24.07.2019"));
        User user3 = new User(3, "Andrey", new Passport("ME010103", "23.07.1988", "12.01.2018"));

        PassengerList passengerList = new PassengerList(new ArrayList<>());

        passengerList.addUser(user1);
        passengerList.addUser(user2);
        passengerList.addUser(user3);

        Flight flight1 = new Flight(1, "12.01.2018", "Kyiv");
        Flight flight2 = new Flight(2, "13.01.2018", "Kyiv");
        Flight flight3 = new Flight(3, "13.01.2018", "Odessa");
        Flight flight4 = new Flight(4, "14.01.2018", "Odessa");
        Flight flight5 = new Flight(5, "15.01.2018", "Kyiv");

        TimeTable timeTable = new TimeTable(new ArrayList<>());
        flight1.setFlightPassengersList(new ArrayList<>());

        timeTable.addFlightToList(flight1);
        timeTable.addFlightToList(flight2);
        timeTable.addFlightToList(flight3);
        timeTable.addFlightToList(flight4);
        timeTable.addFlightToList(flight5);

        Scanner scanner = new Scanner(System.in);
        boolean menuFlag = true;
        while (menuFlag) {
            System.out.println("----" + "\n" +
                    "Menu:" + "\n" +
                    "Press 1 to Show all flight range by time: " + "\n" +
                    "Press 2 to Show all flight filtered by city: " + "\n" +
                    "Press 3 to Make Check-in: " + "\n" +
                    "Press 4 to Show my flight: " + "\n" +
                    "Press 5 to Run Tests: " + "\n" +
                    "Press 0 to Exit: ");
            int menu = scanner.nextInt();

            if (menu == 1) {
                timeTable.showAll();

            } else if (menu == 2) {
                System.out.println("Enter city to filter: ");
                String filterCity = scanner.next();
                timeTable.showAll(filterCity);

            } else if (menu == 3) {
                System.out.println("Enter your id to checkIn: ");
                int checkInId = scanner.nextInt();

                flight1.checkIn(checkInId, passengerList);

            } else if (menu == 4) {
                System.out.println("Enter your flight number: ");
                int flightNum = scanner.nextInt();
                System.out.println(timeTable.showFlight(flightNum) + "Flight status: " + timeTable.showFlightStatus(flightNum, date));

            } else if (menu == 5) {

                checkInTest(flight1, passengerList);
                flightStatusTest(date, timeTable);

            } else if (menu == 0) {
                menuFlag = false;
            }
        }
    }
    public static void checkInTest(Flight flight1, PassengerList passengerList) {
        flight1.checkIn(1, passengerList);
        System.out.println((flight1.getFlightPassengersList().size() == 1) + " checkInTest");
    }

    private static void flightStatusTest(String date, TimeTable timeTable) {
        System.out.println((timeTable.showFlightStatus(1, date).equalsIgnoreCase("flight in the past")) + " flightStatusTest");
    }
}