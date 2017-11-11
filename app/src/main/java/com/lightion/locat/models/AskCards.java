package com.lightion.locat.models;

/**
 * Created by Lightion on 11-11-2017.
 */

public class AskCards {
    private String askTitle;
    private String askQuestion;

    public AskCards() {
        this.askTitle="Kuch Bhi Bolo";
        this.askQuestion="Kuch Bhi Puch lo?";
    }

    public AskCards(String askTitle, String askQuestion) {
        this.askTitle = askTitle;
        this.askQuestion = askQuestion;
    }

    public String getAskTitle() {
        return askTitle;
    }

    public String getAskQuestion() {
        return askQuestion;
    }
}
