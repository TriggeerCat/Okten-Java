package LessonCore04.Task05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        words.add("dragonfruit");
        words.add("elderberry");
        words.add("strawberry");
        words.add("watermelon");
        words.add("raspberry");
        words.add("nectarine");
        words.add("tangerine");
        words.add("honeydew");
        words.add("cherry");
        words.add("banana");
        words.add("orange");
        words.add("papaya");
        words.add("quince");
        words.add("grape");
        words.add("lemon");
        words.add("mango");
        words.add("apple");
        words.add("kiwi");
        words.add("ugli");
        words.add("fig");

        System.out.println(words);

        words.sort(Comparator.comparingInt(c -> (int) c.charAt(0)));

        System.out.println(words);

        words = words.stream().filter(c -> c.length() > 4)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(words);
    }
}
