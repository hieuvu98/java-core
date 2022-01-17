package java_collection;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "A complied high level, .....");
        languages.put("Python", "A complied high level, .....");
        languages.put("Python", "A complied high level 1231312, .....");

        System.out.println(languages.get("Java"));
    }
}
