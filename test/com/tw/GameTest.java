package com.tw;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {
    private Game game=new Game();

    @Test
    public void whenVowelShouldReturnTrueElseFalse() {
        char[] arrVowel = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < arrVowel.length; i++) {
            assertTrue(game.judgement(arrVowel[i]));
        }
        char[] arrNonVowel = {'b', 'c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
        for (int j = 0; j < arrNonVowel.length; j++) {
            assertFalse(game.judgement(arrNonVowel[j]));
        }
    }

    @Test
    public void whenProportionBiggerThenThirtyShouldReturnTureElseFalse() {
        assertTrue(game.cir("she"));
        assertTrue(game.cir("hear"));
        assertFalse(game.cir("hmm"));

    }
}