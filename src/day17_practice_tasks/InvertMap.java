package day17_practice_tasks;

import java.util.HashMap;
import java.util.Map;

public class InvertMap {

    public static void main(String[] args) {

        Map<Integer, Character> map1 = new HashMap<>();
        map1.put(1, 'a');
        map1.put(2, 'b');
        map1.put(3, 'c');
        
        Map<Character, Integer> map2 = new HashMap<>();

        for (Map.Entry<Integer, Character> chEntry : map1.entrySet()) {
            map2.put(chEntry.getValue(), chEntry.getKey());
        }
        System.out.println(map2);
    }
}
