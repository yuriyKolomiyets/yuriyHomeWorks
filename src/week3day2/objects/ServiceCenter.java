package week3day2.objects;

import java.util.ArrayList;

public class ServiceCenter {
    private ArrayList<Equipment> allEquipmentInSC;
    private int countOfEquipment;

    public ServiceCenter(ArrayList<Equipment> allEquipmentInSC) {
        this.allEquipmentInSC = allEquipmentInSC;
    }

    public ArrayList<Equipment> getAllEquipmentInSC() {
        return allEquipmentInSC;
    }

    public void setAllEquipmentInSC(ArrayList<Equipment> allEquipmentInSC) {
        this.allEquipmentInSC = allEquipmentInSC;
    }

    public int getCountOfEquipment() {
        return countOfEquipment;
    }

    public void setCountOfEquipment(int countOfEquipment) {
        this.countOfEquipment = countOfEquipment;
    }

    public void add(Equipment equipment) {
        allEquipmentInSC.add(equipment);
    }
}
