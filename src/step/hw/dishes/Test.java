package step.hw.dishes;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 550, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 350, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );
/////////////////////////////////////////////////////////////////////

        HashMap<Integer, Dish> hashMap = new HashMap<>();

        for (Dish value : menu) {
            hashMap.put(value.getCalories(), value);
        }
        List<Dish> dishList = new ArrayList<>(hashMap.values());
        // Collection<Dish> dishList = hashMap.values();
        System.out.println(dishList);

/////////////////////////////////////////////////////////////////////

        Integer id = 1;
        HashMap<Integer, Dish> idDishHashMap = new HashMap<>();

        for (Dish value : dishList) {
            idDishHashMap.put(id, value);
            id++;
        }
        System.out.println(idDishHashMap);

/////////////////////////////////////////////////////////////////////

        TreeMap<Integer, Dish> sortIdDishTreeSet = new TreeMap<>(idDishHashMap);

/////////////////////////////////////////////////////////////////////

        TreeSet<Map.Entry<Integer, Dish>> dishTreeSet = new TreeSet<>(new Comparator<Map.Entry<Integer, Dish>>() {
            @Override
            public int compare(Map.Entry<Integer, Dish> o1, Map.Entry<Integer, Dish> o2) {
                return o1.getValue().getName().compareTo(o2.getValue().getName());
            }
        });

        Set<Map.Entry<Integer, Dish>> setDishes = idDishHashMap.entrySet();

        dishTreeSet.addAll(setDishes);

        LinkedHashMap<Integer, Dish> linkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Dish> value : dishTreeSet) {
            linkedHashMap.put(value.getKey(), value.getValue());
        }

        System.out.println(dishTreeSet);
        System.out.println(linkedHashMap);

/////////////////////////////////////////////////////////////////////

        List<Integer> listKeysOfPizza = new ArrayList<>();

        for (Map.Entry<Integer, Dish> value : dishTreeSet) {
            if (value.getValue().getName().equals("pizza")) {
                listKeysOfPizza.add(value.getKey());
            }
        }

        for (Integer value : listKeysOfPizza) {
            linkedHashMap.remove(value);
        }
        System.out.println(linkedHashMap);

/////////////////////////////////////////////////////////////////////

        Map<Integer, Dish> vegetarianMap = new HashMap<>();
        Map<Integer, Dish> noVegetarianMap = new HashMap<>();


        for (Map.Entry<Integer, Dish> value : dishTreeSet) {
            if (value.getValue().isVegetarian()) {
                vegetarianMap.put(value.getKey(), value.getValue());
            } else {
                noVegetarianMap.put(value.getKey(), value.getValue());
            }
        }

        System.out.println(vegetarianMap);
        System.out.println(noVegetarianMap);

/////////////////////////////////////////////////////////////////////
        List<Dish> vegetarianList = new ArrayList<>(vegetarianMap.values());
        List<Dish> noVegetarianList = new ArrayList<>(noVegetarianMap.values());

        Map<Restaurant, List<Dish>> restaurantListMap = new LinkedHashMap<>();
        restaurantListMap.put(new Restaurant("Vegetarian"), vegetarianList);
        restaurantListMap.put(new Restaurant("NoVegetarian"), noVegetarianList);

        TreeSet<Map.Entry<Restaurant, List<Dish>>> sortRestaurant = new TreeSet<>(new Comparator<Map.Entry<Restaurant, List<Dish>>>() {
            @Override
            public int compare(Map.Entry<Restaurant, List<Dish>> o1, Map.Entry<Restaurant, List<Dish>> o2) {
                return o2.getValue().size() - o1.getValue().size();
            }
        });

        Set<Map.Entry<Restaurant, List<Dish>>> setForSort5 = restaurantListMap.entrySet();
        sortRestaurant.addAll(setForSort5);

        Map<Restaurant, List<Dish>> sortedMapByQuantityDishes = new LinkedHashMap<>();

        for (Map.Entry<Restaurant, List<Dish>> value : sortRestaurant) {
            sortedMapByQuantityDishes.put(value.getKey(), value.getValue());
        }


        System.out.println(sortedMapByQuantityDishes);
    }
}
