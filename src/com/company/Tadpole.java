package com.company;

public class Tadpole extends Animal{
    private String tail;
    private String gills;

    public Tadpole( String tail, String gills,String name) {
        super(tail,gills,name);
        this.tail = tail;
        this.gills = gills;
    }

    public String getTail() {
        return tail;
    }

    public String getGills() {
        return gills;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + "\nSlime " + getSlime() + "\nEyes " + getEyes() + "\nTail" + getTail() + "\nGills " + getGills());
    }
}

