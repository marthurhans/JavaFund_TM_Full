package com.mikehans.blackjack;

import org.w3c.dom.ls.LSOutput;

public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Card(String suit, String rank) {
        this.suit = Suit.valueOf(suit.toUpperCase());
        this.rank = Rank.valueOf(rank.toUpperCase());
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public static void main(String[] args) {
        Card card1 = new Card(Suit.CLUBS, Rank.JACK);
        Card card2 = new Card(Suit.DIAMONDS, Rank.TEN);
        Card card3 = new Card("hearts", "queen");

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);


        //int total = card1.plus(card2);
        //Hand myHand = new Hand()
        //myHand.add(card1)
        //myHand.add(card2)
        //int total = myHand.getTotal();
        //EXAMPLES OF LESS EFFECTIVE NON-ENUM TECHNIQUES
    }

    @Override
    public String toString() {
        // JACK {Club symbol}
        return this.rank.toString() + " " + this.suit.toString();
    }

    public int getValue() {
//        Rank King = new Rank("KING");
//        Rank QUEEN = new Rank("QUEEN");
//        Rank JACK = new Rank("JACK");
//        assertEquals(10, Rank.KING.getValue());
        return this.rank.getValue();
    };


}

