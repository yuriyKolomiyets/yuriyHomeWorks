package aco11_1.artCodeGroup;

import java.util.Arrays;
import java.util.Scanner;

public class Group {

    private int counterNumsofStudent = 0;
    private Student[] students;



    public Group(Student[] students) {
        this.students = students;
        counterNumsofStudent = students.length;
    }

    void addStudent(Student student) {
        Student[] newStudents = Arrays.copyOf(students, students.length + 1);
        newStudents[newStudents.length - 1] = student;
        students = newStudents;
        counterNumsofStudent++;
    }

    void printAllStudent() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(
                    students[i].getUserId() + " " +
                            students[i].getName() + " " +
                            students[i].getSurname() + " " +
                            students[i].getEmail() + " " +
                            students[i].getYearOfBirth() + " " +
                            students[i].getMoneyPaid() + " "
            );

        }
        System.out.println();
    }

    void searchStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user name:");
        String name = scanner.next();
        for (int d = 0; d < students.length; d++) {
            if (students[d].getName().equals(name)) {
                System.out.println(
                        students[d].getUserId() + " " +
                                students[d].getName() + " " +
                                students[d].getSurname() + " " +
                                students[d].getEmail() + " " +
                                students[d].getYearOfBirth() + " " +
                                students[d].getMoneyPaid() + " ");
            }
        }
    }

    void deleteStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user name to delete:");
        String delName = scanner.next();
        Student[] newStudents = new Student[students.length - 1];
        int index = 0;

        for (int d = 0; d < students.length - 1; d++) {
            if (!students[d].getName().equals(delName)) {

                newStudents[index] = students[d];
                index++;
            }

            students = newStudents;
            counterNumsofStudent--;
        }
    }

    public Student[] getStudents() {
        return students;
    }

    public int getCounterNumsofStudent() {
        return counterNumsofStudent;
    }

    public void setCounterNumsofStudent(int counterNumsofStudent) {
        this.counterNumsofStudent = counterNumsofStudent;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}