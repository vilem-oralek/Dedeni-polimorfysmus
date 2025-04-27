import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;

    // Constructor
    public Inventory() {
        items = new ArrayList<>();
    }

    // Add item to inventory
    public void addItem(Item item) {
        items.add(item);
    }

    // Print all items in inventory using polymorphism
    public void printInventory() {
        for (Item item : items) {
            System.out.println(item);  // Polymorphism in action, calls the appropriate toString()
        }
    }
}