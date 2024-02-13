package day14_practice_tasks.Device_Task;

public class Laptop extends PersonalComputer {
    public Laptop(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Laptop is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Laptop is turning off");
    }
}

