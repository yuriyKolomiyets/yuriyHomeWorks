package artCodeGroup;

import java.util.Arrays;

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