package week01.task2;

public class NumberTest {

    public static void main(String[] args) {
        Number number = new Number();
        int firstNum = 2;
        int secontNum = 3;

        if (number.sum(firstNum,secontNum) == 5) {
            System.out.println("sum test OK");
        } else {
            System.out.println("sum test is not Ok");
        }
        if (number.dif(firstNum,secontNum) == -1) {
            System.out.println("sum test OK");
        } else {
            System.out.println("sum test is not Ok");
        }
        if (number.mult(firstNum,secontNum) == 6) {
            System.out.println("sum test OK");
        } else {
            System.out.println("sum test is not Ok");
        }
        if (number.factorial(secontNum) == 6) {
            System.out.println("sum test OK");
        } else {
            System.out.println("sum test is not Ok");
        }
        if (number.divRemainder(secontNum, firstNum) == 1) {
            System.out.println("sum test OK");
        } else {
            System.out.println("sum test is not Ok");
        }
    }
}
