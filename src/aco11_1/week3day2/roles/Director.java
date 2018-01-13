package aco11_1.week3day2.roles;

import aco11_1.week3day2.groupsOfPeople.GroupOfWorkers;
import aco11_1.week3day2.Worker;

public class Director extends Worker {

    final int TAXES_COEFFICIENT = 5;

    public Director(String name, int availableMoney, int salary) {
        super(name, availableMoney, salary);
    }

    // - сменить место расположения сервисного центра

    public void changeAddress(GroupOfWorkers groupOfWorkers, String newAddress) {
        groupOfWorkers.setAdress(newAddress);
    }

    //  - нанять

    public void addWorker(GroupOfWorkers groupOfWorkers, Worker worker) {
        groupOfWorkers.addWorker(worker);
    }

    // - уволить сотрудника

    public void fireWorker(GroupOfWorkers groupOfWorkers, Worker worker) {
        groupOfWorkers.removeWorker(worker);
    }
    // - посмотреть всех сотрудников

    public void viewAllWorkers(GroupOfWorkers groupOfWorkers) {
        groupOfWorkers.printAll();
    }
    //  - платить налог

    public void payTaxes(GroupOfWorkers groupOfWorkers) {
        int totalSalary = 0;
        int totalTaxes = 0;
        for (int i = 0; i < groupOfWorkers.getGroupOfWorkers().size(); i++) {
            totalSalary = totalSalary + groupOfWorkers.getGroupOfWorkers().get(i).getSalary();
           totalTaxes = totalSalary/TAXES_COEFFICIENT;
        }
        setAvailableMoney(getAvailableMoney()-totalTaxes);
    }

    // - увеличить зарплату сотрудникам на 10%

    public void raiseWorkersSalary(GroupOfWorkers groupOfWorkers) {
        for (int i = 0; i < groupOfWorkers.getGroupOfWorkers().size(); i++) {
            groupOfWorkers.getGroupOfWorkers().get(i).setSalary(
                                                            groupOfWorkers.getGroupOfWorkers().get(i).getSalary() +
                                                            groupOfWorkers.getGroupOfWorkers().get(i).getSalary()/10);
        }
    }

    // -* заплатить з/п сотрудникам

    public void paySalary(GroupOfWorkers groupOfWorkers){
        for (int i = 0; i < groupOfWorkers.getGroupOfWorkers().size(); i++) {
            groupOfWorkers.getGroupOfWorkers().get(i).setAvailableMoney(
                    groupOfWorkers.getGroupOfWorkers().get(i).getSalary() +
                            groupOfWorkers.getGroupOfWorkers().get(i).getAvailableMoney());
        }
    }
}
