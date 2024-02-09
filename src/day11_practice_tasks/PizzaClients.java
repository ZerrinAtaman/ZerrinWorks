package day11_practice_tasks;

public class PizzaClients {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("small",2,1);
        Pizza pizza2 = new Pizza("medium", 3,2);
        Pizza pizza3 = new Pizza("large", 4, 3);

        System.out.println("Pizza 1: " + pizza1);
        System.out.println("Pizza 2: " + pizza2);
        System.out.println("Pizza 3: " + pizza3);
    }
}
