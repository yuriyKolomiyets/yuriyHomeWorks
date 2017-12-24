package week3day2.groupsOfPeople;

import week3day2.Worker;
import week3day2.roles.Director;

import java.util.ArrayList;

public class GroupOfWorkers {
   private ArrayList<Worker> groupOfWorkers;
   private int countOfWorkers;
   private String address;

    public GroupOfWorkers(ArrayList<Worker> groupOfWorkers) {
        this.groupOfWorkers = groupOfWorkers;
    }

    public void addWorker(Worker worker) {
        groupOfWorkers.add(worker);
        setCountOfWorkers(getCountOfWorkers()+1);
    }

    public void removeWorker(Worker worker) {
        groupOfWorkers.remove(worker);
        setCountOfWorkers(getCountOfWorkers()-1);
    }
    public void printAll() {
        System.out.printf("Total number of workers : %d \n", countOfWorkers);
        for (Worker worker : groupOfWorkers) {
            System.out.println(worker.toString());
        }
    }

    public ArrayList<Worker> getGroupOfWorkers() {
        return groupOfWorkers;
    }

    public void setGroupOfWorkers(ArrayList<Worker> groupOfWorkers) {
        this.groupOfWorkers = groupOfWorkers;
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        this.countOfWorkers = countOfWorkers;
    }

    public String getAddress() {
        return address;
    }

    public void setAdress(String address, Object whoCallMe) {
        if (whoCallMe instanceof Director) {
            this.address = address;
        }
    }

}
