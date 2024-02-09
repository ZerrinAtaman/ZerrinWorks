package day12_practice_tasks;

public class CandyClients {

    public static void main(String[] args) {
        Candy candy1 = new Candy();
        candy1.setBrand("Haribo");
        candy1.setQuantity(10);
        candy1.setPrice(1.5);
        candy1.setHasPeanuts(true);

        System.out.println("Candy 1:");
        System.out.println("Brand: " + candy1.getBrand());
        System.out.println("Quantity: " + candy1.getQuantity());
        System.out.println("Price: " + candy1.getPrice());
        System.out.println("Has Peanuts: " + candy1.isHasPeanuts());
    }
}

