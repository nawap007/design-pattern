package com.cards;

import java.util.ArrayList;

public class Deck<T extends Card> {
	private ArrayList<T> cards; // all cards, dealt or not
	private int dealtlndex = 0; // marks first undealt card

	public void setDeckOfCards(ArrayList<T> deckOfCards) {
	}

	public void shuffle() {
	}

	public int remainingCards() {
		return cards.size() - dealtlndex;
	}

	public T[] dealHand(int number) {
		return null;
	}

	public T dealCard() {
		return null;
	}
}
