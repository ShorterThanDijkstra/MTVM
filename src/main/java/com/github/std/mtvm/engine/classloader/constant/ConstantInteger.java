package com.github.std.mtvm.engine.classloader.constant;

public class ConstantInteger implements Constant {
    private final int value;

    public ConstantInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
