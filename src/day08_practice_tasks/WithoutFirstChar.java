package day08_practice_tasks;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {

        Scanner str = new Scanner(System.in);
        System.out.println("Enter two words: ");
        String word1 = str.next();
        String word2 = str.next();

        System.out.println(word1.substring(2) + word2.substring(1));
        str.close();
    }
}
