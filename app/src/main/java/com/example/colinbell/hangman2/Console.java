package com.example.colinbell.hangman2;

import java.util.Scanner;

/**
 * Created by colinbell on 28/06/2017.
 */

public class Console {

        public String wordInput(){
            System.out.println("Please enter a word:");
            Scanner reader = new Scanner(System.in);
            String input = reader.nextLine();
            return input;
        }
    }

}
