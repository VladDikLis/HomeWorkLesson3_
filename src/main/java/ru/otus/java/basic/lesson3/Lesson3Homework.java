package ru.otus.java.basic.lesson3;

import java.util.Scanner;

public class Lesson3Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Это домашнее задание для урока 3. Список доступных команд:");
        System.out.println("1 - Вызвать метод greetings");
        System.out.println("2 - Вызвать метод checkSign");
        System.out.println("3 - Вызвать метод selectColor");
        System.out.println("4 - Вызвать метод compareNumbers");
        System.out.println("5 - Вызвать метод addOrSubtractAndPrint");
        System.out.println();
        System.out.println("Введите номер комманды:");
        int me = scanner.nextInt();
        if (me == 1) {
            System.out.println("Выбран метод greetings.");
            greetings();
        }
        if (me == 2) {
            System.out.println("Выбран метод checkSign.");
            int a = (int) ((Math.random() - Math.random()) * 100);
            System.out.println("a= " + a);
            int b = (int) ((Math.random() - Math.random()) * 100);
            System.out.println("b= " + b);
            int c = (int) ((Math.random() - Math.random()) * 100);
            System.out.println("c= " + c);
            checkSign(a,b,c);
        }
        if (me == 3) {
            System.out.println("Выбран метод selectColor.");
            int data = (int) ((Math.random() - Math.random()) * 100);
            System.out.println("data= " + data);
            selectColor(data);
        }
        if (me == 4) {
            System.out.println("Выбран метод compareNumbers.");
            int a = (int) ((Math.random() - Math.random()) * 100);
            System.out.println("a= " + a);
            int b = (int) ((Math.random() - Math.random()) * 100);
            System.out.println("b= " + b);
            compareNumbers(a,b);
        }
        if (me == 5) {
            System.out.println("Выбран метод addOrSubtractAndPrint.");
            int initValue = (int) ((Math.random() - Math.random()) * 100);
            System.out.println("initValue= " + initValue);
            int delta = (int) ((Math.random() - Math.random()) * 100);
            System.out.println("delta= " + delta);
            boolean increment = false;
            if (Math.random() < 0.5) {
                increment = true;
            }
            System.out.println("increment= " + increment);
            addOrSubtractAndPrint(initValue,delta,increment);
        }

    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum < 0) {
            System.out.println("Сумма отрицательная");
        } else {System.out.println("Сумма положительная"); }
    }

    public static void selectColor(int data) {
        if (data <= 10) {
            System.out.println("Красный");
        }
        if (data <= 20 && data > 10) {
            System.out.println("Жёлтый");
        }
        if (data > 20) {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {System.out.println("a < b"); }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        } else {System.out.println(initValue - delta); }
    }
}
