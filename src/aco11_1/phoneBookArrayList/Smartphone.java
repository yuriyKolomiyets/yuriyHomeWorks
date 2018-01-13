package aco11_1.phoneBookArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Smartphone {

    public static void main(String[] args) {

        Phonebook phonebook1 = new Phonebook(0, new ArrayList<Friend>() );
        Scanner scanner = new Scanner(System.in);

        boolean menuFlag = true;
        while (menuFlag) {

            System.out.println("----" + "\n" +
                    "Menu:" + "\n" +
                    "Press 1 to add new friend: " + "\n" +
                    "Press 2 to Print all phonebook: " + "\n" +
                    "Press 3 to Search user in the phonebook: " + "\n" +
                    "Press 4 to Del user in the phonebook: " + "\n" +
                    "Press 5 to Generate users, and add them to the phonebook: " + "\n" +
                    "Press 0 to Exit: "

            );
            int menu = scanner.nextInt();
            if (menu == 1) {

                System.out.println("Enter user id: "); int userId = scanner.nextInt();
                System.out.println("Enter user name: "); String userName = scanner.next();
                System.out.println("Enter user phone num: "); String userPhoneNumber = scanner.next();
                System.out.println("Enter user yob: ");  int userYearOfBirth = scanner.nextInt();
                System.out.println("Enter user weight: "); String tempWeight = scanner.next();
                double userWeight = Double.parseDouble(tempWeight);

                phonebook1.addUser(new Friend(userId, userName, userPhoneNumber, userYearOfBirth, userWeight));
                phonebook1.printAll();
            }

            if (menu == 2) {
                phonebook1.printAll();
            }

            if (menu == 3) {
                System.out.println("Enter user name for seach:");
                String name = scanner.next();
                phonebook1.searchUser(name);
            }

            if (menu == 4) {
                System.out.println("Enter user name for del:");
                String delName = scanner.next();
                phonebook1.delUser(delName);
            }

            if (menu == 5) {
                System.out.println("Enter number of users to generate:");

                int numGenerate = scanner.nextInt();
                phonebook1.generateNewUsers(numGenerate);
            }


            if (menu == 0) {
                menuFlag = false;
            }
        }
    }
}
