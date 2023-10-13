package com.bessonov.homeworks;

import com.bessonov.homeworks.check_sign.entity.NumbersToCheck;
import com.bessonov.homeworks.check_sign.service.Check;
import com.bessonov.homeworks.compare_numbers.entity.Numbers;
import com.bessonov.homeworks.compare_numbers.service.CompareNumbers;
import com.bessonov.homeworks.greet.Greet;
import com.bessonov.homeworks.math_operations.entity.Data;
import com.bessonov.homeworks.math_operations.service.SumOrSubtract;
import com.bessonov.homeworks.select_color.entity.DataColor;
import com.bessonov.homeworks.select_color.service.SelectColor;

import java.util.Random;
import java.util.Scanner;

public class MainApplication {
    final static int MIN = Integer.MIN_VALUE;
    final static int MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //!greetings()
        Greet greet = new Greet();

        //!Генерация случайных чисел от Integer min - до Integer Max
        int firstNumber = random.ints(MIN, MAX).findFirst().getAsInt();
        int secondNumber = random.ints(MIN, MAX).findFirst().getAsInt();
        int thirdNumber = random.ints(MIN, MAX).findFirst().getAsInt();

        //!checkSign()
        NumbersToCheck numbersToCheck = new NumbersToCheck(firstNumber, secondNumber, thirdNumber);
        Check check = new Check();

        //!selectColor()
        DataColor dataColor = new DataColor(firstNumber);
        SelectColor selectColor = new SelectColor();

        //!compareNumbers()
        Numbers numbers = new Numbers(firstNumber, secondNumber);
        CompareNumbers compareNumbers = new CompareNumbers();

        //!addOrSubtractAndPrint
        Data data = new Data(firstNumber, secondNumber, random.nextBoolean());
        SumOrSubtract sumOrSubtract = new SumOrSubtract();
        boolean isWork = true;
        do {
            System.out.println("Введите пожалуйста цифру от 1 до 5:\n1. Печатаем столбец из слов.\n2" + ". Результат" + " работы выражения из трех чисел.\n3. Выбираем цвет в зависимости от числа.\n4. Сравниваем числа " + "между собой и выводим результат. \n5. Проводим математическую операцию в зависимости от вашего " + "выбора.\n Если вы ввели число или букву которая отлична от одного до пяти то тогда программа " + "закончит свою работу.");
            String userSelection = scanner.nextLine();
            switch (userSelection) {
                case "1":
                    greet.printGreetings();
                    break;
                case "2":
                    check.printCheckSign(numbersToCheck);
                    break;
                case "3":
                    selectColor.printColor(dataColor);
                    break;
                case "4":
                    compareNumbers.printCompare(numbers);
                    break;
                case "5":
                    sumOrSubtract.printSumOrSubtract(data);
                    break;
                default:
                    isWork = false;
                    System.out.println("Спасибо что выбрали наше приложение!");
            }
        } while (isWork);
    }
}