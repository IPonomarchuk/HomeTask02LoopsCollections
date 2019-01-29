package hometask2;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "First in HashMap");
        map.put(2, "Second in HashMap");
        map.put(3, "Third in HashMap");

        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            System.out.println("This is a key - " + integerStringEntry.getKey()
                    + " and this is a value - " + integerStringEntry.getValue());
        }

    }

}
