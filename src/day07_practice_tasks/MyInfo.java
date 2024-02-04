package day07_practice_tasks;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = info.nextInt();

        info.nextLine();

        System.out.println("Enter your gender:");
        char gender = info.next().charAt(0);

        System.out.println("Enter your full name:");
        String fullName = info.nextLine();

        info.nextLine();

        System.out.println("Enter your phone number:");
        long phoneNumber = info.nextLong();

        System.out.println("Enter your zip code:");
        int zipCode = info.nextInt();

        info.nextLine();

        System.out.println("Enter your School name:");
        String schoolName = info.nextLine();

        System.out.println("Enter your city name:");
        String cityName = info.nextLine();

        System.out.println("Enter your state name:");
        String stateName = info.nextLine();

        System.out.println("Enter your building number:");
        int buildingNumber = info.nextInt();

        info.nextLine();

        System.out.println("Enter your Street name:");
        String streetName = info.nextLine();

        info.close();

        System.out.println("Full name "+fullName+"Age "+age+ "Gender "+gender+"Phone number "+phoneNumber + "Address "+buildingNumber+", "+streetName+" "+cityName+" "+stateName+" "+zipCode);



    }
}
