package day06_practice_tasks;

public class MathUtility {

    public static void main(String[] args) {

        int resultInt = calculate(10,'*',20);
        System.out.println(resultInt);

        double resultDouble = calculate(2.5,'*',3.0);
        System.out.println(resultDouble);

        int squareInt = square(8);
        System.out.println(squareInt);

        double squareDouble = square(1.5);
        System.out.println(squareDouble);

        int cubeInt = cube(3);
        System.out.println(squareInt);

        double cubeDouble = cube(2.5);
        System.out.println(squareDouble);
    }

    public static int calculate(int num1, char mathOperator, int num2 ){
        boolean validOperator = mathOperator == '+' || mathOperator == '-' || mathOperator == '*'
                || mathOperator == '/' || mathOperator == '%';

        if (!validOperator){
            return 0;
        }

        int result = (mathOperator == '+')? num1 + num2 :(mathOperator == '-')? num1 - num2
                :(mathOperator == '*')? num1 * num2 :(mathOperator == '/')? num1 / num2
                :num1 % num2;
        return result;
    }

    public static double calculate(double num1, char mathOperator, double num2 ){
        boolean validOperator = mathOperator == '+' || mathOperator == '-' || mathOperator == '*'
                || mathOperator == '/' || mathOperator == '%';

        if (!validOperator){
            return 0;
        }

        double result = (mathOperator == '+')? num1 + num2 :(mathOperator == '-')? num1 - num2
                :(mathOperator == '*')? num1 * num2 :(mathOperator == '/')? num1 / num2
                :num1 % num2;
        return result;
    }

    public static int square(int num) {
        return num*num;
    }
    public static double square(double num) {
        return num*num;
    }

    public static int cube(int num) {
        return num*num*num;
    }
    public static double cube(double num) {
        return num*num*num;
    }
}



