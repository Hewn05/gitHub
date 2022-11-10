package array;

public class BookArray {

	public static void main(String[] args) {

		Book bo = new Book();
		bo.setBookName("자바 완전 정복");
		bo.setAuthor("김동형");
		bo.printBookInfo();

		Book[] lib = new Book[5];
		lib[0] = new Book("악의", "히가시노게이고");
		lib[1] = new Book("둘 중 누군가 그녀를 죽였다", "히가시노게이고");
		lib[2] = new Book("내가 그를 죽였다", "히가시노게이고");
		lib[3] = new Book("범인없는 살인의 밤", "히가시노게이고");
		lib[4] = new Book("용의자 X의 헌신", "히가시노게이고");

		for (int i = 0; i < lib.length; i++) {
			System.out.println(i + " " + lib[i]);
		}

		for (int i = 0; i < lib.length; i++) {
			System.out.println(lib[i].getBookName() + "\t by  " + lib[i].getAuthor());
		}

		for (int i = 0; i < lib.length; i++) {
			lib[i].printBookInfo();
		}
	}
}
