package com.company;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        Animal a = creatObject("Лягушка");
        Animal b = creatObject("Головастик");
        Animal c = creatObject("Икра");
        Animal[] ma = {a, b, c};
        for (Animal dop: ma) {
            dop.print();
            System.out.println("------");
        }
    }

    public static Animal creatObject(String className) {
        Animal animal = null;
        switch (className) {
            case "Лягушка":
                animal = new Frog("Скольский", "Большие", "4", "Длинный", "Чесночнитца");
                break;
            case "Головастик":
                animal = new Tadpole("Черный", "Дышать", "Голавастик");
                break;
            case "Икра":
               animal = new Caviar("Склиская", "Черная", "Икра");
                break;
        }


        return animal;}
    }

