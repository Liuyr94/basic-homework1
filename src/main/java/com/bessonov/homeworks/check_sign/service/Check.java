package com.bessonov.homeworks.check_sign.service;

import com.bessonov.homeworks.check_sign.entity.NumbersToCheck;

public class Check {
    private String checkSign(int firstNumber, int secondNumber, int thirdNumber) {
        int result = firstNumber + secondNumber + thirdNumber;
        if (result >= 0) {
            return "Сумма положительная";
        } else {
            return "Сумма отрицательная";
        }
    }

    public void printCheckSign(NumbersToCheck numbers) {
        System.out.println(checkSign(numbers.getFirstNumber(), numbers.getSecondNumber(), numbers.getThirdNumber()));
    }
}