package day17_practice_tasks;

import java.util.HashMap;
import java.util.Map;

public class MultiplyOdds {

    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);


        for (Map.Entry<Character, Integer> chEntry : map.entrySet()) {
            if (chEntry.getValue() % 2 == 1){
                map.put(chEntry.getKey(),chEntry.getValue() * 2);
            }
        }
        System.out.println(map);
    }
}

