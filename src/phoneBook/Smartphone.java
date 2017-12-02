package phoneBook;

import java.util.Scanner;

public class Smartphone {


    public static void main(String[] args) {

        Phonebook phonebook1 = new Phonebook(new Friend[]{
                new Friend(1, "Slava", "0509876543", 1988, 83),
                new Friend(2, "Olga", "9847483", 1988, 55),
                new Friend(3, "Fisa", "2345", 1988, 55)
        });

        Scanner scanner = new Scanner(System.in);

        boolean menuFlag = true;
        while (menuFlag) {

            System.out.println("----" + "\n" +
            "Menu:" + "\n" +
                    "Press 1 to add new friend: " + "\n" +
                    "Press 2 to Print all phonebook: " + "\n" +
                    "Press 3 to Search user in the phonebook: " + "\n" +
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

            if (menu == 0) {
                menuFlag = false;
            }
        }
    }
}
