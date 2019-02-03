package hometask02loopscollections;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetUsage {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("pineapple");
        set.add("watermelon");
        set.add("apple");
        set.add("pear");
        set.add("quince");
        set.add("lemon");
        set.add("kiwi");

        System.out.println("There are elements of set before processing: ");
        for (String i : set) {
            System.out.println(i);
        }
        List<String> list = new LinkedList<>();
        list.add("plum");
        list.add("nut");
        list.add("apple");
        list.add("grape");
        list.add("peach");
        list.add("pear");
        list.add("cherry");
        list.add("orange");
        list.add("watermelon");
        list.add("apricot");
        list.add("pineapple");

        System.out.println('\n' + "There are elements of linked list: ");
        for (String i : list) {
            System.out.println(i);
        }
        set.retainAll(list);

        System.out.println('\n' + "There are elements of set after processing: ");
        for (String i : set) {
            System.out.println(i);
        }
    }

}
