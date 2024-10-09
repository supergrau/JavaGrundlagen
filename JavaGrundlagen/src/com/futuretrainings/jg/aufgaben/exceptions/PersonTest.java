package com.futuretrainings.jg.aufgaben.exceptions;

public class PersonTest {
    public static void main(String[] args) {
        makePerson(30);
        makePerson(Person.MIN_AGE - 1);
        makePerson(Person.MAX_AGE + 1);

        Person max = makePerson(25, "Max");
        if (max != null) System.out.println(max);
        Person doris = makePerson(-1, "Doris");
        if (doris != null)
            System.out.println(doris);
        else
            System.out.println("Doris konnte nicht erzeugt werden.");
    }

    public static void makePerson(int age) {
        try {
            Person p = new Person(age, "Max");
            System.out.println(p);
        } catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        }

    }

    public static Person makePerson(int age, String name) {
        Person p;
        try {
            p = new Person(age, name);
        } catch (OutOfRangeException e) {
            return null;
        }
        return p;
    }
}
