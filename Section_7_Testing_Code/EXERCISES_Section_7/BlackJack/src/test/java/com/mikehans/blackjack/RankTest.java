package com.mikehans.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RankTest {
    @Test
    void getValueofKing() {
//        Rank King = new Rank("KING");
//        Rank QUEEN = new Rank("QUEEN");
//        Rank JACK = new Rank("JACK");
        assertEquals(10, Rank.KING.getValue());
    }
}