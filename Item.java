public class Item {
    protected String name;
    protected double price;

    // Constructor
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Override toString to display common attributes
    @Override
    public String toString() {
        return "Item Name: " + name + ", Price: " + price;
    }
}