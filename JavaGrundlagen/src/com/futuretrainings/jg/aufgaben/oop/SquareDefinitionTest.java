package com.futuretrainings.jg.aufgaben.oop;

public class SquareDefinitionTest {
    public static void main(String[] args) {
        SquareDefinition sd = new SquareDefinition(10);
        System.out.println(sd.Area());

        SquareDefinition sd1 = new SquareDefinition(15);
        System.out.println(SquareDefinition.Area(sd1));
    }
}
