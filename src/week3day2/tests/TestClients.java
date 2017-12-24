package week3day2.tests;

import week3day2.groupsOfPeople.GroupOfClients;
import week3day2.roles.Admin;
import week3day2.roles.Client;

import java.util.ArrayList;

public class TestClients {

    public static void main(String[] args) {
        GroupOfClients allClients = new GroupOfClients(new ArrayList<>());
        Client cl1 = new Client("Anna", 4000);
        Client cl2 = new Client("Ivana", 4000);
        Client cl3 = new Client("Maria", 4000);

        allClients.add(cl1);
        allClients.add(cl2);
        allClients.add(cl3);

        Admin ad1 = new Admin("Odmin", 1223, 34);
        ad1.viewAllClients(allClients);

    }
}
