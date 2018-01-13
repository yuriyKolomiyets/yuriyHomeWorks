package aco11_1.week3day2.tests;

import aco11_1.week3day2.groupsOfPeople.GroupOfWorkers;
import aco11_1.week3day2.roles.Admin;
import aco11_1.week3day2.roles.Director;
import java.util.ArrayList;

public class TestWorkers {
    public static void main(String[] args) {
        GroupOfWorkers groupOfWorkers = new GroupOfWorkers(new ArrayList<>());
        Admin wr1 = new Admin("Slava", 1000, 3500);
        Director wr2 = new Director("Oleg", 1000, 3000);
        Director wr3 = new Director("Iurii", 1000, 2000);

        groupOfWorkers.addWorker(wr1);

       testChangeAddress(wr2, groupOfWorkers);
        testAddWorker(wr2, groupOfWorkers);
        testFireWorker(wr3, groupOfWorkers);
        testPayTaxes(wr2, groupOfWorkers);
        testRaiseSalary(wr2, groupOfWorkers);
        testPaySalary(wr2, groupOfWorkers);
        testPrintAllWorkers(wr2, groupOfWorkers);
        //groupOfWorkers.setAdress("234567");
    }

    private static void testPaySalary(Director director, GroupOfWorkers groupOfWorkers) {
        director.paySalary(groupOfWorkers);
        System.out.println((groupOfWorkers.getGroupOfWorkers().get(1).getAvailableMoney() == 3000) + " testPaySalary");
    }

    private static void testRaiseSalary(Director director, GroupOfWorkers groupOfWorkers) {
        director.raiseWorkersSalary(groupOfWorkers);
        System.out.println((groupOfWorkers.getGroupOfWorkers().get(1).getSalary() == 3300) + " testRaiseSalary");
    }

    private static void testPayTaxes(Director director, GroupOfWorkers groupOfWorkers) {
        director.payTaxes(groupOfWorkers);
        System.out.println((groupOfWorkers.getGroupOfWorkers().get(1).getAvailableMoney() == -300) + " testPayTaxes");
    }

    private static void testPrintAllWorkers(Director director, GroupOfWorkers groupOfWorkers) {
        director.viewAllWorkers(groupOfWorkers);
    }

    private static void testFireWorker(Director director, GroupOfWorkers groupOfWorkers) {
        director.addWorker(groupOfWorkers, director);
        director.fireWorker(groupOfWorkers, director);
        System.out.println(!groupOfWorkers.getGroupOfWorkers().get(1).getName().equals("Iurii") + " testFireWorker");
    }

    private static void testAddWorker(Director director, GroupOfWorkers groupOfWorkers) {
        director.addWorker(groupOfWorkers, director);
        System.out.println(groupOfWorkers.getGroupOfWorkers().get(1).getName().equals("Oleg") + " testAddWorker");
    }

    private static void testChangeAddress(Director director, GroupOfWorkers groupOfWorkers) {
        director.changeAddress(groupOfWorkers, "Vokzalna");
        System.out.println(groupOfWorkers.getAddress().equals("Vokzalna") + " testChangeAddress");
    }
}
