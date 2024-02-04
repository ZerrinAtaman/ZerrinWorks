package day05_practice_tasks;

public class FactorialNumber {

    public static void main(String[] args) {

        int num1 = 5;
        int sum = 1;

        for (int i=1 ; i<=num1 ; i++){
            sum*=i;
        }
        System.out.println(sum);
    }
}
