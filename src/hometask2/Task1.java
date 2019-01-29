package hometask2;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {

        HashMap<String, Object> map = new HashMap<>();
        map.put("Test", 7);
        map.put("Class", 4.5);
        map.put("Cat", true);
        map.put("Dog", null);
        map.put("Bird", "Cat");
        map.put("Something", new Long(83));
        map.put("Mail", new Character('8'));
        map.put("Tab", '2');
        map.put("Browser", 22222222222L);
        map.put("IDE", (double) 489);

        for (Map.Entry<String, Object> stringObjectEntry : map.entrySet()) {
            System.out.println("This is a key - " + stringObjectEntry.getKey()
                    + " and this is a value - " + stringObjectEntry.getValue());
        }
    }
}
