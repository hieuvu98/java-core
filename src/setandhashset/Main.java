package setandhashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> plannets = new HashSet<>();
    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        plannets.add(temp);

        temp = new HeavenlyBody("Jupyter", 365);
        solarSystem.put(temp.getName(), temp);
        plannets.add(temp);

        temp = new HeavenlyBody("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        plannets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        HeavenlyBody tempMoon2 = new HeavenlyBody("Moon2", 27);
        solarSystem.put(tempMoon2.getName(), tempMoon2);
        temp.addMoon(tempMoon2);

        HeavenlyBody tempMoon3= new HeavenlyBody("Moon3", 27);
        solarSystem.put(tempMoon3.getName(), tempMoon3);
        temp.addMoon(tempMoon3);


        temp = new HeavenlyBody("Neptune", 28);
        solarSystem.put(temp.getName(), temp);
        plannets.add(temp);

        temp = new HeavenlyBody("Deimos", 687);
        solarSystem.put(temp.getName(), temp);
        plannets.add(temp);

        temp = new HeavenlyBody("Pluto", 18);
        solarSystem.put(temp.getName(), temp);
        plannets.add(temp);

        temp = new HeavenlyBody("Mars", 18);
        solarSystem.put(temp.getName(), temp);
        plannets.add(temp);


        System.out.println("Planets: \n");
        for(HeavenlyBody planet: plannets) {
            System.out.println(planet.getName() + "\t");
        }

        HeavenlyBody body = solarSystem.get("Earth");
        System.out.println("Moons of " + body.getName());
        for(HeavenlyBody jupiterMoon : body.getSatellites()) {
            System.out.println("\t" + jupiterMoon.getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet : plannets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("Moons: \n");
        for(HeavenlyBody moon: moons) {
            System.out.println(moon.getName() + "\t");
        }
    }
}
