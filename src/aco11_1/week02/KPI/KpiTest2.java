package aco11_1.week02.KPI;
import java.util.ArrayList;

public class KpiTest2 {

    public static void main(String[] args) {
        testAddTheme();
        testDelTheme();
        testStudy();
        testAverageMark();
        testPassExam();
    }

    private static void testPassExam() {
        Student student1 = new Student("Yuriy", new ArrayList<Theme>(), new Adress("Kyiv", "Street", 22, 2));
        Theme geography = new Theme(10, "Geography", 5, 1);
        student1.addTheme(geography);
        geography.passExam();
        System.out.println((geography.getMarkForTheme() != 1) + " passExam");
    }

    private static void testAverageMark() {

        Student student1 = new Student("Yuriy", new ArrayList<Theme>(), new Adress("Kyiv", "Street", 22, 2));
        Theme geography = new Theme(10, "Geography", 5, 1);
        student1.addTheme(geography);
        Theme math = new Theme(10, "Geography", 5, 2);
        student1.addTheme(math);
        System.out.println((student1.averageMark() > 0) + " averageMark");
    }

    private static void testStudy() {
        Student student1 = new Student("Yuriy", new ArrayList<Theme>(), new Adress("Kyiv", "Street", 22, 2));
        Theme geography = new Theme(10, "Geography", 5, 1);
        student1.addTheme(geography);
        student1.study(geography, 5);
        System.out.println((geography.getHoursSpentForTheme() > 5) + " study");
    }

    private static void testDelTheme() {
        Student student1 = new Student("Yuriy", new ArrayList<Theme>(), new Adress("Kyiv", "Street", 22, 2));
        student1.addTheme(new Theme(10, "Geography", 5, 1));
        student1.delTheme("Geography");
        System.out.println((student1.getThemesList().size() == 0) + " delTheme");
    }

    private static void testAddTheme() {
        Student student1 = new Student("Yuriy", new ArrayList<Theme>(), new Adress("Kyiv", "Street", 22, 2));
        student1.addTheme(new Theme(10, "Geography", 5, 1));
        System.out.println((student1.getThemesList() != null) + " addTheme");
    }
}
