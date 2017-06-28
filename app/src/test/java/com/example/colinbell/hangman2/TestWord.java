package com.example.colinbell.hangman2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by colinbell on 28/06/2017.
 */


public class TestWord {

    Word word;

    @Before
    public void before(){
        word = new Word("sausages");
    }

    @Test
    public void wordHasLetters(){
        assertEquals(8, word.getLetters().length());
    }


}