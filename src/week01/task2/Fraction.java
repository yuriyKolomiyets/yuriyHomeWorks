package week01.task2;

import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's create first fraction");
        System.out.println("Enter first number:");
        int firstNumerator = scanner.nextInt();
        System.out.println("Enter second number:");
        int firstDenominator = scanner.nextInt();
        System.out.println("Your first fraction:" + " " + firstNumerator + "/" + firstDenominator);

        System.out.println("Let's create second fraction");
        System.out.println("Enter first number:");
        int secondNumerator = scanner.nextInt();
        System.out.println("Enter second number:");
        int secondDenominator = scanner.nextInt();
        System.out.println("Your second fraction:" + " " + secondNumerator + "/" + secondDenominator);

        System.out.println("Choose operation:");
        System.out.println("1. Sum");
        System.out.println("2. Dif");
        System.out.println("3. Multiplication");
        System.out.println("4. Devi$ion");
        System.out.println("5. Compare two Fractions");
        int operation = scanner.nextInt();

        if (operation == 1) {
            String result = sum(firstNumerator, firstDenominator, secondNumerator, secondDenominator);
            System.out.println(result);
        } else if (operation == 2) {
            String result = dif(firstNumerator, firstDenominator, secondNumerator, secondDenominator);
            System.out.println(result);
        } else if (operation == 3) {
            String result = mult(firstNumerator, firstDenominator, secondNumerator, secondDenominator);
            System.out.println(result);
        } else if (operation == 4) {
            String result = div(firstNumerator, firstDenominator, secondNumerator, secondDenominator);
            System.out.println(result);
        } else if (operation == 5) {

            double firstFrac = (double) firstNumerator / firstDenominator;
            System.out.println(firstFrac);
            double secondFrac = (double) secondNumerator / secondDenominator;
            System.out.println(secondFrac);


            if (firstFrac > secondFrac) {
                System.out.println("First fraction is bigger");
            } else if (firstFrac == secondFrac) {
                System.out.println("Both are equal");
            } else {
                System.out.println("Second fraction is bigger");
            }
        }
    }

    static String sum(int firstNumerator, int firstDenominator, int secondNumerator, int secondDenominator) {
        int resultDenominator = firstDenominator * secondDenominator;
        int resultNumerator = firstNumerator * secondDenominator + secondNumerator * firstDenominator;

        return resultNumerator + "/" + resultDenominator;
    }

    static String dif(int firstNumerator, int firstDenominator, int secondNumerator, int secondDenominator) {
        int resultDenominator = firstDenominator * secondDenominator;
        int resultNumerator = firstNumerator * secondDenominator - secondNumerator * firstDenominator;

        return resultNumerator + "/" + resultDenominator;
    }

    static String mult(int firstNumerator, int firstDenominator, int secondNumerator, int secondDenominator) {
        int resultDenominator = firstDenominator * secondDenominator;
        int resultNumerator = firstDenominator * firstDenominator;

        return resultNumerator + "/" + resultDenominator;
    }

    static String div(int firstNumerator, int firstDenominator, int secondNumerator, int secondDenominator) {
        int resultDenominator = firstDenominator * secondNumerator;
        int resultNumerator = firstNumerator * secondNumerator;

        return resultNumerator + "/" + resultDenominator;
    }
}
