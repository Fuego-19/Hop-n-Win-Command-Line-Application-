package com.company2;

public class Calculator <T>{

    public int calculateI(T obj1, T obj2) {
        return Integer.valueOf((int)obj1)/Integer.valueOf((int)obj2);
    }
    public String calculateS(T obj1, T obj2){
        return String.valueOf((String)obj1).concat(String.valueOf((String)obj2));
    }

}
