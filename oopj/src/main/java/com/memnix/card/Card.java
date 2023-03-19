package com.memnix.card;

public abstract class Card {

    private final long cardId;
    private final String question;
    private final String answer;

    protected Card(long cardId, String question, String answer) {
        this.cardId = cardId;
        this.question = question;
        this.answer = answer;
    }

    public long getCardId() {
        return cardId;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return "Card{" + "CardId=" + cardId + ", Question=" + question + ", Answer=" + answer + '}';
    }

}
