package week02.KPI;

import java.util.ArrayList;


public class Theme {

   /* имя
    количество часов в семестре
    количество проработанных часов студентом
    оценка студента за предмет*/

    private String themeName;
    private int totalHours;
    private int hoursSpentForTheme;
    private int markForTheme;

    public Theme(int totalHours, String themeName, int hoursSpentForTheme, int markForTheme) {
        this.totalHours = totalHours;
        this.themeName = themeName;
        this.hoursSpentForTheme = hoursSpentForTheme;
        this.markForTheme = markForTheme;
    }

   /*методы:
    сдать экзамен
    показать информацию о предмете
    получить оценку студента за предмет*/

    public int passExam() {
        if ((double) hoursSpentForTheme / totalHours > 0.9) {
            markForTheme = 5;
        } else if ((double) hoursSpentForTheme / totalHours > 0.75) {
            markForTheme = 4;
        } else if ((double) hoursSpentForTheme / totalHours > 0.6) {
            markForTheme = 3;
        } else {
            markForTheme = 2;
        }
        return markForTheme;
    }

    public void printInfo() {
        System.out.printf("name %s, hours %d, hours spent %d, mark %d", themeName, totalHours, hoursSpentForTheme, markForTheme);
        System.out.println();
    }

    public String getThemeName() {
        return themeName;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName;
    }

    public int getHoursSpentForTheme() {
        return hoursSpentForTheme;
    }

    public void setHoursSpentForTheme(int hoursSpentForTheme) {
        this.hoursSpentForTheme = hoursSpentForTheme;
    }

    public int getMarkForTheme() {
        return markForTheme;
    }

    public void setMarkForTheme(int markForTheme) {
        this.markForTheme = markForTheme;
    }
}
