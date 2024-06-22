package day16_practice_tasks;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
public class MergeLists {
    public static void main(String[] args) {

        Set<Integer> list1 = new LinkedHashSet<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70));
        Set<Integer> list2 = new LinkedHashSet<>(Arrays.asList(30, 40, 50, 60, 70, 80, 90, 100));

        list1.addAll(list2);

        System.out.println(list1);
    }
}
