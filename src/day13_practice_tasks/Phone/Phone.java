package day13_practice_tasks.Phone;

public class Phone {

    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;


    public String getBrand() {

        return brand;
    }

    public String getModel() {

        return model;
    }

    public String getSize() {

        return size;
    }

    public double getPrice() {

        return price;
    }

    public String getColor() {
        return color;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.equals(" "))
            System.exit(1);
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.equals(" "))
            System.exit(1);
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.equals(" "))
            System.exit(1);
    }

    public void setPrice(double price) {
        if (price <= 0)
            System.exit(1);
    }


    public void setSize(String size) {

        this.size = size;
    }

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public void call(String phoneNumber) {

        System.out.println(" Calling the number " + phoneNumber);
    }

    public void text(String phoneNumber) {

        System.out.println(" Texting to the number " + phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}


