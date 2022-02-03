package com.company2;

public class Toy implements Cloneable {
    private String toyName;
    private int tileNumber;


    Toy(String toyName, int tileNumber){
        this.tileNumber = tileNumber;
        this.toyName = toyName;
    }

    public int getTileNumber() {
        return tileNumber;
    }

    public String getToyName() {
        return toyName;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}


