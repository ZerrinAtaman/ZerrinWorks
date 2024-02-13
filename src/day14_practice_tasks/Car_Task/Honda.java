package day14_practice_tasks.Car_Task;

public class Honda extends Car{

    public Honda(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Honda started");

    }

    @Override
    public void drive() {
        System.out.println("Honda is driving");

    }
}
