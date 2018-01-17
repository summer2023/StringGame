package com.tw;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringJudgementerTest {
    private StringJudgementer judgementer=new StringJudgementer();

    @Test
    public void whenVowelShouldReturnTrueElseFalse() {
        char[] arrVowel = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < arrVowel.length; i++) {
            assertTrue(judgementer.judgement(arrVowel[i]));
        }
        char[] arrNonVowel = {'b', 'c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
        for (int j = 0; j < arrNonVowel.length; j++) {
            assertFalse(judgementer.judgement(arrNonVowel[j]));
        }
    }

    @Test
    public void whenProportionBiggerThenThirtyShouldReturnTureElseFalse() {
        assertTrue(judgementer.cir("she"));
        assertTrue(judgementer.cir("hear"));
        assertFalse(judgementer.cir("hmm"));

    }

    @Test
    public void vowelHasBeenChangedToMommy() {
        assertTrue(judgementer.change("a").equals("mommy"));
        assertTrue(judgementer.change("h").equals("h"));
    }
}