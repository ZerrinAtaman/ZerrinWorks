package day14_practice_tasks.Device_Task;

public abstract class Computer extends Device {
    public Computer(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public String toString() {
        return "Computer{" +
                ", brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                ", color='" + getColor() + '\'' +
                ", size='" + getSize() + '\'' +
                ", hasBattery=" + isHasBattery() +
                ", hasPowerButton=" + isHasPowerButton() +
                '}';
    }
}
