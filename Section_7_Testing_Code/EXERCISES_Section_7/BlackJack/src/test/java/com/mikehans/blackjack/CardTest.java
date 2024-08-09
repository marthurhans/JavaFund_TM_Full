package com.mikehans.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void canGetValueOfaTwoCard() {
        Card card1 = new Card(Suit.DIAMONDS, Rank.TWO);
        assertEquals(2, card1.getValue());
    }

    @Test
    void canGetValueOfaThreeCard() {
        Card card1 = new Card(Suit.DIAMONDS, Rank.THREE);
        assertEquals(3, card1.getValue());
    }

    @Test
    void canGetValueOfanAceCard() {
        Card card1 = new Card(Suit.DIAMONDS, Rank.ACE);
        assertEquals(1, card1.getValue());
    }

    @Test
    void canGetValueOfanJackCard() {
        Card card1 = new Card(Suit.DIAMONDS, Rank.JACK);
        assertEquals(10, card1.getValue());
    }

    @Test
    void canGetValueOfanKingCard() {
        assertEquals(10, Rank.KING.getValue());
    }
}