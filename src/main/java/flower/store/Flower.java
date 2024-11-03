package flower.store;

public class Flower extends Item{
    private FlowerType type;
    private FlowerColor color;
    private double sepalLength;
    private double price;

    public Flower() {
    }

    public Flower(FlowerType type, FlowerColor color, double sepalLength, double price) {
        this.type = type;
        this.color = color;
        this.sepalLength = sepalLength;
        this.price = price;
    }

    public Flower(Flower flower) {
        if (flower != null) {
            this.color = flower.color;
            this.sepalLength = flower.sepalLength;
            this.price = flower.price;
            this.type = flower.type;
        }
    }

    public FlowerType getType() {
        return type;
    }

    public void setType(FlowerType type) {
        this.type = type;
    }

    public FlowerColor getColorType() {
        return color;
    }

    public void setColor(FlowerColor color) {
        this.color = color;
    }

    public double getSepalLength() {
        return sepalLength;
    }

    public void setSepalLength(double sepalLength) {
        this.sepalLength = sepalLength;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{" +
               "type=" + type +
               ", color=" + color +
               ", sepalLength=" + sepalLength +
               ", price=" + price +
               '}';
    }

    public String getColor() {
        return color != null ? color.toString() : "Unknown";
    }    
}
