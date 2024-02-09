package day12_practice_tasks;

public class RectangleClients {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(12, 13);

        double width = rect1.getWidth();
        double length = rect1.getLength();

        rect1.setWidth(15);
        rect1.setLength(20);

        double area = rect1.calcArea();
        double perimeter = rect1.calcPerimeter();

        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        System.out.println(rect1);
    }
}

