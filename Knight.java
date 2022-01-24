package com.company;

public class Knight implements Pieces{

    @Override
    public void sayName() {
        System.out.println("Я конь");
    }

    @Override
    public void sayColor(int c) {
        if (c==1) {System.out.println("я белая фигура");}
        else {System.out.println("я черная фигура");}
    }

    @Override
    public void sayMove() {
        System.out.println("я хожу буквой Г(по прямой две клетки и одна влево или вправо)\n");
    }
}
