package enumEx.planet;

import java.util.EnumMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CollecEnum {
    public static void main(String[] args) {
        //EnumSet<Planet> planets = EnumSet.of(Planet.EARTH, Planet.JUPITER); // Example

        EnumMap<Planet, String> enumMap = new EnumMap<Planet, String>(Planet.class);

        for (Planet value : Planet.values()) {
            enumMap.put(value, "01");
        }

        TreeMap<Planet, String> planetStringTreeMap = new TreeMap<>(enumMap);
        //Set<Map.Entry<Planet, String>> entrySet = planetStringTreeMap.entrySet(); // Attention in for

        for (Entry<Planet, String> value : planetStringTreeMap.entrySet()) {
            System.out.println(value.getKey() + " " + value.getValue());
        }
    }
}
