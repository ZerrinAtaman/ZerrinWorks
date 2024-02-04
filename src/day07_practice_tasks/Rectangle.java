package day07_practice_tasks;

public class Rectangle {
    public double width;
    public double length;


    public void calculateArea(){
        double area = width*length;
        System.out.println("Rectangle area: " + area);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    public void calculatePerimeter(){
        double perimeter = 2*(width+length);
        System.out.println("Rectangle perimeter" + perimeter);
    }

}
