package ua.ucu.edu;

public class Flower extends Item {
    private FlowerColor color;
    private int sepalLength;
    private double price;
    private FlowerType flowerType;

    public Flower(FlowerColor color, int sepalLength, FlowerType flowerType, double price) {
        this.color = color;
        this.sepalLength = sepalLength;
        this.price = price;
        this.flowerType = flowerType;
    }

    public Flower(Flower flower) {
        this(flower.color, flower.sepalLength, flower.flowerType, flower.price);
    }

    // Additional constructor for Chamomile and similar flowers without specifying a FlowerType
    public Flower(double sepalLength, FlowerColor color, double price) {
        this.color = color;
        this.sepalLength = (int) sepalLength;  // Cast to int since sepalLength is defined as int
        this.price = price;
        this.flowerType = FlowerType.CHAMOMILE; // Assuming default type for such constructors
    }
    
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return String.format("Flower Type: %s, Color: %s, Sepal Length: %d cm, Price: %.2f",
                             flowerType, color, sepalLength, price);
    }

    public FlowerColor getColor() {
        return color;
    }

    public int getSepalLength() {
        return sepalLength;
    }

    public FlowerType getFlowerType() {
        return flowerType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(FlowerColor color) {
        this.color = color;
    }
}
