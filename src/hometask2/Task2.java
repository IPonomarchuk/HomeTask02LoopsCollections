package hometask2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");
        list.add("Sixth");
        list.add("Seventh");
        list.add("Eighth");
        list.add("Ninth");
        list.add("Tenth");

        Collections.reverse(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
