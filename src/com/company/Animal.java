package com.company;

public abstract class  Animal implements Printable{
    private String slime;
    private String eyes;
    private String name;

    public Animal(String slime, String eyes, String name) {
        this.slime = slime;
        this.eyes = eyes;
        this.name = name;
    }

    public String getSlime() {
        return slime;
    }

    public String getEyes() {
        return eyes;
    }

    public String getName() {
        return name;
    }
}
