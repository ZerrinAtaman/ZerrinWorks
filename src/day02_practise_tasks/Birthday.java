package day02_practise_tasks;

public class Birthday {
    public static void main(String[] args) {

        String name = "John";
        int birthDay = 25;
        String birthMonth = "April";
        int birthYear = 1995;

        String formattedBirthday = String.format("%s was born on %s %d, %d.", name, birthMonth, birthDay, birthYear);
        System.out.println(formattedBirthday);
    }

}
