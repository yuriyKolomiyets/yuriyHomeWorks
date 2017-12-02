package phoneBook;

import java.util.Scanner;

public class Smartphone {


    public static void main(String[] args) {

        Phonebook phonebook1 = new Phonebook(new Friend[]{
                new Friend(1, "Slava", "0509876543", 1988, 83),
                new Friend(2, "Olga", "9847483", 1988, 55),
                new Friend(3, "Fisa", "2345", 1988, 55)
        });

        phonebook1.printAll();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter user name for seach:");
        String name = scanner.next();
        phonebook1.searchUser(name);

        System.out.println("Menu:"+ "\n" +
                "Press 1 to add new friend: " + "\n" +
                "Press 2 to Print all phonebook: " + "\n"


        );
        int menu = scanner.nextInt();
        if (menu == 1) {
            phonebook1.addUser(new Friend(3, "FisaCopy", "2345", 1988, 55));
            phonebook1.printAll();
        }

        if (menu == 2) {
            phonebook1.printAll();
        }
    }
}
