package aco23.week1.day1.test;

import aco23.week1.day1.Airport.Flight;
import aco23.week1.day1.Airport.TimeTable;
import aco23.week1.day1.Passendgers.PassengerList;
import aco23.week1.day1.Passendgers.Passport;
import aco23.week1.day1.Passendgers.User;

import java.util.Date;
import java.util.Scanner;

public class TestAirport {
    public static void main(String[] args) {

        Date date = new Date();

        User user1 = new User(1, "Andrey", new Passport("ME010101", "23.07.1988", "23.07.2019"));
        User user2 = new User(2, "Ivan", new Passport("ME010102", "24.01.1988", "24.07.2019"));
        User user3 = new User(3, "Andrey", new Passport("ME010103", "23.07.1988", "12.01.2018"));

        PassengerList passengerList = new PassengerList();

        passengerList.addUser(user1);
        passengerList.addUser(user2);
        passengerList.addUser(user3);

        Flight flight1 = new Flight(1, "12.01.2018", "Kyiv");
        Flight flight2 = new Flight(2, "13.01.2018", "Kyiv");
        Flight flight3 = new Flight(3, "13.01.2018", "Odessa");
        Flight flight4 = new Flight(4, "14.01.2018", "Odessa");
        Flight flight5 = new Flight(5, "15.01.2018", "Kyiv");

        TimeTable timeTable = new TimeTable();

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
                    "Press 0 to Exit: ");
            int menu = scanner.nextInt();

            if (menu == 1) {

            } else if (menu == 2) {

            } else if (menu == 3) {

            } else if (menu == 4) {

            } else if (menu == 0) {
                menuFlag = false;
            }
        }
    }
}