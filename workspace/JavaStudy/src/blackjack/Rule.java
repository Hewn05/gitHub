package blackjack;

public class Rule {

	public static int checkScore(Gamer gamer) {
		int score = 0;
		for(int i = 0;i < gamer.cards.size();i++) {
			score += gamer.cards.get(i).num;
		}
		
		return score;
	}
	
	public static void checkWin(Gamer g1, Gamer g2) {
		int score1 = 0;
		int score2 = 0;		
		
		score1 = checkScore(g1);
		score2 = checkScore(g2);
				
		if(score1 == score2 || (score1 > 21 && score2 > 21)) {
			System.out.println("무승부");
		}else if(score1 > score2 && score1 < 21) {
			System.out.println(g1.name + " 승리");
		}else if(score2 > score1 && score2 < 21) {
			System.out.println(g2.name + " 승리");
		}else
			System.out.println("무승부");
	}
	
}
