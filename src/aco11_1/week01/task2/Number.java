package aco11_1.week01.task2;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result;
        System.out.println("Enter first number:");
        int firstNum = scanner.nextInt();

        System.out.println("Choose operation:");
        System.out.println("1. Sum");
        System.out.println("2. Dif");
        System.out.println("3. Multiplication");
        System.out.println("4. Factorial");
        System.out.println("5. Calculation of the remainder from division");
        System.out.println("6. Compare two numbers");
        int operation = scanner.nextInt();

        if (operation != 4) {

            System.out.println("Enter second number:");
            int secondNum = scanner.nextInt();

            if (operation == 1) {
                result = sum(firstNum, secondNum);
                System.out.println("Result =" + " " + result);
            } else if (operation == 2) {
                result = dif(firstNum, secondNum);
                System.out.println("Result =" + " " + result);
            } else if (operation == 3) {
                result = mult(firstNum, secondNum);
                System.out.println("Result =" + " " + result);
            } else if (operation == 5) {
                result = divRemainder(firstNum, secondNum);
                System.out.println("Result =" + " " + result);
            } else if (operation == 6) {
                // compareTwoNums(firstNum, secondNum) :  How to make this in void method?

                if (firstNum > secondNum) {
                    System.out.println("First number is bigger");
                }
                else if (firstNum == secondNum) {
                    System.out.println("Both numbers are equal");
                } else {
                    System.out.println("Second number is bigger");
                }
            }

        } else {
            result = factorial(firstNum);
            System.out.println("Result =" + " " + result);
        }
    }

    static int divRemainder(int firstNum, int secondNum) {

        return firstNum % secondNum;
    }

    static int factorial(int firstNum) {
        if (firstNum == 1) {
            return 1;
        }
        return firstNum * factorial(firstNum - 1);
    }

    static int mult(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    static int dif(int firstNum, int secondNum) {

        return firstNum - secondNum;
    }

    static int sum(int firstNum, int secondNum) {
        return firstNum + secondNum;

    }
}
