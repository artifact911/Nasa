package step.farmer.utils;

import step.farmer.enums.Color;
import step.farmer.enums.Type;
import step.farmer.model.Harvest;
import step.farmer.model.berries.*;
import step.farmer.model.fruits.*;
import step.farmer.model.vegetables.*;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BiFunction;

public class HarvestFactory {

    private final static Map<String, BiFunction<Integer, Color, Harvest>> harvestMap = new HashMap<>();
    private final static Map<String, BiFunction<Integer, Color, Harvest>> fruitsMap = new HashMap<>();
    private final static Map<String, BiFunction<Integer, Color, Harvest>> berriesMap = new HashMap<>();
    private final static Map<String, BiFunction<Integer, Color, Harvest>> vegetablesMap = new HashMap<>();
    private final static Map<Type, Map<String, BiFunction<Integer, Color, Harvest>>> typeMap = new HashMap<>();
    private final static Color[] colors = Color.values();
    private final static int[] bound = new int[]{1, 1000};

    static {
        fruitsMap.put(Apple.rusName, Apple::new);
        fruitsMap.put(Orange.rusName, Orange::new);
        fruitsMap.put(Apricot.rusName, Apricot::new);
        fruitsMap.put(Banana.rusName, Banana::new);
        fruitsMap.put(Garnet.rusName, Garnet::new);
        fruitsMap.put(Guava.rusName, Guava::new);
        fruitsMap.put(Lemon.rusName, Lemon::new);
        fruitsMap.put(Plum.rusName, Plum::new);
    }

    static {
        berriesMap.put(Blueberry.rusName, Blueberry::new);
        berriesMap.put(Cherry.rusName, Cherry::new);
        berriesMap.put(Cranberry.rusName, Cranberry::new);
        berriesMap.put(Currant.rusName, Currant::new);
        berriesMap.put(Gooseberry.rusName, Gooseberry::new);
        berriesMap.put(Grape.rusName, Grape::new);
        berriesMap.put(Strawberry.rusName, Strawberry::new);
    }

    static {
        vegetablesMap.put(Beet.rusName, Beet::new);
        vegetablesMap.put(Carrot.rusName, Carrot::new);
        vegetablesMap.put(Cucumber.rusName, Cucumber::new);
        vegetablesMap.put(Pepper.rusName, Pepper::new);
        vegetablesMap.put(Potato.rusName, Potato::new);
        vegetablesMap.put(Radish.rusName, Radish::new);
        vegetablesMap.put(Tomato.rusName, Tomato::new);
    }

    static {
        harvestMap.putAll(fruitsMap);
        harvestMap.putAll(berriesMap);
        harvestMap.putAll(vegetablesMap);
        typeMap.put(Type.FRUITS, fruitsMap);
        typeMap.put(Type.BERRIES, berriesMap);
        typeMap.put(Type.VEGETABLES, vegetablesMap);
    }

    private HarvestFactory() {
    }

    public static List<Harvest> of(final String name, final int amount) {
        final List<Harvest> harvests = new ArrayList<>();
        final BiFunction<Integer, Color, Harvest> biFunction = harvestMap.get(name);
        if (biFunction != null) {
            for (int i = 0; i < amount; i++) {
                harvests.add(generateHarvest(biFunction));
            }
        } else {
            throw new IllegalArgumentException("No such harvest " + name);
        }
        return harvests;
    }

    @SuppressWarnings("unchecked")
    public static List<Harvest> of(final Type type, final int amount) {
        final List<Harvest> harvests = new ArrayList<>();
        final Map<String, BiFunction<Integer, Color, Harvest>> harvestMap = typeMap.get(type);
        if (harvestMap != null) {
            final Set<Map.Entry<String, BiFunction<Integer, Color, Harvest>>> entries = harvestMap.entrySet();
            final Map.Entry<String, BiFunction<Integer, Color, Harvest>>[] mapArr = entries.toArray(new Map.Entry[0]);
            for (int i = 0; i < amount; i++) {
                final BiFunction<Integer, Color, Harvest> biFunction = mapArr[ThreadLocalRandom.current().nextInt(mapArr.length)].getValue();
                harvests.add(generateHarvest(biFunction));
            }
        }
        return harvests;
    }

    @SuppressWarnings("unchecked")
    public static List<Harvest> of(final int amount) {
        final List<Harvest> harvestList = new ArrayList<>();
        final Map.Entry<String, BiFunction<Integer, Color, Harvest>>[] harvest = harvestMap.entrySet().toArray(new Map.Entry[0]);
        for (int i = 0; i < amount; i++) {
            harvestList.add(generateHarvest(harvest[ThreadLocalRandom.current().nextInt(harvest.length)].getValue()));
        }
        return harvestList;
    }

    private static Harvest generateHarvest(BiFunction<Integer, Color, Harvest> function) {
        return function.apply(ThreadLocalRandom.current().nextInt(bound[0], bound[1]), colors[ThreadLocalRandom.current().nextInt(colors.length)]);
    }

}
