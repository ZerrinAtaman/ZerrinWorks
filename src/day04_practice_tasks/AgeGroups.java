package day04_practice_tasks;

public class AgeGroups {

    public static void main(String[] args) {

        int age = 42;

        if (age >= 0 && age <= 20) {
            System.out.println("Teenager");

        } else if (age >=21 && age <= 55) {
            System.out.println("Young Middle-Aged Adult");

        } else if (age >= 55 && age <150) {
            System.out.println("Senior-Aged Adult");

        } else {
            System.out.println("Invalid");
        }
    }
}
