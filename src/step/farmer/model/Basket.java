package step.farmer.model;

import step.farmer.enums.Type;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Basket {

    private final int totalWeight;
    private List<Harvest> harvests;

    public Basket(List<Harvest> harvests) {
        this.harvests = harvests;
        this.totalWeight = takeTotalWeight(harvests);
    }

    public static List<Basket> of(List<Harvest> harvests) {
        Map<Type, List<Harvest>> collect = harvests.stream().collect(groupingBy(Harvest::getType));
        return collect.values().stream().map(Basket::new).collect(Collectors.toList());
    }

    private int takeTotalWeight(List<Harvest> harvests) {
        return harvests.stream().mapToInt(Harvest::getWeight).sum();

    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public List<Harvest> getHarvests() {
        return harvests;
    }

    public void setHarvests(List<Harvest> harvests) {
        this.harvests = harvests;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "totalWeight=" + totalWeight +
                ", harvests=" + harvests.size() +
                '}';
    }
}
