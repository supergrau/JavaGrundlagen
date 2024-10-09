package com.futuretrainings.jg.aufgaben.exceptions;

public class OutOfRangeException extends RuntimeException {

    public OutOfRangeException(long value, long min, long max) {

        super("Value " + value + " not in range of " + min + " and " + max);
    }
}
