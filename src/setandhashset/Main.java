package setandhashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> plannets = new HashSet<>();
    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("Hieu vu1", 88);
        solarSystem.put(temp.getName(), temp);
        plannets.add(temp);

        temp = new HeavenlyBody("Hieu vu 2", 365);
        solarSystem.put(temp.getName(), temp);
        plannets.add(temp);

        temp = new HeavenlyBody("Pluto", 18);
        solarSystem.put(temp.getName(), temp);
        plannets.add(temp);

        temp = new HeavenlyBody("Neptune", 28);
        solarSystem.put(temp.getName(), temp);
        plannets.add(temp);

        temp = new HeavenlyBody("Hieu vu 3", 78);
        solarSystem.put(temp.getName(), temp);
        plannets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        System.out.println("Planets: \n");
        for(HeavenlyBody planet: plannets) {
            System.out.println(planet.getName() + "\t");
        }
    }
}
