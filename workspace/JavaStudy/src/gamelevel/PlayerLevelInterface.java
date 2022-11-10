package gamelevel;

public interface PlayerLevelInterface {
	void run();

	void jump();

	void turn();

	void showLevelMessage();

	void hack();

	void slash();

	default void go(int count) {
		run();
		jump();
		for (int i = 0; i < count; i++) {
			hack();
			slash();
			System.out.println();
		}
		turn();
	}

}
