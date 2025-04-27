public class Main {
    public static void main(String[] args) {
        // Create some items
        Item apple = new FoodItem("Apple", 2.50, 0.2);
        Item laptop = new ElectronicItem("Laptop", 1200.00, 24);
        Item bathtub = new Item("Bathtub", 2000.00);

        // Create an inventory
        Inventory inventory = new Inventory();

        // Add items to inventory
        inventory.addItem(apple);
        inventory.addItem(laptop);
        inventory.addItem(bathtub);

        // Print all items using polymorphism
        System.out.println("Inventory Details:");
        inventory.printInventory();
    }
}