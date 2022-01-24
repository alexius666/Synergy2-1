package com.company;

public class Queen implements Pieces{

    @Override
    public void sayName() {
        System.out.println("Я ферзь");
    }

    @Override
    public void sayColor(int c) {
        if (c==1) {System.out.println("я белая фигура");}
        else {System.out.println("я черная фигура");}
    }

    @Override
    public void sayMove() {
        System.out.println("я хожу в любом направлении на любое количество клеток\n");
    }
}
