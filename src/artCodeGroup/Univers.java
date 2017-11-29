package artCodeGroup;

import java.util.Scanner;

public class Univers {
    public static void main(String[] args) {
        Student student1 = new Student(0, "Yuriy", "Kolomiyets", "ab@aasd.com", 1988, 1000, 1);
        Student student2 = new Student(1, "Olga", "Kolomiyets", "ac@aasd.com", 1988, 1000, 2);
        Student students[] = new Student[]{student1,student2};

        Group group = new Group(students);

        Student student3 = new Student(2,"Slava","Bizyanov", "awwe@gmail.com", 1988,2121,2 );
        group.addStudent(student3);

        group.addStudent(new Student(3, "Ivan", "Iakovlev", "asdf@sdfg.ru", 1989, 0, 0));

        Group group2 = new Group(new Student[] {
                new Student(4, "Ivan", "Iakovlev", "asdf@sdfg.ru", 1989, 0, 0),
                new Student(5, "Ivan", "Iakovlev", "asdf@sdfg.ru", 1989, 0, 0)
        });

      //  Double.parseDouble(name)

        // variebles

        Scanner scanner = new Scanner(System.in);

        int firstId = scanner.nextInt();

        new Student (firstId, "Ivan", "Iakovlev", "asdf@sdfg.ru", 1989, 0, 0);


        System.out.println(group2.getCounterNumsofStudent());

        // import scanner
        // create scanner
        // scanner -> variebles
        // setUserId = scanner.next



    }


}
