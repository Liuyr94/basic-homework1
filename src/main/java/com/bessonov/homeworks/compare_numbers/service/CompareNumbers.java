package com.bessonov.homeworks.compare_numbers.service;

import com.bessonov.homeworks.compare_numbers.entity.Numbers;

public class CompareNumbers {
    private String compare(int firstNumber, int secondNumber) {
        if (firstNumber >= secondNumber) {
            return "a >= b";
        } else {
            return "a < b";
        }
    }

    public void printCompare(Numbers numbers) {
        System.out.println(compare(numbers.getFirstNumbers(), numbers.getSecondNumbers()));
    }
}