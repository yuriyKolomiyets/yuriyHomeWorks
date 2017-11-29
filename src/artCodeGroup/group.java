package artCodeGroup;

import car2.Fine;

import java.util.Arrays;
import java.util.Scanner;

public class group {

   Student student1 = new student(0, "Yuriy", "Kolomiyets", "ab@aasd.com", 1988, 1000, 1);
   Student student2 = new student(1, "Olga", "Kolomiyets", "ac@aasd.com", 1988, 1000, 2);

   Scanner scanner = new Scanner(System.in);

   Student student3 = new student();
   student3.setUserId(scanner.nextInt());
   student3.setName(scanner.next());
   student3.setSurname(scanner.next());
   student3.setYearOfBirth(scanner.nextInt());
   student3.setMoneyPaid(scanner.next()); // ?? как дабл ставить
   student3.setCountOfTasks(scanner.nextInt());

    // Student student3 = new student(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());  а хороша попытка была


   // tries to make array of all users

   Student[] students = new Student[2];

   // tries to make newarray of all users + new
   Student[] newStudent = Arrays.copyOf(students, sudent.length+1);
   Student[] students = newStudent; // кажись тут начехлил с переключением ссылки
}
