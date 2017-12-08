package phoneBookArrayList;

import java.util.ArrayList;

public class SmartphoneTest {

    public static void main(String[] args) {
        Phonebook phonebook1 = new Phonebook(0, new ArrayList<Friend>());


        phonebook1.addUser(new Friend(1, "Yuriy",
                "+380663323432", 1980,
                88.5));
        System.out.println((phonebook1.getCountOfFriends() != 0) + " addUser");

        phonebook1.generateNewUsers(5);
        System.out.println((phonebook1.getCountOfFriends() == 6) + " generateNewUsers");

        phonebook1.delUser("Yuriy");
        System.out.println((phonebook1.getCountOfFriends() != 6) + " delUser");

    }
}
