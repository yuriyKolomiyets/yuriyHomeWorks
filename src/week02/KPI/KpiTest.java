package week02.KPI;

import java.util.ArrayList;


public class KpiTest {
    public static void main(String[] args) {

        Student student1 = new Student("Yuriy", new ArrayList<>(), new Adress("Kyiv", "Street", 22, 2));

        student1.addTheme(new Theme(10, "Geography", 5, 1));
        System.out.println((student1.getThemesList() != null) + " addTheme");

        student1.delTheme("Geography");
        System.out.println((student1.getThemesList().size() == 0) + " delTheme");

        Theme geography = new Theme(10, "Geography", 5, 1);
        student1.addTheme(geography);
        student1.study(geography, 5);
        System.out.println((geography.getHoursSpentForTheme() > 5) + " study");

        System.out.println((student1.averageMark() > 0) + " averageMark");

        geography.passExam();
        System.out.println((geography.getMarkForTheme() != 1) + " passExam");


        student1.addTheme(new Theme(10, "Math", 0, 1));
        student1.showSubjectsInfo();

    }
}
