package com.bessonov.homeworks.math_operations.service;

import com.bessonov.homeworks.math_operations.entity.Data;

public class SumOrSubtract {
    private int sumOrSubtract(int initValue, int delta, boolean isIncrement) {
        if (isIncrement) {
            return initValue + delta;
        } else {
            return initValue - delta;
        }
    }

    public void printSumOrSubtract(Data data) {
        System.out.println(sumOrSubtract(data.getInitValue(), data.getDelta(), data.isIncrement()));
    }
}