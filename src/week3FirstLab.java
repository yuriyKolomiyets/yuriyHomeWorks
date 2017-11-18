import java.util.Scanner;

public class week3FirstLab {

    public static void main(String[] args) {
        String[][] people = {
                {"John", "Sara", "Kane", "Sara", "Sara"},
                {"Smith", "Doe", "Gregory", "Williams", "A"},
                {"25", "27", "29", "26", "10"},
                {"john.smith@gmail.com", "sara.doe@yahoo.com", "k.gregory@gmail.com", "sara.williams@gmail.com", "sara.williams@gmil.com"},
                {"New York", "Washington", "New York", "Dallas", "Kiev"}
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name for seach: ");

        String personName = scanner.next();

       findPersonByName(personName, people);

        sortArrayByName(people);

        printAll(people);
    }



    static String[] sortArrayByName (String[][] people) {

        for (int i = 0; i < people[0].length; i++) {

            for (int j = 0; j < people[0].length-i-1; j++) {
                if (people[0][j].compareTo(people[0][j+1])>0) {

                    swapTwoElements (j,j+1,people[0]);
                    swapTwoElements (j,j+1,people[1]);
                    swapTwoElements (j,j+1,people[2]);
                    swapTwoElements (j,j+1,people[3]);
                    swapTwoElements (j,j+1,people[4]);
                }

                else if (people[0][j].compareTo(people[0][j+1])==0 && people[1][j].compareTo(people[1][j+1])>0) {
                    swapTwoElements (j,j+1,people[0]);
                    swapTwoElements (j,j+1,people[1]);
                    swapTwoElements (j,j+1,people[2]);
                    swapTwoElements (j,j+1,people[3]);
                    swapTwoElements (j,j+1,people[4]);
                }
            }

        }
        return people[0];
    }

    static void swapTwoElements(int index1, int index2, String [] people) {

        String temp  = people [index1];
        people [index1] = people [index2];
        people [index2] = temp;
    }

    public static void printAll(String[][] people) {
        for (String[] line : people) {
            for (String word : line) {
                System.out.print(word + spaces(23 - word.length()));

            }
            System.out.println("\n");
        }
    }

    public static String spaces(int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result + " ";
        }
        return result;
    }

    public static void findPersonByName(String personName, String[][] people) {

        int[] indices = new int[people[0].length];
        int total = 0;
        for (int i = 0; i < people[0].length; i++) {
            if (people[0][i].equalsIgnoreCase(personName)) {
                indices [total++] = i;
            }

        }

        System.out.println(String.format("Total %d person(s) with name %s found:", total, personName));

        for (int index = 0; index < total; index++) {

            System.out.println(String.format("Person %d: ", index+1));

            for (String[] line : people) {
                int personIndex = indices[index];
                System.out.println(line[personIndex]);
            }

            System.out.println("--------");

        }

    }
}

