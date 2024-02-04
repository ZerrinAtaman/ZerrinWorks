package day02_practise_tasks;

public class PhoneNumber {
    public static void main(String[] args) {

        int countryCode = 1;
        int areaCode = 703;
        int localNumber = 4512625;

        String phoneNumber = "+" + countryCode + "(" + areaCode + ")-" + localNumber;
        System.out.println("Phone number is: " + phoneNumber);
    }
}

