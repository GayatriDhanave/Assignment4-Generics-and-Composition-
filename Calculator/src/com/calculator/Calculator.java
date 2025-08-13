package com.calculator;

public class Calculator<T extends Number> {
    public T add(T a, T b) {
        Double sum= a.doubleValue() + b.doubleValue();
        return (T) sum;
//        return a+b;
    }

    public T subtract(T a, T b) {
        Double difference = a.doubleValue() - b.doubleValue();
        return (T) difference;
    }

    public T multiply(T a, T b) {
        Double product = a.doubleValue() * b.doubleValue();
        return (T) product;
    }

    public T divide(T a, T b) {
        Double quotient = a.doubleValue() / b.doubleValue();
        return (T) quotient;
    }
}
