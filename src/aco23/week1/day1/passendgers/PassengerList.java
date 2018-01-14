package aco23.week1.day1.passendgers;

import java.util.ArrayList;
import java.util.List;

public class PassengerList {

    private List<User> passengerList;

    public PassengerList() {
    }

    public PassengerList(List<User> passengerList) {
        this.passengerList = passengerList;
    }

    public void addUser(User user) {
        passengerList.add(user);
    }

    public List<User> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<User> passengerList) {
        this.passengerList = passengerList;
    }
}
