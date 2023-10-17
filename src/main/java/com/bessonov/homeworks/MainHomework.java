package com.bessonov.homeworks;

import java.util.Random;
import java.util.Scanner;

public class MainHomework {
    final static int MIN = Integer.MIN_VALUE;
    final static int MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean isEmpty = true;

        do {
            int dataRandom = (int) (Math.random() * 21);
            int firstNumber = random.ints(MIN, MAX).findFirst().getAsInt();
            int secondNumber = random.ints(MIN, MAX).findFirst().getAsInt();
            int thirdNumber = random.ints(MIN, MAX).findFirst().getAsInt();
            boolean isIncrement = random.nextBoolean();

            System.out.println("Введите пожалуйста цифру от 1 до 5:\n1. Печатаем столбец из слов.\n2" + ". Результат" + " работы выражения из трех чисел.\n3. Выбираем цвет в зависимости от числа.\n4. Сравниваем числа " + "между собой и выводим результат. \n5. Проводим математическую операцию в зависимости от вашего " + "выбора.\n Если вы ввели число или букву которая отлична от одного до пяти то тогда программа " + "закончит свою работу.");
            String userSelection = scanner.nextLine();
            switch (userSelection) {
                case "1":
                    MainHomework.greetings();
                    break;
                case "2":
                    MainHomework.checkSign(firstNumber, secondNumber, thirdNumber);
                    break;
                case "3":
                    MainHomework.selectColor(dataRandom);
                    break;
                case "4":
                    MainHomework.compareNumbers(firstNumber, secondNumber);
                    break;
                case "5":
                    MainHomework.addOrSubtractAndPrint(firstNumber, secondNumber, isIncrement);
                    break;
                default:
                    isEmpty = false;
                    System.out.println("Спасибо что выбрали наше приложение!");
            }
        } while (isEmpty);

    }

    private static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    private static void checkSign(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber + secondNumber + thirdNumber >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void selectColor(int data) {
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data >= 10 && 20 >= data) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленный");
        }
    }

    private static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    private static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue += delta);
        } else {
            System.out.println(initValue -= delta);
        }
    }
}