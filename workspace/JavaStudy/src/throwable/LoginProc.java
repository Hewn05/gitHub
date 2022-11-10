package throwable;

class NoExistIDException extends Exception {
	public NoExistIDException() {
	}

	public NoExistIDException(String msg) {
		super(msg);
	}
}

class WrongPasswordException extends Exception {
	public WrongPasswordException() {
	}

	public WrongPasswordException(String msg) {
		super(msg);
	}
}

public class LoginProc {

	public static void main(String[] args) {
		try {
			login1("apple", "1234");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			login1("css", "4567");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void login1(String id, String pw) throws Exception {
		String[] idArr = { "ajax", "java", "script", "css" };
		String[] pwArr = { "1234", "2345", "3456", "4567" };
		for (int i = 0; i < idArr.length; i++) {
			if (idArr[i].equals(id)) {
				if (pwArr[i].equals(pw)) {
					System.out.println("로그인 완료");
					break;
				}
				throw new WrongPasswordException("패스워드가 다릅니다.");
			}
			if (i == idArr.length - 1)
				throw new NoExistIDException("아이디가 존재하지 않습니다.");
		}
	}

	public static void login(String id, String pw) throws Exception {
		String oID = "java";
		String oPW = "1234";

		if (!oID.equals(id)) {
			throw new NoExistIDException("아이디가 존재하지 않습니다.");
		} else {
			if (!oPW.equals(pw)) {
				throw new WrongPasswordException("패스워드가 다릅니다.");
			} else {
				System.out.println("로그인 완료.");
			}
		}
	}
}
