package blackjack;

public class Card {
	int num;
	String pattern;
	String name;

	Card(int patNum, int num) {
		switch(patNum) {
		case 0:
			pattern = "Spade";
			break;
		case 1:
			pattern = "Diamond";
			break;
		case 2:
			pattern = "Heart";
			break;
		case 3:
			pattern = "Clover";
			break;
		}
		
		switch (num) {
		case 1:
			name = "A";
			break;
		case 11:
			name = "J";
			break;
		case 12:
			name = "Q";
			break;
		case 13:
			name = "K";
			break;
		default:
			name = Integer.toString(num);
			break;
		}
		this.num = num;
	}
	
	
}
