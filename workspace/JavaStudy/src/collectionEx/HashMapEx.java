package collectionEx;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class PersonInfo {
	private String tel;
	private String address;

	public PersonInfo(String tel, String address) {
		this.tel = tel;
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public String getAddress() {
		return address;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String, PersonInfo> hmap = new HashMap<>();

		hmap.put("인순이", new PersonInfo("010-1111-1111", "서울"));
		hmap.put("권보아", new PersonInfo("010-2222-2222", "대전"));
		hmap.put("이보람", new PersonInfo("010-3333-3333", "대구"));

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1--이름\t2--전화번호");
			int key = sc.nextInt();
			if (key == 1) {
				System.out.print("검색대상:");
				String input = sc.next();
				if (input.equals("exit")) {
					System.out.println("\t검색종료");
					break;
				}

				if (hmap.containsKey(input)) {
					System.out.printf("||이름:%s||번호:%s||주소:%s||\n", input, hmap.get(input).getTel(),
							hmap.get(input).getAddress());
				} else {
					System.out.println("없는사람입니다.");
				}

			} else if (key == 2) {
				System.out.print("검색대상:");
				String input = sc.next();
				if (input.equals("exit")) {
					System.out.println("\t검색종료");
					break;
				}
				Set<Entry<String, PersonInfo>> entrySet = hmap.entrySet();
				String[] temp;
				int sizeCheck = entrySet.size();
				for (Entry<String, PersonInfo> entry : entrySet) {
					temp = entry.getValue().getTel().split("-");
					String temp2 = temp[0] + temp[1] + temp[2];
					if (temp2.contains(input)) {
						System.out.printf("||이름:%s||번호:%s||주소:%s||\n", entry.getKey(), entry.getValue().getTel(),
								entry.getValue().getAddress());
					} else
						sizeCheck--;
					if (sizeCheck == 0)
						System.out.println("없어요");
				}
			} else
				System.out.println("다시입력해주세요.");

		}
	}

}
