package com.company;

public class Main {

    public static void main(String[] args) {
        creatObject("Лягушка").print();
        creatObject("Головастик").print();
        creatObject("Икра").print();


    }

    public static Printable creatObject(String className) {
//        String name = className;
        switch (className) {
            case "Лягушка":
                return new Frog("Скольский", "Большие","4", "Длинный", "Чесночнитца");
            case "Головастик":
                 return new Tadpole("Черный", "Дышать", "Голавастик");
            case "Икра":
                return new Caviar("Склиская", "Черная", "Икра");

        }


        return null;
    }
}
