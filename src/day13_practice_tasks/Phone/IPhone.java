package day13_practice_tasks.Phone;

public class IPhone extends Phone {
    public IPhone(String model, String size, double price, String color) {
        super("IPhone", model, size, price, color);
    }
    public void faceTime(String phoneNumber) {

        System.out.println(" Facetiming with the number " + phoneNumber);
    }
}
