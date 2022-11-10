package blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	ArrayList<Card> deck = new ArrayList<>(52);
	static int amount = 52;

	public Deck() {
		initDeck();
	}

	private void initDeck() {
		for (int i = 0; i < 13; i++)
			for (int j = 0; j < 4; j++)
				deck.add(new Card(j, (i + 1)));
	}

	public Card draw() {
		int index = 0;
		index = (int) (Math.random() * amount--);
		return deck.remove(index);
	}
}
