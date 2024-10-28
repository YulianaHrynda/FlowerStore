package ua.ucu.edu;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Flower> flowers = new ArrayList<>();

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public List<Flower> search(FlowerColor color) {
        List<Flower> result = new ArrayList<>();
        for (Flower flower : flowers) {
            if (flower.getColor() == color) {
                result.add(flower);
            }
        }
        return result;
    }
}