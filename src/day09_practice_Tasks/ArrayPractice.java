package day09_practice_Tasks;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] numbers = {5, 9, 13, 15, 17};

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[4]);

        for (int i : numbers) {

            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
