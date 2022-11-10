package gamelevel;

public class Player {
	private PlayerLevelInterface level;

	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
		System.out.println();
	}

	public PlayerLevelInterface getLevel() {
		return level;
	}

	public void upgradeLevel() {
		if (level instanceof BeginnerLevel)
			level = new AdvancedLevel();
		else if (level instanceof AdvancedLevel)
			level = new SuperLevel();
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
