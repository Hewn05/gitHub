package game;

import java.io.*;
import java.util.*;

class Player { // 이름, 횟수, 점수를 가지는 클래스
	private String name;
	private int clear;
	private int score;

	Player() { // 입력 타입에 따른 생성자들 기본값은 "AAA",0,0
		name = "AAA";
		clear = 0;
		score = 0;
	}

	Player(String name) {
		this.name = name;
		clear = 0;
		score = 0;
	}

	Player(String name, int clear, int score) {
		this.name = name;
		this.clear = clear;
		this.score = score;
	}

	public void HasClear(int score) { // 게임 승리시 점수 증가
		clear++;
		this.score += score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClear() {
		return clear;
	}

	public int getScore() {
		return score;
	}
}

public class HangedMan {

	File gameFile = new File("src\\game\\game.txt"); // 게임 문제 저장 파일
	File playerFile = new File("src\\game\\user.txt"); // 유저 정보 저장 파일
	private ArrayList<String> qList = new ArrayList<>(); // 문제들 저장하는 리스트
	private ArrayList<String> quizzes = new ArrayList<>();
	private HashMap<String, Player> players = new HashMap<>();
	private ArrayList<String> names = new ArrayList<>();
	private Player p = new Player(); // 현재 플레이하는 유저 객체
	private int hp = 6;
	private int match;
	private char[] wrong = new char[7]; // quiz는 문제 correct는 맞춘것들 wrong은 틀린것들 초기값은 _
	private char[] correct;
	private char[] quiz;

	public HangedMan() { // 파일들을 열고 기본 세팅
		try (BufferedReader gReader = new BufferedReader(new FileReader(gameFile));
				BufferedReader uReader = new BufferedReader(new FileReader(playerFile));) {
			String str;
			while ((str = gReader.readLine()) != null) {
				quizzes.add(str);
				qList.add(str);
			}
			while ((str = uReader.readLine()) != null) {
				String[] split = str.split("/");
				names.add(split[0]);
				players.put(split[0], new Player(split[0], Integer.parseInt(split[1]), Integer.parseInt(split[2])));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void LogIn(String name) { // 회원 이름 검색
		if (names.contains(name)) {
			System.out.println("기존 회원입니다.");
			p = players.get(name);
		} else {
			System.out.println("신규 회원입니다.");
			p.setName(name);
		}
	}

	public void Quiz() { // 문제 선정후 문제 양식 출력
		hp = 6;
		int index = (int) (Math.random() * qList.size());
		quiz = qList.get(index).toCharArray();
		qList.remove(index);
		correct = new char[quiz.length];
		match = 0;
		System.out.println("Length : " + quiz.length);
		System.out.print("Q : ");
		for (int i = 0; i < quiz.length; i++) {
			correct[i] = '_';
			System.out.print(correct[i] + " ");
		}
		System.out.print("\nX : ");
		for (int i = 0; i < wrong.length; i++) {
			wrong[i] = '_';
			System.out.print(wrong[i] + " ");
		}
		System.out.println();
	}

	public void Check(char answer) { // 글자가 맞는지 확인하고 출력
		boolean miss = true;
		System.out.print("Q : ");
		for (int i = 0; i < quiz.length; i++) {
			if (quiz[i] == answer) {
				correct[i] = answer;
				miss = false;
			}
			System.out.print(correct[i] + " ");
		}
		if (miss == true) {
			wrong[6 - (hp--)] = answer;
		}
		int count = 0;
		for (char c : correct) {
			if (c != '_')
				count++;
		}
		match = count;

		System.out.print("\nX : ");
		for (int i = 0; i < wrong.length; i++)
			System.out.print(wrong[i] + " ");
		System.out.println();
	}

	boolean Win() { // 게임 종료 조건 확인
		if (hp < 0) { // 기회 소진으로 패배 정답 출력
			System.out.print("FAILURE\n정답 :  ");
			for (int i = 0; i < quiz.length; i++)
				System.out.print(quiz[i]);
			System.out.println();
			return true;
		}
		if (match == quiz.length) { // 게임 승리 획득한 점수 출력 후 저장
			System.out.print("SUCCESS\n점수 : ");
			int score = (hp * 100) + (quiz.length * 50);
			System.out.println(score);
			p.HasClear(score);
			Record(p);
			return true;
		}
		return false;
	}

	public void Record(Player p) { // 현재 플레이어를 포함한 유저들의 정보 저장
		try (BufferedWriter uWriter = new BufferedWriter(new FileWriter(playerFile))) {
			players.remove(p.getName()); // 중복 제거
			players.put(p.getName(), p);
			Set<String> keyset = players.keySet();
			for (String key : keyset) {
				uWriter.write(key + "/" + players.get(key).getClear() + "/" + players.get(key).getScore() + "\n");
				uWriter.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void Ranking(int num) {
		Player[] rankers = new Player[num];
		System.out.println("=======HIGH SCORE=======");
		for (int i = 0; i < num; i++) {
			rankers[i] = getHigh();
			System.out.printf("%d. %-4s\t %2d번 성공 %6d점\n",i+1,rankers[i].getName(),rankers[i].getClear(),rankers[i].getScore());
			players.remove(rankers[i].getName());
		}
		System.out.println("=======----------=======");
		for (Player r : rankers) {
			players.put(r.getName(), r);
		}
	}

	public Player getHigh() {
		HashMap<Integer, String> rkey = new HashMap<>();
		Set<String> pkeyset = players.keySet();
		for (String key : pkeyset)
			rkey.put(players.get(key).getScore(), key);
		Set<Integer> rkeyset = rkey.keySet();
		int high = 0;
		for (Integer key : rkeyset) {
			if (key > high)
				high = key;
		}
		return players.get(rkey.get(high));
	}
	
	public void NewQuiz(String quiz) { // 추가할 문제 확인 후 파일에 저장
		try (BufferedWriter gWriter = new BufferedWriter(new FileWriter(gameFile))) {
			if (quizzes.contains(quiz)) {
				System.out.println("이미 있는 문제입니다.");
			} else {
				quizzes.add(quiz);
				System.out.println("문제를 추가했습니다.");
			}
			Collections.sort(quizzes);
			for (String str : quizzes) {
				gWriter.write(str + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
