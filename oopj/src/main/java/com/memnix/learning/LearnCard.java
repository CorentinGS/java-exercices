package com.memnix.learning;

import com.memnix.card.Card;

public class LearnCard {

    private final Card card;

    private final boolean isCorrect;

    private final int interval;

    private final int repetition;

    private final int easinessFactor;

    public LearnCard(Card card) {
        this.card = card;
        this.isCorrect = false;
        this.interval = 0;
        this.repetition = 0;
        this.easinessFactor = 0;
    }

    public Card getCard() {
        return card;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public int getInterval() {
        return interval;
    }


    public int getRepetition() {
        return repetition;
    }

    public int getEasinessFactor() {
        return easinessFactor;
    }


}
