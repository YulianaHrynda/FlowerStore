package ucu.edu.ua;

public abstract class Flower {
    private double sepalLength;
    private Color color;
    private double price;

    public Flower(double sepalLength, Color color, double price) {
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
    }

    public double getSepalLength() {
        return sepalLength;
    }

    public Color getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}