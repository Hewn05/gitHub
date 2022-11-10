package game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Run {

	public static void printMenu(String[] options) {
		for (String option : options) {
			System.out.println(option);
		}
		System.out.print("Choose your option : ");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HangedMan hang = new HangedMan();
		char answer;
		String[] options = { "1- 게임시작", "2- 로그인", "3- 랭킹", "4- 문제추가", "5- 나가기" };
		int option = 0;
		while (option != 5) {
			printMenu(options);
			try {
				option = sc.nextInt();
			} catch (InputMismatchException ex) {
				System.out.println("Please enter an integer value between 1 and " + options.length);
				sc.next();
			} catch (Exception ex) {
				System.out.println("An unexpected error happened. Please try again");
				sc.next();
			}
			if (option == 1) {
				hang.Quiz();
				while (!hang.Win()) {
					System.out.print("? : ");
					answer = sc.next().charAt(0);
					if (answer == '-')
						break;
					while (answer < 97 || answer > 122) {
						System.out.print("잘못된 입력값입니다.\n? : ");
						answer = sc.next().charAt(0);
					}
					hang.Check(answer);
				}
			} else if (option == 2) {
				System.out.print("이름을 입력해주세요 : ");
				String name = sc.next();
				hang.LogIn(name);
			} else if (option == 3) {
				hang.Ranking(3);
			} else if (option == 4){
				System.out.print("추가할 문제를 입력해주세요 : ");
				String quiz = sc.next();
				hang.NewQuiz(quiz);
			}
			;
		}
		sc.close();

	}
}
