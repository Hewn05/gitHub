package blackjack;

import java.util.ArrayList;

public class Gamer {
	public String name;
	public ArrayList<Card> cards = new ArrayList<>();
	public boolean end;

	public Gamer(String name) {
		this.name = name;
		end = false;
	}

	public void drawCard(Card c) {
		cards.add(c);
	}

	public void showCard() {
		System.out.print(name + "\t||");
		for (int i = 0; i < cards.size(); i++) {
			System.out.print("   " + cards.get(i).pattern + " " + cards.get(i).name + "\t|");
		}
		System.out.println();
	}

}
