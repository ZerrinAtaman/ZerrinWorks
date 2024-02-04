package day04_practise_tasks;

public class Calculator {

    public static void main(String[] args) {

        double num1 = 5,
                num2 = 6;

        char mathOperator = '*';

        switch (mathOperator) {
            case '+':
                System.out.println("Addition: " + (num1 + num2));
                break;

            case '-':
                System.out.println("Subtraction: " + (num1 - num2));
                break;

            case '*':
                System.out.println("Multiplication: " + (num1 * num2));
                break;

            case '/':
                System.out.println("Division: " + (num1 / num2));
                break;

            default:
                System.out.println("Invalid operator");
        }
    }
}
