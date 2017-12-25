package week3day2.roles;

import week3day2.objects.Equipment;

import java.util.ArrayList;

public class Repairman extends week3day2.Worker {

    private ArrayList<Equipment> workFlow;

    public Repairman(String name, int availableMoney, int salary, ArrayList<Equipment> workFlow) {
        super(name, availableMoney, salary);
        this.workFlow = workFlow;
    }

    public void repairEquipment(Equipment equipment){
        equipment.setCrash(false);
    }
    public void repairAllEquipment() {
        for (Equipment equipment: workFlow) {
            repairEquipment(equipment);
        }
    }

    public ArrayList<Equipment> getWorkFlow() {
        return workFlow;
    }

    public void setWorkFlow(ArrayList<Equipment> workFlow) {
        this.workFlow = workFlow;
    }

}
