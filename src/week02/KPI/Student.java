package week02.KPI;

import java.util.ArrayList;


public class Student {
    /*поля:
    Имя
            Адрес
    Предметы
*/
    private String studentName;
    private Adress adress;
    private ArrayList<Theme> themesList;

    public Student(String studentName, ArrayList<Theme> themesList, Adress adress) {
        this.studentName = studentName;
        this.themesList = themesList;
        this.adress = adress;
    }

   /*методы:
    учиться +
    добавить предмет +
    удалить предмет из списка+
    показать всю информацию о предметах +
    получить средний бал за все предметы +
    */

    void addTheme(Theme theme) {
        themesList.add(theme);
    }

    void delTheme(String delName) {

        for (int i = 0; i < themesList.size(); i++) {
            if (themesList.get(i).getThemeName().equalsIgnoreCase(delName)) ;
            themesList.remove(themesList.get(i));
            break;
        }
    }

    public void study(Theme theme, int studyHours) {
        theme.setHoursSpentForTheme(theme.getHoursSpentForTheme() + studyHours);
    }

    public int averageMark() {
        int result = 0;
        for (int i = 0; i < themesList.size(); i++) {
            result += themesList.get(i).getMarkForTheme();
        }
        return result;
    }

    public void showSubjectsInfo() {
        for (int i = 0; i < themesList.size(); i++) {
            System.out.println();
            themesList.get(i).printInfo();
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public ArrayList<Theme> getThemesList() {
        return themesList;
    }

    public void setThemesList(ArrayList<Theme> themesList) {
        this.themesList = themesList;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
