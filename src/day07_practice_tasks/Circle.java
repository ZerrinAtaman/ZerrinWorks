package day07_practice_tasks;

import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double radius = input.nextDouble();

        double area = 3.14 * Math.pow(radius, 2);
        double perimeter=2 * Math.PI * radius;

        input.close();

        System.out.println("The area of the Circle is :" + area);
        System.out.println("The perimeter of the Circle: " + perimeter);

    }
}


