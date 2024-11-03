package flower.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> flowerPacks;

    public FlowerBucket() {
        this.flowerPacks = new ArrayList<>();
    }

    public void add(FlowerPack flowerPack) {
        if (flowerPack != null) {
            flowerPacks.add(flowerPack);
        }
    }

    public double getPrice() {
        double totalPrice = 0.0;
        for (FlowerPack pack : flowerPacks) {
            if (pack != null) {
                totalPrice += pack.getPrice();
            }
        }
        return totalPrice;
    }

    public List<FlowerPack> getFlowerPacks() {
        return new ArrayList<>(flowerPacks);
    }
}
