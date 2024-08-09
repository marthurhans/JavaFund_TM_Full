package com.mikehans.blackjack;

public enum Rank {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10);

    private int value;

    Rank(int value) {
        this.value = value;
    }
    //new constuctor we wrote

    //THINK OF ENUMS THIS WAY ...
//        Rank King = new Rank("KING");
//        Rank QUEEN = new Rank("QUEEN");
//        Rank JACK = new Rank("JACK");
//        assertEquals(10, Rank.KING.getValue());


    public int getValue() {
        return value;
    }; //replaces old method since we now have int fields attached


    public int getValueOld() {
        //      OLD ORDINAL METHOD - BEFORE WE ASSIGNED NUMBERS
        // ORIGINAL ORDINALS WERE IN ORDER
        // Ex. ACE = 0, TWO = 1, THREE = 2, etc
        return switch (this) {
            case JACK, QUEEN, KING -> 10;
            default -> ordinal() + 1;
        };
    }


}

