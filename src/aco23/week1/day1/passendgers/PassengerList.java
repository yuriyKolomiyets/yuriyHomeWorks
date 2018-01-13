package aco23.week1.day1.passendgers;

import java.util.ArrayList;

public class PassengerList {

    private ArrayList <User> passengerList;

    public PassengerList() {
    }

    public PassengerList(ArrayList<User> passengerList) {
        this.passengerList = passengerList;
    }

    public void addUser(User user) {
        passengerList.add(user);
    }

    public ArrayList<User> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(ArrayList<User> passengerList) {
        this.passengerList = passengerList;
    }
}
