package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("one");
        l.add("two");
        l.add("three");
        String s = l.toString();
        System.out.println(s);
        List<Integer> i = Arrays.asList(1, 2, 3);
        for (int j = 0; j < i.size(); j++) {
            System.out.println(i.get(j));
        }
    List<String> names = new ArrayList<>(Arrays.asList("Bela", "Pista"));
        System.out.println(names);
        names.add("Armandó");
        System.out.println(names);
    }
}
