package day16_practice_tasks;

import java.util.*;

public class CommonElements {

    public static void main(String[] args) {

        SortedSet<Integer> number1 = new TreeSet<>(Arrays.asList(10, 8, 11, 20, 5, 0));
        SortedSet<Integer> number2 = new TreeSet<>(Arrays.asList(30, 0, 20, 40, 50, 10, 60));

        number1.retainAll(number2);

        System.out.println(number1);
        }
    }

