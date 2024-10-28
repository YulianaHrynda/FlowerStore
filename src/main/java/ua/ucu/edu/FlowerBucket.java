package ua.ucu.edu;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public void addFlowerPack(FlowerPack pack) {
        flowerPacks.add(pack);
    }

    public double price() {
        return flowerPacks.stream()
                          .mapToDouble(FlowerPack::getPrice)
                          .sum();
    }

    public void add(FlowerPack flowerPack) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    public Integer getPrice() {
        throw new UnsupportedOperationException("Unimplemented method 'getPrice'");
    }
}