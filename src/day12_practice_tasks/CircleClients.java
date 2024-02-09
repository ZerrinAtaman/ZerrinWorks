package day12_practice_tasks;

public class CircleClients {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5.0);

        double radius1 = circle1.getRadius();
        System.out.println("Circle 1 Radius: " + radius1);

        circle1.setRadius(7.0);

        double area1 = circle1.calcArea();
        System.out.println("Circle 1 Area: " + area1);

        double perimeter1 = circle1.calcPerimeter();
        System.out.println("Circle 1 Perimeter: " + perimeter1);

        System.out.println(circle1);
    }
}