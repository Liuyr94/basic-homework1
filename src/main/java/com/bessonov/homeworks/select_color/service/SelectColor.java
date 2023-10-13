package com.bessonov.homeworks.select_color.service;

import com.bessonov.homeworks.select_color.entity.DataColor;

public class SelectColor {
    private String color(int data) {
        if (data < 11) {
            return "Красный";
        } else if (data > 11 && 21 > data) {
            return "Желтый";
        } else {
            return "Красный";
        }
    }

    public void printColor(DataColor dataColor) {
        System.out.println(color(dataColor.getData()));
    }
}