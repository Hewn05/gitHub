package throwable;

import java.util.Scanner;

class IDFormatException extends Exception {
	public IDFormatException(String message) {
		super(message);
	}
}

class UserID {
	private String userID;
	boolean checker = false;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException {
		if (userID == null)
			throw new IDFormatException("ID는 null이면 안됩니다.");
		else if (userID.length() < 8 || userID.length() > 20)
			throw new IDFormatException("ID는 8~20자로 작성가능합니다.");
		this.userID = userID;
		checker = true;
	}
}

public class CusExceptionRun {

	public static void main(String[] args) {
		UserID uid = new UserID();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("ID를 입력해주세요:");
			String userID = sc.next();
			
			try {
				uid.setUserID(userID);
			} catch (IDFormatException e) {
				System.out.println(e.getMessage());
			}
			if(uid.checker == true)
				break;
		}
		sc.close();
	}
}