package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain;

public class Calculator {
    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void subtractTwoNumbers() {
        System.out.println(21 - 2);
    }

    public void multiplyTwoNumbers(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideTwoNumbers(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideTwoNumbers02(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return 0;
        }
    }

    public void printTwoNumbersDivided(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Can't divided by 0");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void changeTwoNumbers(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Inside changeTwoNumbers");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
}
