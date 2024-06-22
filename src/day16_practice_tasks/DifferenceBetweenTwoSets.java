package day16_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class DifferenceBetweenTwoSets {
    public static void main(String[] args) {
        List<Integer> set1 = new ArrayList<>(Arrays.asList(1, 2, 3, 5));
        List<Integer> set2 = new ArrayList<>(Arrays.asList(2, 3, 4));

        set1.removeAll(set2);
        System.out.println(set1);
    }
}
