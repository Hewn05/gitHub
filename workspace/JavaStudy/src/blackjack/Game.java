package blackjack;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		Gamer dealer = new Gamer("dealer");
		Gamer gamer = new Gamer("gamer");
		Deck deck = new Deck();

		gamer.drawCard(deck.draw());
		gamer.drawCard(deck.draw());
		dealer.drawCard(deck.draw());
		dealer.drawCard(deck.draw());
		gamer.showCard();
		dealer.showCard();

		while (gamer.end == false || dealer.end == false) {
			System.out.print("카드를 뽑으시겠습니까? (y/n) ");
			s = sc.next();
			if (gamer.end == false) {
				if (!s.equals("y") && !s.equals("n")) {
					System.out.println("잘못된 입력값입니다.");
					continue;
				}
				if (s.equals("n")) {
					gamer.end = true;
				} else if (s.equals("y")) {
					gamer.drawCard(deck.draw());
					gamer.showCard();
				}
			}
			if (dealer.end == false) {
				if (Rule.checkScore(dealer) < 16) {
					dealer.drawCard(deck.draw());
					dealer.showCard();
				} else {
					dealer.end = true;
				}
			}

		}
		Rule.checkWin(gamer, dealer);
	}
}
