package com.company2;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scn = new Scanner(System.in);
    private static ArrayList<Toy> tiles = new ArrayList<Toy>();
    public static void main(String[] args) throws CloneNotSupportedException {

        tileCreator();
        System.out.print("Hit enter to initialize the game: ");
        scn.nextLine();
        playGame game = new playGame();
//        Calculator<String> s = new Calculator<>();
//        if("abcdef".equals(s.calculateS("abc","def"))){
//            System.out.println("yes");
//        }
//        else{
//            System.out.println("no");
//        }

    }
    private static void tileCreator(){
        Toy t1 = new Toy("car",1);
        Toy t2 = new Toy("bus", 2);
        Toy t3 = new Toy("truck", 3);
        Toy t4 = new Toy("Bike", 4);
        Toy t5 = new Toy("Ship", 5);
        Toy t6 = new Toy("Naruto", 6);
        Toy t7 = new Toy("Sasuke", 7);
        Toy t8 = new Toy("Itachi", 8);
        Toy t9 = new Toy("Shoto", 9);
        Toy t10 = new Toy("Deku", 10);
        Toy t11= new Toy("Saitama", 11);
        Toy t12= new Toy("Asta", 12);
        Toy t13= new Toy("Noelle", 13);
        Toy t14= new Toy("Mimosa", 14);
        Toy t15= new Toy("Thor", 15);
        Toy t16 = new Toy("Hulk", 16);
        Toy t17 = new Toy("Superman", 17);
        Toy t18= new Toy("Batman", 18);
        Toy t19 = new Toy("Wanda", 19);
        Toy t20= new Toy("Ironman", 20);
        tiles.add(t1);
        tiles.add(t2);
        tiles.add(t3);
        tiles.add(t4);
        tiles.add(t5);
        tiles.add(t6);
        tiles.add(t7);
        tiles.add(t8);
        tiles.add(t9);
        tiles.add(t10);
        tiles.add(t11);
        tiles.add(t12);
        tiles.add(t13);
        tiles.add(t14);
        tiles.add(t15);
        tiles.add(t16);
        tiles.add(t17);
        tiles.add(t18);
        tiles.add(t19);
        tiles.add(t20);
    }

    static Toy getToy(int no){
        try{
            return tiles.get(no - 1);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        return null;
    }
}

// arrayindexout of bounds