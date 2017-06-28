package com.example.colinbell.hangman2;

/**
 * Created by colinbell on 28/06/2017.
 */

public class User {
    private int lives;

    public User(){
        this.lives = 6;
    }

    public void loseLife(){
        this.lives -= 1;
    }


}