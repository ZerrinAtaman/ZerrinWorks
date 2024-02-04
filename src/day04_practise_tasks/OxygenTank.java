package day04_practise_tasks;

public class OxygenTank {

    public static void main(String[] args) {

        int oxygenTank = 75;

        if (oxygenTank > 90) {
            System.out.println("Your tank is full");
        } else if (oxygenTank > 80) {
            System.out.println("Still okay");
        } else if (oxygenTank > 70) {
            System.out.println("Don't go too far");
        } else if (oxygenTank > 60) {
            System.out.println("Start to head back");
        } else if (oxygenTank > 50) {
            System.out.println("Be careful, you're at 50%");
        }
    }
}
