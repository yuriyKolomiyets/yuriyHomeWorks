package week3day2.roles;

import week3day2.groupsOfPeople.GroupOfClients;
import week3day2.Worker;

public class Admin extends Worker{

    public Admin(String name, int availableMoney, int salary) {
        super(name, availableMoney, salary);
    }

    // - Посмотреть всех клиентов

    public void viewAllClients(GroupOfClients allClients) {
        allClients.printAll();
    }


    // - взять на ремонт технику(цена ремонта = 10% от суммы товара)

    // - показать отчет(количество отремонтированной техники за неделю)

    // - отдать отремонтированный товар клиенту

    // - передать технику специалисту по ремонту
}
