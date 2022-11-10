package gamelevel;

public class SuperLevel implements PlayerLevelInterface {
	@Override
	public void run() {
		System.out.println("hyper run!!");
	}

	@Override
	public void jump() {
		System.out.println("hyper jump!!");
	}

	@Override
	public void turn() {
		System.out.println("quick turn!!");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("Super Level>>>>>>>>>>>");
	}

	@Override
	public void hack() {
		System.out.print("<<<hack>>>");
	}

	@Override
	public void slash() {
		System.out.print("<>--slash--<>");
	}

}
