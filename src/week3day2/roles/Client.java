package week3day2.roles;

import week3day2.Human;
import week3day2.objects.Equipment;
import week3day2.objects.ServiceCenter;

import java.util.ArrayList;


public class Client extends Human {

    private ArrayList<Equipment> clientsEquipments;
    private int countOfEquipment;


    public Client(String name, int availableMoney, ArrayList<Equipment> clientsEquipments) {
        super(name, availableMoney);
        this.clientsEquipments = clientsEquipments;
    }

    public void buyEquipment(Equipment equipment) {
        clientsEquipments.add(equipment);
        countOfEquipment++;
    }

    public void visitSC(ServiceCenter serviceCenter) {
        for (Equipment equipment : clientsEquipments) {
            if (equipment.isCrash() && equipment.isGuarantee()) {
                serviceCenter.add(equipment);
                serviceCenter.setCountOfEquipment(serviceCenter.getCountOfEquipment()+1);
            }

        }
    }

    // - сдать товар на ремонт



    // - забрать товар по идентификационному коду


    public ArrayList<Equipment> getClientsEquipments() {
        return clientsEquipments;
    }

    public void setClientsEquipments(ArrayList<Equipment> clientsEquipments) {
        this.clientsEquipments = clientsEquipments;
    }

    public int getCountOfEquipment() {
        return countOfEquipment;
    }

    public void setCountOfEquipment(int countOfEquipment) {
        this.countOfEquipment = countOfEquipment;
    }
}
