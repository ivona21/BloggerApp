package com.ivona.BloggerApp.bll.services;

import java.util.Random;

public class FirstService {
    public String getRandomString(){
        String [] strings = new String[] {"Ivona", "Symphony", "cats and dogs", "Luster cafe bar",
        "AI", "gamification", "everything and anything", "some spanish words", "good coffee", "nice music", "what did you get?"};

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(strings.length - 1);

        return strings[randomNumber];
    }
}