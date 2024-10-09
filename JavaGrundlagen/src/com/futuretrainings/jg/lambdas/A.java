package com.futuretrainings.jg.lambdas;

public class A {
    private final int i;

    public A(int i) {
        this.i = i;
    }

    public void someMethod(X x) {
        int result = i + x.calculate(2, 3);
        System.out.println(result);
    }

    public static void main(String[] args) {
        A a = new A(1);

        a.someMethod(new X() {
            public int calculate(int a, int b) {
                return a + b;
            }
        });
    }
}
