package day07_practice_tasks;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter product name");
        String item = input.nextLine();

        System.out.println("Enter the price");
        double price = input.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = input.nextInt();

        input.nextLine();

        System.out.println("Enter their first name");
        String firtsName = input.nextLine();

        double total = quantity*price;

        input.close();

        System.out.println(firtsName + " , your order for "+ quantity + " " + item + " has been placed. Your total is " + total + ".");
    }
}
