package week3day2.tests;

import week3day2.groupsOfPeople.GroupOfClients;
import week3day2.objects.Equipment;
import week3day2.objects.ServiceCenter;
import week3day2.roles.Admin;
import week3day2.roles.Client;
import week3day2.roles.Repairman;

import java.util.ArrayList;

public class TestClients {

    public static void main(String[] args) {
        GroupOfClients allClients = new GroupOfClients(new ArrayList<>());
        Client cl1 = new Client("Anna", 4000, new ArrayList<>());
        Client cl2 = new Client("Ivana", 4000, new ArrayList<>());
        Client cl3 = new Client("Maria", 4000, new ArrayList<>());

        allClients.add(cl1);
        allClients.add(cl2);
        allClients.add(cl3);

        final int SERVICE_CENTER_SIZE = 100;
        ServiceCenter serviceCenter = new ServiceCenter(new ArrayList<Equipment>(SERVICE_CENTER_SIZE));
        Admin ad1 = new Admin("Odmin", 1223, 34);
        Repairman rm1 = new Repairman("Sam", 0, 500, new ArrayList<>());

        Equipment eq1 = new Equipment("Printer", "0001", 500, true, true);
        Equipment eq2 = new Equipment("Scanner", "0002", 600, false, true);
        Equipment eq3 = new Equipment("TV", "0003", 700, true, false);

        Equipment eq4 = new Equipment("Printer", "0001", 100, true, true);
        Equipment eq5 = new Equipment("Scanner", "0002", 200, false, true);
        Equipment eq6 = new Equipment("TV", "0003", 400, true, false);

        Equipment eq7 = new Equipment("Printer", "0001", 500, true, true);
        Equipment eq8 = new Equipment("Scanner", "0002", 500, false, true);
        Equipment eq9 = new Equipment("TV", "0003", 10, true, false);

        cl1.buyEquipment(eq1);
        cl1.buyEquipment(eq2);
        cl1.buyEquipment(eq3);
        cl2.buyEquipment(eq4);
        cl2.buyEquipment(eq5);
        cl2.buyEquipment(eq6);
        cl3.buyEquipment(eq7);
        cl3.buyEquipment(eq8);
        cl3.buyEquipment(eq9);

        //Tests;
        testVisitSC(cl1, serviceCenter);
        testTransferEquipmentToRepairman(serviceCenter, rm1, ad1);
        testRepairAllEquipment(rm1);
        testPickUpEquipment(cl1, serviceCenter, "001");
        System.out.println("---");
        ad1.viewAllClients(allClients);
    }

    private static void testPickUpEquipment(Client client, ServiceCenter serviceCenter, String equipmentCode) {
        client.pickUpEquipment(serviceCenter, equipmentCode);
        System.out.println((client.getCountOfEquipment() == 3) + " testPickUpEquipment");
    }


    private static void testRepairAllEquipment(Repairman repairman) {
        int crashCheckCounter = 0;
        repairman.repairAllEquipment();
        for (Equipment equipment : repairman.getWorkFlow()) {
            if (equipment.isCrash()) {
                crashCheckCounter++;
            }
        }
        System.out.println((crashCheckCounter == 0) + " testRepairAllEquipment");
    }

    private static void testTransferEquipmentToRepairman(ServiceCenter serviceCenter, Repairman repairman, Admin admin) {
        admin.transferEquipmentToRepairman(serviceCenter, repairman);
        System.out.println((repairman.getWorkFlow().size() == 1) + " testTransferEquipmentToRepairman");
    }

    private static void testVisitSC(Client cl1, ServiceCenter serviceCenter) {
        cl1.visitSC(serviceCenter, cl1);
        System.out.println(((serviceCenter.getCountOfEquipment() == 1) && (serviceCenter.getBankAccount() == 50)) + " testVisitSC");
    }
}
