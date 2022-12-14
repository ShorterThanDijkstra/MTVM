package com.github.std.mtvm.engine.classloader.constant;

public class ConstantDouble implements Constant{
    private final double value;

    public ConstantDouble(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
