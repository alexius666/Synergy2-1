package com.company;

public class King implements Pieces{

    @Override
    public void sayName() {
        System.out.println("Я король");
    }

    @Override
    public void sayColor(int c) {
        if (c==1) {System.out.println("я белая фигура");}
        else {System.out.println("я черная фигура");}
    }

    @Override
    public void sayMove() {
        System.out.println("я хожу на одну клетку в любом направлении\n");
    }
}
