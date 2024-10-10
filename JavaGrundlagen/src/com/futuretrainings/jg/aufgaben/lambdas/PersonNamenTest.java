package com.futuretrainings.jg.aufgaben.lambdas;

import java.util.Arrays;
import java.util.List;

public class PersonNamenTest {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Max"),
                new Person("Moritz"),
                new Person("Frieda")
        );

        Object[] names = persons.stream().
                map(p -> p.getName().toUpperCase()).sorted().toArray();

        System.out.println(Arrays.toString(names));
    }
}
