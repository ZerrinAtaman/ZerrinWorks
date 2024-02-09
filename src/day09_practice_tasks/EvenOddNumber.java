package day09_practice_tasks;

public class EvenOddNumber {

    public static void main(String[] args) {

        int[] evenOddNumbers = {1, 2, 3, 4, 5, 6, 7,};
        int even = 0;
        int odd = 0;

        for (int number : evenOddNumbers) {
            if (number % 2 == 0) {
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("The array has " + odd + " odd numbers and " + even + " even numbers.");
    }
}
