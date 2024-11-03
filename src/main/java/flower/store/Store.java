package flower.store;

import filters.SearchFilter;
import java.util.ArrayList;
import java.util.List;

public class Store implements SearchFilter {
    private List<Item> itemList;

    public Store() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (item != null) {
            itemList.add(item);
        }
    }

    // Method to add a Flower specifically
    public void addFlower(Flower flower) {
        if (flower != null) {
            itemList.add(flower);
        }
    }

    // Method to get all Flowers in the store
    public List<Flower> getFlowers() {
        List<Flower> flowers = new ArrayList<>();
        for (Item item : itemList) {
            if (item instanceof Flower) {
                flowers.add((Flower) item);
            }
        }
        return flowers;
    }

    public List<Item> search(SearchFilter filter) {
        List<Item> results = new ArrayList<>();
        for (Item item : itemList) {
            if (filter.match(item)) {
                results.add(item);
            }
        }
        return results;
    }

    @Override
    public boolean match(Item item) {
        return itemList.contains(item);
    }
}
