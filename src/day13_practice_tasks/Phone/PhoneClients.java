package day13_practice_tasks.Phone;

public class PhoneClients {
    public static void main(String[] args) {
        IPhone iPhone1 = new IPhone("13", "ProMax", 1200, "Black" );
        System.out.println(iPhone1);
        iPhone1.call("1234567");
        iPhone1.faceTime("1234567");
        iPhone1.text("1234567");

        Samsung samsung1 = new Samsung("10", "Galaxy", 1100, "Green" );
        System.out.println(samsung1);

        samsung1.call("1234567");
        samsung1.text("1234567");

        Nokia nokia1 = new Nokia("3210", "Small", 100, "Red" );
        System.out.println(nokia1);

        nokia1.call("1234567");
        nokia1.text("1234567");

    }
}
