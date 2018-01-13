package aco11_1.week3day2.roles;

import aco11_1.week3day2.groupsOfPeople.GroupOfClients;
import aco11_1.week3day2.Worker;
import aco11_1.week3day2.objects.Equipment;
import aco11_1.week3day2.objects.ServiceCenter;

public class Admin extends Worker{

    public Admin(String name, int availableMoney, int salary) {
        super(name, availableMoney, salary);
    }

    // - Посмотреть всех клиентов
    public void viewAllClients(GroupOfClients allClients) {
        allClients.printAll();
    }

    // - передать технику специалисту по ремонту
    public void transferEquipmentToRepairman(ServiceCenter serviceCenter, Repairman repairman) {
        for (Equipment equipment : serviceCenter.getAllEquipmentInSC()) {
            repairman.getWorkFlow().add(equipment);
        }
    }
    // - вернуть отремантированную технику на склад

    public void transferEquipmentToSC(ServiceCenter serviceCenter, Repairman repairman) {
        for (Equipment equipment : repairman.getWorkFlow()) {
            serviceCenter.add(equipment);
            serviceCenter.setCountOfEquipment(serviceCenter.getCountOfEquipment()+1);
        }
    }

}
