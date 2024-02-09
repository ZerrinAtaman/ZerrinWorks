package day09_practice_tasks;

public class ArrayElements {
    public static void main(String[] args) {

        int[] numbers = new int[100];

        for (int i = 0; i < 100; i++) {
            numbers[i] = i + 1;
        }
        for (int number : numbers) {
            System.out.println(number + " ");
        }
        System.out.println();

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i] + " ");
        }
        System.out.println();


        for (int number : numbers) {
            if (number % 5 == 0) {
                System.out.println(number + " ");
            }
        }
    }
}




