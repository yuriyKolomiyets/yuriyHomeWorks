package artCodeGroup;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class Univers {
    public static void main(String[] args) {
        /*Student student1 = new Student(0, "Yuriy", "Kolomiyets", "ab@aasd.com", 1988, 1000, 1);
        Student student2 = new Student(1, "Olga", "Kolomiyets", "ac@aasd.com", 1988, 1000, 2);
        Student students[] = new Student[]{student1,student2};

        Group group = new Group(students);

        Student student3 = new Student(2,"Slava","Bizyanov", "awwe@gmail.com", 1988,2121,2 );
        group.addStudent(student3);

        group.addStudent(new Student(3, "Ivan", "Iakovlev", "asdf@sdfg.ru", 1989, 0, 0));*/

        //add variebles for 3 students

        Scanner scanner = new Scanner(System.in);

        System.out.println("First student");
        System.out.print("Enter user id:");
        int idFirstStudent = scanner.nextInt();
        System.out.print("Enter user name:");
        String nameFirdstStudent = scanner.next();
        System.out.print("Enter user surname:");
        String surnameFirdstStudent = scanner.next();
        System.out.print("Enter user email:");
        String emailFirdstStudent = scanner.next();
        System.out.print("Enter money:");
        String moneyFirdstStudent = scanner.next();
        double moneyFirst = Double.parseDouble(moneyFirdstStudent);

        System.out.println("Second student");
        System.out.print("Enter user id:");
        int idSecondStudent = scanner.nextInt();
        System.out.print("Enter user name:");
        String nameSecondStudent = scanner.next();
        System.out.print("Enter user surname:");
        String surnameSecondStudent = scanner.next();
        System.out.print("Enter user email:");
        String emailSeondStudent = scanner.next();
        System.out.print("Enter money:");
        String moneySecondStudent = scanner.next();
        double moneySecond = Double.parseDouble(moneySecondStudent);

        System.out.println("Third student");
        System.out.print("Enter user id:");
        int idThirdStudent = scanner.nextInt();
        System.out.print("Enter user name:");
        String nameThirdStudent = scanner.next();
        System.out.print("Enter user surname:");
        String surnameThirdStudent = scanner.next();
        System.out.print("Enter user email:");
        String emailThirdStudent = scanner.next();
        System.out.print("Enter money:");
        String moneyThirdStudent = scanner.next();
        double moneyThird = Double.parseDouble(moneyThirdStudent);


        Group group1 = new Group(new Student[]{
                new Student(idFirstStudent, nameFirdstStudent, surnameFirdstStudent, emailFirdstStudent, 1989, 0, 0),
                new Student(idSecondStudent, nameSecondStudent, surnameSecondStudent, emailSeondStudent, 1989, 0, 0),
                new Student(idThirdStudent, nameThirdStudent, surnameThirdStudent, emailThirdStudent, 1989, 0, 0),
                new Student(4, "Ivan", "Iakovlev", "asdf@sdfg.ru", 1989, 0, 0),
                new Student(5, "Ivan", "Iakovlev", "asdf@sdfg.ru", 1989, 0, 0),
        });

        System.out.println("Total students in the group: " + group1.getCounterNumsofStudent());

        System.out.println("let's print all of them:");
        group1.printAllStudent();

        System.out.println("let's search student:");
        group1.searchStudent();
        System.out.println("let's del student:");
        group1.deleteStudent();
        System.out.println("Total students in the group: " + group1.getCounterNumsofStudent());

        System.out.println("let's print all of them:");
        group1.printAllStudent();

    }

}

