package day07_practice_tasks;

public class ItemClients {
    public static void main(String[] args) {

        Item item1 = new Item();
        item1.itemName = "Printer";
        item1.unitPrice = 100;
        item1.quantity = 7;

        item1.calCost();

        System.out.println(item1);
    }
}
