package day08_practice_tasks;

import java.util.Scanner;

public class Name_Update {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = str.nextLine();

        System.out.println("Enter your last name:");
        String lastName = str.nextLine();

        String fullName = Name(firstName, lastName);
        System.out.println("Full Name: " + fullName);

        str.close();
    }

    public static String Name(String firstName, String lastName) {

        String updateFirstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        String updateLastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        return updateFirstName + " " + updateLastName;
    }
}
