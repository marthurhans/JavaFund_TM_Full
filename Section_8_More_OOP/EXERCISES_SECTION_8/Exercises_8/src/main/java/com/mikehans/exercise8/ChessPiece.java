package com.mikehans.exercise8;

import static com.mikehans.exercise8.ChessPiece.Color.WHITE;
public abstract class ChessPiece {
    protected Coordinates coordinates;
    protected Color color;

    public ChessPiece(Color color) {
        this.color = color;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    protected int calcYWithDirFactor(int yOffset) {
        int dirFactor = color == WHITE ? 1 : -1;
        return yOffset * dirFactor;
    }

    abstract Coordinates[] getValidMoves();

    enum Color {
        BLACK,
        WHITE;
    }
}
