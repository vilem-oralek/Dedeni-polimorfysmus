public class FoodItem extends Item {
    private double weight;

    // Constructor
    public FoodItem(String name, double price, double weight) {
        super(name, price);  // Call parent constructor
        this.weight = weight;
    }

    // Getter method for weight
    public double getWeight() {
        return weight;
    }

    // Override toString to include weight
    @Override
    public String toString() {
        return super.toString() + ", Weight: " + weight + " kg";
    }
}