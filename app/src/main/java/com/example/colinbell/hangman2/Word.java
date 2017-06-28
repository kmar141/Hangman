package com.example.colinbell.hangman2;

/**
 * Created by colinbell on 28/06/2017.
 */

public class Word {
    private char[] letters;

    public Word(String input) {
        this.letters = input.toCharArray();
    }

    public char[] getLetters() {
        return letters;
    }

    public boolean checkWord(char guess){
        for(char c : this.letters) if (c == guess) return true;
    }



}