package com.bessonov.homeworks.compare_numbers.entity;

public class Numbers {
    private int firstNumbers;
    private int secondNumbers;

    public Numbers(int firstNumbers, int secondNumbers) {
        this.firstNumbers = firstNumbers;
        this.secondNumbers = secondNumbers;
    }

    public int getFirstNumbers() {
        return firstNumbers;
    }

    public void setFirstNumbers(int firstNumbers) {
        this.firstNumbers = firstNumbers;
    }

    public int getSecondNumbers() {
        return secondNumbers;
    }

    public void setSecondNumbers(int secondNumbers) {
        this.secondNumbers = secondNumbers;
    }
}