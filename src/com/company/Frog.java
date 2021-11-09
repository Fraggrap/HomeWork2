package com.company;

public class Frog extends Animal {
private String paws;
private String language;

    public Frog(String slime, String eyes, String paws, String language, String name) {
        super(slime, eyes, name);
        this.paws = paws;
        this.language = language;
    }

    public String getPaws() {
        return paws;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + "\nSlime " + getSlime() + "\nEyes " + getEyes() + "\nPaws" + getPaws() + "\nLanguage " + getLanguage());
    }
}


