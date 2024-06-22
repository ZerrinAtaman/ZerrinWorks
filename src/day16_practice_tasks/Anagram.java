package day16_practice_tasks;

import java.util.HashSet;
import java.util.Set;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "ccddabaa";

        Set<Character> set1 = new HashSet<>();
        for (char c : str1.toCharArray()) {
            set1.add(c);
        }
        Set<Character> set2 = new HashSet<>();
        for (char c : str2.toCharArray()) {
            set2.add(c);
        }
        boolean result1 = set1.equals(set2);
        System.out.println("Example1: " + result1);

        String str3 = "xyze";
        String str4 = "xyzd";


        Set<Character> set3 = new HashSet<>();
        for(char c : str3.toCharArray()) {
            set3.add(c);
        }

        Set<Character> set4 = new HashSet<>();
        for(char c : str4.toCharArray()) {
            set4.add(c);
        }

        boolean result2 = set3.equals(set4);
        System.out.println("Example2: " + result2);
    }
}

