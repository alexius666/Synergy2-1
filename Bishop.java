package com.company;

public class Bishop implements Pieces{

    @Override
    public void sayName() {
        System.out.println("Я офицер");
    }

    @Override
    public void sayColor(int c) {
        if (c==1) {System.out.println("я белая фигура");}
        else {System.out.println("я черная фигура");}
    }

    @Override
    public void sayMove() {
        System.out.println("я хожу по диагонали в любом направлении на любое количество клеток\n");
    }
}
