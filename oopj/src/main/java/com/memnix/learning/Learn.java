package com.memnix.learning;

import com.memnix.deck.Deck;
import com.memnix.user.User;

import java.util.ArrayList;

public class Learn {

    private User user;

    private Deck deck;

    private ArrayList<LearnCard> learnCards;

    public Learn(User user, Deck deck) {
        this.user = user;
        this.deck = deck;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public ArrayList<LearnCard> getLearnCards() {
        return learnCards;
    }

    public void setLearnCards(ArrayList<LearnCard> learnCards) {
        this.learnCards = learnCards;
    }
}
