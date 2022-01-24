package com.company;

public class Pawn implements Pieces{

    @Override
    public void sayName() {
        System.out.println("Я пешка");
    }

    @Override
    public void sayColor(int c) {
        if (c==1) {System.out.println("я белая фигура");}
        else {System.out.println("я черная фигура");}
    }

    @Override
    public void sayMove() {
        System.out.println("я хожу только прямо и только вперед на одну клетку\n");
    }
}
