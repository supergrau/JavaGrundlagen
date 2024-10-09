package com.futuretrainings.jg.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterTest {

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();

        for (T item : list)
            if (predicate.test(item)) {
                result.add(item);
            }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < 10; i++)
            list.add(i);

        List<Integer> result = filter(list, new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        });

        for (int item : result)
            System.out.println(item);

        result = filter(list, new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 != 0;
            }
        });

        for (int item : result)
            System.out.println(item);

        List<String> stringList = new ArrayList<>();
        stringList.add("Klaus");
        stringList.add("Berta");
        stringList.add("");
        stringList.add("Anton");
        stringList.add("Julius");
        stringList.add("");

        List<String> filteredList = filter(stringList, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return !s.isEmpty();
            }
        });

        /*
        Beispiele für Lambda-Ausdrücke, welche anonyme Funktionen repräsentieren:
        x -> x * x
        (x, y) -> {return x + y};
        () -> 4711
        (String s1, String s2) -> System.out.println(s1.length(), + s2.length())
        (s1, s2) -> System.out.println(s1.length(), + s2.length())
         */
        for(String item:filteredList)
            System.out.println(item);

        result = filter(list, i -> {return i % 3 == 0;});
        // oder
        result = filter(list, i -> i % 3 == 0);

        for (int item:result)
            System.out.println(item);
    }
}
