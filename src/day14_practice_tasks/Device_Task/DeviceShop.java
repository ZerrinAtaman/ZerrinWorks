package day14_practice_tasks.Device_Task;

public class DeviceShop {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Apple", "iPhone 12", 1100.0, "Black", "6.0inches", true, true);
        Samsung samsung = new Samsung("Samsung", "Galaxy S2", 950.0, "White", "6.0 inches", true, true);
        Google google = new Google("Google", "P5", 750.0, "Grey", "6.0 inches", true, true);


        System.out.println("Phones");
        System.out.println(iphone);
        iphone.turnOn();
        iphone.call(1234567890);
        iphone.text(1234567890);
        iphone.downloadApp();
        iphone.turnOff();
        System.out.println();

        System.out.println(samsung);
        samsung.turnOn();
        samsung.call(1234567890);
        samsung.text(1234567890);
        samsung.downloadApp();
        samsung.turnOff();
        System.out.println();

        System.out.println(google);
        google.turnOn();
        google.call(1234567890);
        google.text(1234567890);
        google.downloadApp();
        google.turnOff();
        System.out.println();


        Computer desktop = new Desktop("Toshiba", "T16", 900.0, "Silver", "15 inches", false, true);
        Computer laptop = new Laptop("Dell", "D18", 1000.0, "Gray", "15 inches", true, true);

        System.out.println("Computers");
        System.out.println(desktop);
        desktop.turnOn();

        desktop.turnOff();
        System.out.println();

        System.out.println(laptop);
        laptop.turnOn();

        laptop.turnOff();
        System.out.println();
    }
}

