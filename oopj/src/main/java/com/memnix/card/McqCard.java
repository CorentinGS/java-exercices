package com.memnix.card;

import java.util.ArrayList;

public class McqCard extends Card {

    private ArrayList<String> options;

    public McqCard(long cardId, String question, String answer, ArrayList<String> options) {
        super(cardId, question, answer);
        this.options = options;
    }

    public McqCard(long cardId, String question, String answer) {
        super(cardId, question, answer);
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "Card{" + "CardId=" + getCardId() + ", Question=" + getQuestion() + ", Answer=" + getAnswer() + '}';
    }
}
