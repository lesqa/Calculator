package testng;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        char operator;
        int number1;
        int number2;
        int result;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operator: +, -, *, or /");
        operator = scanner.next().charAt(0);

        System.out.println("Enter the first number:");
        number1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        number2 = scanner.nextInt();

        switch (operator) {

            case '+':
                addition(number1, number2);
                break;

            case '-':
                subtraction(number1, number2);
                break;

            case '*':
                multiplication(number1, number2);
                break;

            case '/':
                division(number1, number2);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        scanner.close();
    }

    protected static int division(int number1, int number2) {
        int result;
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);

        return result;
    }

    protected static int multiplication(int number1, int number2) {
        int result;
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);

        return result;
    }

    protected static int subtraction(int number1, int number2) {
        int result;
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);

        return result;
    }

    protected static int addition(int number1, int number2) {
        int result;
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);

        return result;
    }
}
