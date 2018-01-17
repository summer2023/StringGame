package com.tw;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class GameTest {

    @Mock
    private StringReader mockedreader=Mockito.mock(StringReader.class);

    @Mock
    private  Printer mockedPrinter=Mockito.mock(Printer.class);

    @Mock
    private StringJudgementer mockedjudgementer=Mockito.mock(StringJudgementer.class);

    @Test
    public void whenProportionBiggerLableThenThirtyShouldReturnChangedString() {
        Game game = new Game(mockedreader,mockedPrinter,mockedjudgementer );
        Mockito.when(mockedreader.read()).thenReturn("hear");

        game.start();

        Mockito.verify(mockedPrinter).print("please input String:");
        Mockito.verify(mockedPrinter).print("hmommyr");
    }

    @Test
    public void whenProportionlowwerNoLableThenThirtyShouldReturnChangedString() {
        Game game = new Game(mockedreader,mockedPrinter,mockedjudgementer );
        Mockito.when(mockedreader.read()).thenReturn("hmma");

        game.start();

        Mockito.verify(mockedPrinter).print("please input String:");
        Mockito.verify(mockedPrinter).print("hmma");
    }
}