package abstractPrac;

public class ComTest {

	public static void main(String[] args) {
//		Computer com = new Computer();
		// 익명클래스로 추상클래스 객체 생성
		Computer com = new Computer() {
			public void typing() {
				System.out.println("dd");
			}
		};
		com.typing();
		Computer c2 = new Computer() {
			public void typing() {
				System.out.println("ff");
			}
		};
		c2.typing();
		Computer c3 = new Computer() {
			public void typing() {
				System.out.println("aa");
			}
		};
		c3.typing();
		// 자식클래스 생성하면서 추상클래스 생성
		Computer computer = new Desktop();
		computer.display();
		computer.typing();
		computer.turnOn();
		computer.turnOff();
		
		Computer com2 = new PortableNoteBook();
		NoteBook com3 = new PortableNoteBook();
		com2.display();
		com3.display();
		com2.typing();
		com3.typing();

	}

}
