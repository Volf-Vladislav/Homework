package src;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("aaaaaaaaaa");
        list.add("bbbbbbbbb");
        list.add("cccccccccccccccc");
        list.add("dd");
        list.add("eeeeeeeeeeeeeeeeeeeeeeee");

        String max = Collections.max(list, Comparator.comparing(s -> s.length()));
        System.out.println("Самая длинная строка: " + max);
    }
}