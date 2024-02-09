package day02_practice_tasks;

public class ShippingAddress {
    public static void main(String[] args) {

        String fullName = "Aaron Kissinger";
        int buildingNumber = 13621;
        String streetName = "Legacy Circle";
        String city = "Fairfax";
        String state = "VA";
        String zipCode = "22030";

        System.out.println("Your Shipping address is:");
        System.out.println(fullName);
        System.out.println(buildingNumber + " " + streetName);
        System.out.println(city + ", " + state + " " + zipCode);


    }
}
