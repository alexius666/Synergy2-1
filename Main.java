package com.company;

public class Main {

    public static void main(String[] args) {

    	King king_w = new King();
    	king_w.sayName();
    	king_w.sayColor(1);
    	king_w.sayMove();

		Queen queen_b = new Queen();
		queen_b.sayName();
		queen_b.sayColor(0);
		queen_b.sayMove();

		Pawn pawn_w = new Pawn();
		pawn_w.sayName();
		pawn_w.sayColor(1);
		pawn_w.sayMove();

		Bishop bishop_b = new Bishop();
		bishop_b.sayName();
		bishop_b.sayColor(0);
		bishop_b.sayMove();

		Knight knight_b = new Knight();
		knight_b.sayName();
		knight_b.sayColor(0);
		knight_b.sayMove();

		Rook rook_w = new Rook();
		rook_w.sayName();
		rook_w.sayColor(1);
		rook_w.sayMove();
	}
}
