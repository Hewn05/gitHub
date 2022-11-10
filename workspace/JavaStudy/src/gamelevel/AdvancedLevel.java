package gamelevel;

public class AdvancedLevel implements PlayerLevelInterface{
	@Override
	public void run() {
		System.out.println("run!");
	}

	@Override
	public void jump() {
		System.out.println("jump!");
	}

	@Override
	public void turn() {
		System.out.println("turn!");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("Advenced Level>>>>>>>>>>>");
	}

	@Override
	public void hack() {
		System.out.print("*hack^&*>>>");
	}

	@Override
	public void slash() {
		System.out.print("~slash--<>>>");
	}
}
