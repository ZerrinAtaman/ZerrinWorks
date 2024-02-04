package day08_practice_tasks;

import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        System.out.println("Enter the first word:");
        String Word1 = str.nextLine();

        System.out.println("Enter the second word:");
        String Word2 = str.nextLine();

        String combinedWords = combineWords(Word1, Word2);
        System.out.println("Combined Words: " + combinedWords);

        str.close();
    }
    public static String combineWords(String firstWord, String secondWord) {

        if (firstWord.charAt(firstWord.length()-1) == secondWord.charAt(0)) {
            return firstWord + secondWord.substring(1);
        } else {
            return firstWord + secondWord;
        }
    }
}

 //firstWord.length() > 0 && secondWord.length() > 0 && - bu kisim if parantesinin icinde bastaki kisim