package com.memnix.deck;


import com.memnix.card.Card;

import java.util.HashSet;
import java.util.Set;

public class Deck {

    private final long deckId;

    private final String deckName;

    private HashSet<Card> cards;

    public Deck(long deckId, String deckName) {
        this.deckId = deckId;
        this.deckName = deckName;
    }

    public long getDeckId() {
        return deckId;
    }

    public String getDeckName() {
        return deckName;
    }

    public Set<Card> getCards() {
        return cards;
    }

    public Card findCard(long cardId) {
        for (Card card : cards) {
            if (card.getCardId() == cardId) {
                return card;
            }
        }

        return null;
    }


}
