package aco11_1.week3day2.roles;

import aco11_1.week3day2.Human;
import aco11_1.week3day2.objects.Equipment;
import aco11_1.week3day2.objects.ServiceCenter;

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

    // - сдать товар на ремонт (цена ремонта = 10% от суммы товара)

    public void visitSC(ServiceCenter serviceCenter, Client client) {
        int repairPrice = 0;
        for (Equipment equipment : clientsEquipments) {
            if (equipment.isCrash() && equipment.isGuarantee()) {
                serviceCenter.add(equipment);
                serviceCenter.setCountOfEquipment(serviceCenter.getCountOfEquipment()+1);
                repairPrice = equipment.getEquipmentPrice()/10;
                client.setAvailableMoney(client.getAvailableMoney() - repairPrice);
                serviceCenter.setBankAccount(serviceCenter.getBankAccount() + repairPrice);
            }
        }
    }

    // - забрать товар по идентификационному коду

    public void pickUpEquipment(ServiceCenter serviceCenter, String equipmentCode){
        for (Equipment equipment : serviceCenter.getAllEquipmentInSC()) {
            if (equipment.getEquipmentCode().equalsIgnoreCase(equipmentCode)){
                clientsEquipments.add(equipment);
            }
        }
    }

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
