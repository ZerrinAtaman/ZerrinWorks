package day07_practice_tasks;

public class RectangleClients {
    public static void main(String[] args) {

        Rectangle rectangleArea = new Rectangle();
        rectangleArea.width = 15;
        rectangleArea.length = 20;

        rectangleArea.calculateArea();

        System.out.println(rectangleArea);


        Rectangle rectanglePerimeter = new Rectangle();
        rectanglePerimeter.width = 15;
        rectanglePerimeter.length = 20;

        rectanglePerimeter.calculatePerimeter();

        System.out.println(rectanglePerimeter);
    }
}
