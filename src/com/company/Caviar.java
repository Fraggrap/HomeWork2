package com.company;

public class Caviar extends Animal{
    private String shell;
    private String fluidbody;

    public Caviar( String shell, String fluidbody, String name) {
        super(shell,fluidbody, name);
        this.shell = shell;
        this.fluidbody = fluidbody;
    }

    public String getShell() {
        return shell;
    }

    public String getFluidbody() {
        return fluidbody;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + "\nSlime " + getSlime() + "\nEyes " + getEyes() + "\nShell" + getShell() + "\nGills " + getFluidbody());
    }
}

