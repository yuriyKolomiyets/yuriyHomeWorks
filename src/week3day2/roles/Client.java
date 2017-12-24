package week3day2.roles;

import week3day2.Human;
import week3day2.Objects.Equipment;

import java.util.ArrayList;


public class Client extends Human {

    private ArrayList<Equipment> clientsTechnics;
    private int countOfTechnics;

    public Client(String name, int availableMoney) {
        super(name, availableMoney);
    }

    // - сдать товар на ремонт

    // - забрать товар по идентификационному коду
}
