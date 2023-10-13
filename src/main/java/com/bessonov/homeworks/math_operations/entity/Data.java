package com.bessonov.homeworks.math_operations.entity;

public class Data {
    private int initValue;
    private int delta;
    private boolean increment;

    public Data(int initValue, int delta, boolean increment) {
        this.initValue = initValue;
        this.delta = delta;
        this.increment = increment;
    }

    public int getInitValue() {
        return initValue;
    }

    public void setInitValue(int initValue) {
        this.initValue = initValue;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public boolean isIncrement() {
        return increment;
    }

    public void setIncrement(boolean increment) {
        this.increment = increment;
    }
}