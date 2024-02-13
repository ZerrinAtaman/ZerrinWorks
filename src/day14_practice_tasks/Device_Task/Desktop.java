package day14_practice_tasks.Device_Task;

public class Desktop extends PersonalComputer {
    public Desktop(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Desktop is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Desktop is turning off");

    }
}
