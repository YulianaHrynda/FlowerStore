package flower.store;

public class FlowerPack {
    private Flower flower;
    private int amount;

    public FlowerPack(Flower flower, int amount) {
        this.flower = new Flower(flower);
        this.amount = amount;
    }

    public Flower getFlower() {
        return flower;
    }

    public void setFlower(Flower flower) {
        if (flower != null) {
            this.flower = new Flower(flower);
        }
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return flower != null ? flower.getPrice() * amount : 0;
    }

    @Override
    public String toString() {
        return "FlowerPack{" +
               "flower=" + flower +
               ", amount=" + amount +
               '}';
    }
}
