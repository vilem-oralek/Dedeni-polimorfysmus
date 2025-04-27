public class ElectronicItem extends Item {
    private int warranty;  // Warranty in months

    // Constructor
    public ElectronicItem(String name, double price, int warranty) {
        super(name, price);  // Call parent constructor
        this.warranty = warranty;
    }

    // Getter method for warranty
    public int getWarranty() {
        return warranty;
    }

    // Override toString to include warranty
    @Override
    public String toString() {
        return super.toString() + ", Warranty: " + warranty + " months";
    }
}