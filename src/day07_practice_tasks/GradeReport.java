package day07_practice_tasks;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        Scanner grade = new Scanner(System.in);
        System.out.println("Enter your score:");
        int score = grade.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid Score");

        } else if (score >= 90 && score <= 100) {
            System.out.println("Your grade is A");

        } else if (score >= 80 && score < 90) {
            System.out.println("Your grade is B");

        } else if (score >= 70 && score < 80) {
            System.out.println("Your grade is C");

        } else if (score >= 55 && score < 70) {
            System.out.println("Your grade is D");
        }else {
            System.out.println("Your grade is F");
        }

        grade.close();
    }
}
