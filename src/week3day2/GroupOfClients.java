package week3day2;

import week3day2.roles.Client;

import java.util.ArrayList;

public class GroupOfClients {

    private ArrayList<Client> groupOfClients;
    private int countOfClients;

    public GroupOfClients(ArrayList<Client> groupOfClients) {
        this.groupOfClients = groupOfClients;
    }

    public void printAll() {
        System.out.printf("Total number of clients : %d \n", countOfClients);
        for (Client client : groupOfClients) {
            System.out.println(client.toString());
        }
    }

    public ArrayList<Client> getGroupOfClients() {
        return groupOfClients;
    }

    public void setGroupOfClients(ArrayList<Client> groupOfClients) {
        this.groupOfClients = groupOfClients;
    }

    public int getCountOfClients() {
        return countOfClients;
    }

    public void setCountOfClients(int countOfClients) {
        this.countOfClients = countOfClients;
    }

    public void add(Client client) {
        groupOfClients.add(client);
        countOfClients++;
    }
}
