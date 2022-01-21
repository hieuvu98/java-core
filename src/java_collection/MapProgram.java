package java_collection;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "A complied Java, .....");
        languages.put("Python", "A complied Python, .....");
        languages.put("PHP", "A complied PHP, .....");
        languages.put("Javascript", "A complied Javascript, .....");
        System.out.println("replace: " + languages.replace("PHP", "PHP replace"));
        for(String key : languages.keySet()) {
            System.out.println(key  + " - value: " + languages.get(key));
        }
    }
}
