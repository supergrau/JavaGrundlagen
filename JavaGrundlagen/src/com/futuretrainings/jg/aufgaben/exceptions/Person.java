package com.futuretrainings.jg.aufgaben.exceptions;

public class Person {
    public static final int MIN_AGE = 0;
    public static final int MAX_AGE = 150;

    private final int age;
    private final String name;

    public Person(int age, String name) throws OutOfRangeException {
        if (age < MIN_AGE || age > MAX_AGE) {
            throw new OutOfRangeException(age, MIN_AGE, MAX_AGE);
        }

        this.age = age;
        this.name = name;
    }

    public String toString() {
        return this.name + " is " + this.age + " years old";
    }
}
